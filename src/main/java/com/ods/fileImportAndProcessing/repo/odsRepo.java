package com.ods.fileImportAndProcessing.repo;

import com.ods.fileImportAndProcessing.model.ODS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface odsRepo extends JpaRepository<ODS, Long> {
    void deleteEmployeeById(Long id);

    Optional<ODS> findEmployeeById(Long id);
}