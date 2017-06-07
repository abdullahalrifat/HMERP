package com.abdullah.Controller;

import com.abdullah.CustomerListDataBase.CustomerDetails;
import com.abdullah.CustomersList.CustomersListBean;
import com.abdullah.Employee.EmployeeBean;
import com.abdullah.EmployeeDatabase.EmployeeDetails;
import com.abdullah.Project.ProjectBean;
import com.abdullah.ProjectDatabase.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by abdullah on 1/31/17.
 */

@Controller
public class Home
{
    @RequestMapping(value="/index")
    public ModelAndView processIndex()
    {
        ModelAndView model= null;
        try
        {
                model = new ModelAndView("Home");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/elements")
    public ModelAndView processElements()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Elements");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/charts")
    public ModelAndView processCharts()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Charts");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/panels")
    public ModelAndView processPanels()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Panels");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/notifications")
    public ModelAndView processNotifications()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Notifications");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-profile")
    public ModelAndView processPageProfile()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-Profile");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-login")
    public ModelAndView processPageLogin()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Login-Page");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-lockscreen")
    public ModelAndView processPageLockscreen()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-LockScreen");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/tables")
    public ModelAndView processTables()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Tables");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/typography")
    public ModelAndView processTypography()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Typography");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/icons")
    public ModelAndView processIcons()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Icons");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    //own added
    @Autowired
    EmployeeDetails emp;
    @RequestMapping(value="/employees")
    public ModelAndView processEmployees()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Employees");

            List<EmployeeBean> employeeList = emp.getList();


             //checking if reading the databse
           // System.out.println(employeeList.get(0).getName());

            model.addObject("employeeList",employeeList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/Addemployees")
    public ModelAndView processAddEmployees()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddEmployees","register-Employee-entity",new EmployeeBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    //own added
    @Autowired
    ProjectDetails pmps;
    @RequestMapping(value="/projects")
    public ModelAndView processProject()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Projects");

            List<ProjectBean> projectList = pmps.getList();


            //checking if reading the databse
             //System.out.println(projectList.get(0).getProjectName());

            model.addObject("projectList",projectList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    CustomerDetails cumdet;
    @RequestMapping(value="/CustomersList")
    public ModelAndView processCustomers()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("CustomersList");

            List<CustomersListBean> customerList = cumdet.getList();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("customerList",customerList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddCustomers")
    public ModelAndView processAddCustomers()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddCustomers","register-Customers-entity",new CustomersListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
/*
    @RequestMapping(value="/projects")
    public ModelAndView processProjects()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Projects");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }*/
}
