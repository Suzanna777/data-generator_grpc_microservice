package com.bank.web.controler;

import com.bank.model.Data;
import com.bank.model.test.DataTestOptions;
import com.bank.service.GRPCDataService;
import com.bank.service.TestDataService;
import com.bank.web.dto.DataDto;
import com.bank.web.dto.DataTestOptionsDto;
import com.bank.web.mapper.DataMapper;
import com.bank.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final GRPCDataService grpcDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto){
        Data data = dataMapper.toEntity(dataDto);
        grpcDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto){
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);

    }


}
