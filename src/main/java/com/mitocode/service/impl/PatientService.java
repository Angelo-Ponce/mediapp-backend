package com.mitocode.service.impl;

import com.mitocode.model.Patient;
import com.mitocode.repository.IGenericRepo;
import com.mitocode.repository.IPatientRepo;
import com.mitocode.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService extends CRUDImpl<Patient, Integer> implements IPatientService {

    private final IPatientRepo repository;

    @Override
    protected IGenericRepo<Patient, Integer> getRepo() {
        return repository;
    }

    /*@Override
    public Patient save(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient update(Integer id, Patient patient) {
        return null;
    }

    @Override
    public List<Patient> findAll() {
        return List.of();
    }

    @Override
    public Patient findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }*/
}
