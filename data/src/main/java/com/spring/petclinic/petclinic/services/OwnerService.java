package com.spring.petclinic.petclinic.services;

import com.spring.petclinic.petclinic.model.Owner;

import java.util.Optional;

public interface OwnerService extends FindService<Owner> {
     Owner findByName(String name) throws Exception;
}
