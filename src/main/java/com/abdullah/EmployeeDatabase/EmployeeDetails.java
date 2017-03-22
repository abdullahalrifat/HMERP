package com.abdullah.EmployeeDatabase;

import com.abdullah.Employee.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 3/21/17.
 */
@Component
public class EmployeeDetails
{
    @Autowired
    private EmployeeDAO employeeDAO;
    public List<EmployeeBean> getList()
    {

        List<EmployeeBean> listUser=employeeDAO.ListOfEmployees();
        return listUser;
    }
    public void registerEmployee(String Name,String Phone,String Address,String Position)
    {
        List<EmployeeBean> listUser=employeeDAO.ListOfEmployees();
        int size=listUser.size();
        EmployeeBean loginBean=new EmployeeBean(size+1,Name,Phone,Address,Position);
        employeeDAO.insertEmployees(loginBean);
    }
}
