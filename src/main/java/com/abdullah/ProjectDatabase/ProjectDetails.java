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
    public void registerProjects(String projectName,String projectClient,String projectManager,String projectDeadLine,String projectStatus)
    {
        List<ProjectBean> listUser=projectsDAO.ListOfProjects();
        int size=listUser.size();
        ProjectBean projectBean=new ProjectBean(size+1,projectName,projectClient,projectManager,projectDeadLine,projectStatus);
        projectsDAO.insertProjects(projectBean);
    }
    public void updateProjects(int id,String projectName,String projectClient,String projectManager,String projectDeadLine,String projectStatus)
    {
        ProjectBean projectBean=new ProjectBean(id,projectName,projectClient,projectManager,projectDeadLine,projectStatus);
        projectsDAO.updateProjects(projectBean);
    }
}
