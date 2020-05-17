package com.spring.petclinic.petclinic.services.map;

import com.spring.petclinic.petclinic.services.FindService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T> implements FindService<T> {
    Map<Long, T> map = new HashMap<>();

    @Override
    public T findById(Long id) {
        return this.map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    @Override
    public T save(Long id ,T object) {
        return map.put(id, object);
    }

    @Override
    public boolean delete(T object) {
        return map.values().removeIf(obj -> obj.equals(object));
    }

    @Override
    public boolean deleteById(Long id) {
        if(map.containsKey(id)){
            map.remove(id);
            return true;
        }
        return false;
    }
}
