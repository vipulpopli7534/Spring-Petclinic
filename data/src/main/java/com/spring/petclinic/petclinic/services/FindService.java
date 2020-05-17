package com.spring.petclinic.petclinic.services;

import java.util.Optional;
import java.util.Set;

public interface FindService<T> {
    T findById(Long id);

    Set<T> findAll();

    T save(Long id, T object);

    boolean delete(T object);

    boolean deleteById(Long id);

}
