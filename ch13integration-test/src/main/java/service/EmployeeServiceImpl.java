package service;

import domain.Employee;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
@Service
@ComponentScan
public class EmployeeServiceImpl implements EmployeeService {
    public Employee getHighestPaidEmployee(int employeeCategory) {
        switch (employeeCategory) {
            case 1:
                return new Employee("Alicia Coder", new BigDecimal(123_000));
            case 2:
                return new Employee("Xiao Ming", new BigDecimal(200_000));
            default:
                return new Employee("Jay Boss", new BigDecimal(400_000));
        }
    }
}
