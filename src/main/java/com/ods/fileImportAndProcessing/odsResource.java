package com.ods.fileImportAndProcessing;

import com.ods.fileImportAndProcessing.model.ODS;
import com.ods.fileImportAndProcessing.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class odsResource {
    private final EmployeeService employeeService;

    public odsResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ODS>> getAllEmployees () {
        List<ODS> ODS = employeeService.findAllEmployees();
        return new ResponseEntity<>(ODS, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ODS> getEmployeeById (@PathVariable("id") Long id) {
        ODS ODS = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(ODS, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ODS> addEmployee(@RequestBody ODS ODS) {
        ODS newODS = employeeService.addEmployee(ODS);
        return new ResponseEntity<>(newODS, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ODS> updateEmployee(@RequestBody ODS ODS) {
        ODS updateODS = employeeService.updateEmployee(ODS);
        return new ResponseEntity<>(updateODS, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}