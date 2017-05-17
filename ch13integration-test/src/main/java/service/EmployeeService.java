package service;

import domain.Employee;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public interface EmployeeService {
    Employee getHighestPaidEmployee(int employeeCategory);
}
