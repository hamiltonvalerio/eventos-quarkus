package br.eti.valerio.adapter.input.controller;

import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.application.ports.in.ReservaUseCasePort;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/reserva")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReservaMongoController {

    @Inject
    private ReservaUseCasePort reservaUseCasePort;

    @POST
    @Path("/salvar")
    public ReservaDTO criarReserva(ReservaDTO reservaDTO) {
        ReservaDTO dto = reservaUseCasePort.salvarReserva(reservaDTO);
        return dto;
    }

    @GET
    @Path("/buscar/{id}")
    public ReservaDTO buscarReserva(String id) {
        ReservaDTO dto = reservaUseCasePort.buscarReserva(id);
        return dto;
    }
}
