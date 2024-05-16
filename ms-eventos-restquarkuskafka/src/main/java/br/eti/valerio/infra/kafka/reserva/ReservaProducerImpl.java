package br.eti.valerio.infra.kafka.reserva;

import br.eti.valerio.application.ports.in.ReservaProducer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class ReservaProducerImpl implements ReservaProducer {

    @Inject
    @Channel("reserva-kafka-topic")
    Emitter<String> idEmitter;


    @Override
    public void sendReserva(Long id) {
        idEmitter.send(id.toString());
    }
}
