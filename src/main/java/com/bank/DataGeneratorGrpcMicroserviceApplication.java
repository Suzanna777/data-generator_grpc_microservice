package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataGeneratorGrpcMicroserviceApplication {

    public static void main(String[] args) {
     //   Dotenv dotenv = Dotenv.configure().load();
     //   System.setProperty("GRPC_HOST", dotenv.get("GRPC_HOST", "localhost:50051"));
     //   System.setProperty("BATCH_SIZE", dotenv.get("BATCH_SIZE", "100"));

        SpringApplication.run(DataGeneratorGrpcMicroserviceApplication.class, args);
    }
}