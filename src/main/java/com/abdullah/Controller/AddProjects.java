package com.abdullah.Controller;

import com.abdullah.Project.ProjectBean;
import com.abdullah.ProjectDatabase.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abdullah on 4/16/17.
 */
@Controller
public class AddProjects
{
    @Autowired
    ProjectDetails emp;
    @RequestMapping(value="/add-project")
    public ModelAndView processAddProjects(@ModelAttribute ProjectBean projectBean)
    {

        ModelAndView model= null;
        try
        {
            if(projectBean.getProjectName()!=""&&projectBean.getProjectClient()!=""&& projectBean.getProjectManager()!=""&&projectBean.getProjectDeadLine()!=""&&projectBean.getProjectStatus()!="")
            {
                emp.registerProjects(projectBean.getProjectName(),projectBean.getProjectClient(), projectBean.getProjectManager(),projectBean.getProjectDeadLine(),projectBean.getProjectStatus());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("Projects");
            }



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}

