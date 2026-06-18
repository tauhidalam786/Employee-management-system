package net.javaguides.ems.service;

import net.javaguides.ems.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import net.javaguides.ems.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {

        Employee employee = employeeRepository.findById(employeeId).get();

        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());

        return employeeRepository.save(employee);
    }

}

