package ar.edu.unnoba.poo2023.config;

import ar.edu.unnoba.poo2023.dao.ClientDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public ClientDAO getClientDAO(){
        return new ClientDAO();
    }
}