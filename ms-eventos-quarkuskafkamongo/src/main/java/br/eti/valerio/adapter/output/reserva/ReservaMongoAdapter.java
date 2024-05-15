package br.eti.valerio.adapter.output.reserva;

import br.eti.valerio.adapter.output.mongo.ReservaRepository;
import br.eti.valerio.application.ports.out.ReservaPort;
import br.eti.valerio.coredomain.entity.Reserva;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ReservaMongoAdapter implements ReservaPort {

    @Inject
    private ReservaRepository reservaRepository;

    @Override
    public Reserva salvarReserva(Reserva reserva) {
        reservaRepository.persist(reserva);
        return reserva;
    }

    @Override
    public Reserva buscarReserva(String id) {
        var reserva = reservaRepository.find("_id", Long.valueOf(id)).firstResult();
        return reserva;
    }
}
