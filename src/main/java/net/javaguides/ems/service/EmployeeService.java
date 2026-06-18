package net.javaguides.ems.service;

import net.javaguides.ems.entity.Employee;

public interface  EmployeeService {

    Employee createEmployee(Employee employee);

    Employee updateEmployee (Long employeeId, Employee updatedEmployee);
}
