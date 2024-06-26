package br.eti.valerio.adapter.input.mapper;


import br.eti.valerio.adapter.input.dto.ReservaDTO;
import br.eti.valerio.coredomain.entity.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapperReserva {
    MapperReserva INSTANCE = Mappers.getMapper(MapperReserva.class);

    Reserva toReserva(ReservaDTO reservaDTO);
    ReservaDTO toReservaDTO(Reserva reserva);
}
