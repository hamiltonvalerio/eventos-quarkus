package br.eti.valerio.application.ports.out;


import br.eti.valerio.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);

    Reserva buscarReserva(String id);
}
