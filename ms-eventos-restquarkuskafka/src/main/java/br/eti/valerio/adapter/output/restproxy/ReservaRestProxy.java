package br.eti.valerio.adapter.output.restproxy;

import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.coredomain.entity.Reserva;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/reserva")
@RegisterRestClient(baseUri = "http://localhost:8081")
public interface ReservaRestProxy {

    @POST
    @Path("/salvar")
    Reserva salvarReserva(Reserva reserva);

    @GET
    @Path("/buscar/{id}")
    ReservaDTO buscarReserva(@PathParam("id") String id);

}
