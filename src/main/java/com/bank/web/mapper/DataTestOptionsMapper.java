package com.bank.web.mapper;

import com.bank.model.test.DataTestOptions;
import com.bank.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {

}
