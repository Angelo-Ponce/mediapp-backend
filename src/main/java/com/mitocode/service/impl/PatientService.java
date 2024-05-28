package com.mitocode.service.impl;

import com.mitocode.model.Patient;
import com.mitocode.repository.IPatientRepository;
import com.mitocode.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {

    private final IPatientRepository repository;

    @Override
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

    }
}
