package com.sguessou.sgpetclinicdata.services;

import com.sguessou.sgpetclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
