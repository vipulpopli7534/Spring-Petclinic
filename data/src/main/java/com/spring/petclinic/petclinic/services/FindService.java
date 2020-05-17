package com.spring.petclinic.petclinic.services;

import java.util.Optional;
import java.util.Set;

public interface FindService<T> {
    T findById(Long id);

    Set<T> findAll();

    default Optional<T> findByName(String name){
        return Optional.empty();
    }
}
