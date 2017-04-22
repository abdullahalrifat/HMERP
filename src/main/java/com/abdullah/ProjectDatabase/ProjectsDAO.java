package com.abdullah.ProjectDatabase;

import com.abdullah.Project.ProjectBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 4/16/17.
 */
@Component
public interface ProjectsDAO
{
    public void insertProjects(ProjectBean ProjectBeans);
    public void updateProjects(ProjectBean ProjectBeans);
    public List<ProjectBean> ListOfProjects();
}
