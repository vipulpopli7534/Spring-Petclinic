package com.spring.petclinic.petclinic.config;

import com.spring.petclinic.petclinic.services.OwnerService;
import com.spring.petclinic.petclinic.services.PetService;
import com.spring.petclinic.petclinic.services.VetService;
import com.spring.petclinic.petclinic.services.map.OwnerMapService;
import com.spring.petclinic.petclinic.services.map.PetMapService;
import com.spring.petclinic.petclinic.services.map.VetMapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetclinicConfig {
    @Bean
    public VetService vetService(){
        return new VetMapService();
    }

    @Bean
    public OwnerService ownerService(){
        return new OwnerMapService();
    }
}
