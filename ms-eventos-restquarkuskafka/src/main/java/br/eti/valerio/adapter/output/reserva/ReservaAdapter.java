package br.eti.valerio.adapter.output.reserva;


import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.adapter.output.restproxy.ReservaRestProxy;
import br.eti.valerio.application.ports.out.ReservaPort;
import br.eti.valerio.coredomain.entity.Reserva;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ReservaAdapter implements ReservaPort {

    @Inject
    @RestClient
    ReservaRestProxy reservaRestProxy;

    @Override
    public Reserva salvarReserva(Reserva reserva) {
        return reservaRestProxy.salvarReserva(reserva);
    }

    @Override
    public ReservaDTO buscarReserva(String id) {
        return reservaRestProxy.buscarReserva(id);
    }
}
