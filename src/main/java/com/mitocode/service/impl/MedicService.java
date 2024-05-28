package com.mitocode.service.impl;

import com.mitocode.model.Medic;
import com.mitocode.repository.IGenericRepo;
import com.mitocode.repository.IMedicRepo;
import com.mitocode.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicService extends CRUDImpl<Medic, Integer> implements IMedicService {

    private final IMedicRepo repository;

    @Override
    protected IGenericRepo<Medic, Integer> getRepo() {
        return repository;
    }

    /*@Override
    public Medic save(Medic medic) {
        return repository.save(medic);
    }

    @Override
    public Medic update(Integer id, Medic medic) {
        return null;
    }

    @Override
    public List<Medic> findAll() {
        return List.of();
    }

    @Override
    public Medic findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }*/
}
