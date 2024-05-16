package br.eti.valerio.infra.kafka.reserva;

import br.eti.valerio.adapter.output.kafka.consumer.ReservaConsumer;
import br.eti.valerio.adapter.output.mongo.ReservaRepository;
import br.eti.valerio.coredomain.entity.Reserva;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class ReservaConsumerImpl implements ReservaConsumer {

    @Inject
    private ReservaRepository reservaRepository;

    private static final String RESERVADO = "RESERVADO";

    @Override
    @Incoming("reserva-kafka-topic")
    public void consumeReserva(String reservaId) {
        System.out.println("Consumindo reserva: " + reservaId);
        Reserva reserva = reservaRepository.find("_id", Long.valueOf(reservaId)).firstResult();
        if(reserva != null) {
            reserva.setStatus(RESERVADO);
            reservaRepository.persistOrUpdate(reserva);
        }
    }
}
