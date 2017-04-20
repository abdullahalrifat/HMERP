package com.abdullah.Project;

/**
 * Created by abdullah on 4/16/17.
 */
public class ProjectBean
{
    private int id;
    private String ProjectName;
    private String ProjectClient;
    private String ProjectManager;
    private String ProjectDeadLine;
    private String ProjectStatus;



    public ProjectBean()
    {

    }
    public ProjectBean(String projectName, String projectClient, String projectManager, String projectDeadLine,String projectStatus) {
        ProjectName = projectName;
        ProjectClient = projectClient;
        ProjectManager = projectManager;
        ProjectDeadLine = projectDeadLine;
        ProjectStatus=projectStatus;
    }
    public ProjectBean(int id, String projectName, String projectClient, String projectManager, String projectDeadLine,String projectStatus) {
        this.id = id;
        ProjectName = projectName;
        ProjectClient = projectClient;
        ProjectManager = projectManager;
        ProjectDeadLine = projectDeadLine;
        ProjectStatus=projectStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getProjectClient() {
        return ProjectClient;
    }

    public void setProjectClient(String projectClient) {
        ProjectClient = projectClient;
    }

    public String getProjectManager() {
        return ProjectManager;
    }

    public void setProjectManager(String projectManager) {
        ProjectManager = projectManager;
    }

    public String getProjectDeadLine() {
        return ProjectDeadLine;
    }

    public void setProjectDeadLine(String projectDeadLine) {
        ProjectDeadLine = projectDeadLine;
    }
    public String getProjectStatus() {
        return ProjectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        ProjectStatus = projectStatus;
    }
}
