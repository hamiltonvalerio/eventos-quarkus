package br.eti.valerio.application.ports.out;


import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.coredomain.entity.Reserva;

public interface ReservaPort {
    Reserva salvarReserva(Reserva reserva);

    ReservaDTO buscarReserva(String id);
}
