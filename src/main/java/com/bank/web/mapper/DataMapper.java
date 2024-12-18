package com.bank.web.mapper;

import com.bank.model.Data;
import com.bank.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper
        extends Mappable<Data, DataDto> {

}
