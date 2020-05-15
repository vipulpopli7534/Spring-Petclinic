package com.spring.petclinic.petclinic;

import com.spring.petclinic.petclinic.model.Person;
import com.spring.petclinic.petclinic.model.Vet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
		Person person = new Person();
	}

}
