package com.bank.model.test;

import com.bank.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {
    private int delayInSecond;
    private Data.MeasurementType[] measurementTypes;
}
