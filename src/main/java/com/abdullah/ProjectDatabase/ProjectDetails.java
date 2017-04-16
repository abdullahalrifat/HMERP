package com.abdullah.ProjectDatabase;

import com.abdullah.Project.ProjectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 4/16/17.
 */
@Component
public class ProjectDetails
{
    @Autowired
    private ProjectsDAO projectsDAO;
    public List<ProjectBean> getList()
    {

        List<ProjectBean> listUser=projectsDAO.ListOfProjects();
        return listUser;
    }
    public void registerProjects(String Name,String Phone,String Address,String Position)
    {
        List<ProjectBean> listUser=projectsDAO.ListOfProjects();
        int size=listUser.size();
        ProjectBean projectBean=new ProjectBean(size+1,Name,Phone,Address,Position);
        projectsDAO.insertProjects(projectBean);
    }
}
