package com.abdullah.EmployeeDatabase;

import com.abdullah.Employee.EmployeeBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 3/21/17.
 */
@Component
public interface EmployeeDAO
{
    public void insertEmployees(EmployeeBean employeeBeans);
    public List<EmployeeBean> ListOfEmployees();
}
