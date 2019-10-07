package com.sguessou.sgpetclinicdata.services;

import com.sguessou.sgpetclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
