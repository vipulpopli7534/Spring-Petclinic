package com.spring.petclinic.petclinic.services.map;

import com.spring.petclinic.petclinic.model.Owner;
import com.spring.petclinic.petclinic.services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {
    @Override
    public Owner findByName(String name) throws Exception {
         return super.map.values().stream().filter(owner -> name.equalsIgnoreCase(owner.getFirstName() + owner.getLastName()))
                 .findFirst().orElseThrow(() -> new Exception("No Owner present with name " + name));
    }

}
