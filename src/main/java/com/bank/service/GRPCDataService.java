package com.bank.service;

import com.bank.model.Data;

import java.util.List;

public interface GRPCDataService {

    void send(Data data);
    void send(List<Data> data);
}
