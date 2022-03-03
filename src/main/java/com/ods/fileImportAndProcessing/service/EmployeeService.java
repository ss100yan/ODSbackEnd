package com.ods.fileImportAndProcessing.service;

import com.ods.fileImportAndProcessing.model.ODS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ods.fileImportAndProcessing.repo.odsRepo;
import com.ods.fileImportAndProcessing.exception.UserNotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final odsRepo odsRepo;

    @Autowired
    public EmployeeService(odsRepo odsRepo) {
        this.odsRepo = odsRepo;
    }

    public ODS addEmployee(ODS ODS) {
        ODS.setEmployeeCode(UUID.randomUUID().toString());
        return odsRepo.save(ODS);
    }

    public List<ODS> findAllEmployees() {
        return odsRepo.findAll();
    }

    public ODS updateEmployee(ODS ODS) {
        return odsRepo.save(ODS);
    }

    public ODS findEmployeeById(Long id) {
        return odsRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id){
        odsRepo.deleteEmployeeById(id);
    }
}