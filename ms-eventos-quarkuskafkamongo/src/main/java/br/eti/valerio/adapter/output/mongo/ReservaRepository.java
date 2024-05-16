package br.eti.valerio.adapter.output.mongo;

import br.eti.valerio.coredomain.entity.Reserva;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ReservaRepository implements PanacheMongoRepository<Reserva> {
}
