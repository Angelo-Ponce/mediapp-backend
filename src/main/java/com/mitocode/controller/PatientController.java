package com.mitocode.controller;

import com.mitocode.service.IPatientService;
import com.mitocode.service.impl.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${patient.controller.path}")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService service;
}
