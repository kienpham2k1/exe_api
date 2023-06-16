package com.example.exe;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "EXE Api application",
                version = "1.0.0"
        )
)
public class ExeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExeApplication.class, args);
    }

}
