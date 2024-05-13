package br.eti.valerio.coredomain.usecase;

import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.adapter.input.mapper.MapperReserva;
import br.eti.valerio.application.ports.in.ReservaUseCasePort;
import br.eti.valerio.application.ports.out.ReservaPort;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReservaUseCasePortImpl implements ReservaUseCasePort {

    private final ReservaPort reservaPort;

    private static final String PENDENTE_DE_PAGAMENTO = "PENDENTE DE PAGAMENTO";

    public ReservaUseCasePortImpl(ReservaPort reservaPort) {
        this.reservaPort = reservaPort;
    }

    @Override
    public ReservaDTO salvarReserva(ReservaDTO reservaDTO) {
        reservaDTO.setStatus(PENDENTE_DE_PAGAMENTO);
        var reserva = reservaPort.salvarReserva(MapperReserva.INSTANCE.toReserva(reservaDTO));
        return MapperReserva.INSTANCE.toReservaDTO(reserva);
    }

    @Override
    public ReservaDTO buscarReserva(String id) {
        return reservaPort.buscarReserva(id);
    }

    @Override
    public void deletarReserva(String id) {

    }

    @Override
    public ReservaDTO atualizarReserva(ReservaDTO reservaDTO) {
        return null;
    }


}
