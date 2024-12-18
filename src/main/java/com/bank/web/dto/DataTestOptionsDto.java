package com.bank.web.dto;

import com.bank.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {
    private int delayInSecond;
    private Data.MeasurementType[] measurementTypes;
}
