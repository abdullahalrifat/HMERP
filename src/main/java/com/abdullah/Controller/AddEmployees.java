package com.abdullah.Controller;

import com.abdullah.Employee.EmployeeBean;
import com.abdullah.EmployeeDatabase.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abdullah on 3/23/17.
 */
@Controller
public class AddEmployees
{
    @Autowired
    EmployeeDetails emp;
    @RequestMapping(value="/add-employees")
    public ModelAndView processPersonRegister(@ModelAttribute EmployeeBean employeeBean)
    {

        ModelAndView model= null;
        try
        {
            if(employeeBean.getName()!=""&&employeeBean.getPhone()!=""&& employeeBean.getAddress()!=""&&employeeBean.getPosition()!="")
            {
                emp.registerEmployee(employeeBean.getName(),employeeBean.getPhone(), employeeBean.getAddress(),employeeBean.getPosition());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddEmployees");
            }



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
