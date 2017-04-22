package com.abdullah.ProjectDatabase;

import com.abdullah.Project.ProjectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by abdullah on 4/16/17.
 */
public class jdbcProjectsDAO extends JdbcDaoSupport implements ProjectsDAO {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public jdbcProjectsDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insertProjects(ProjectBean ProjectBeans)
    {
        String sql="INSERT INTO Projects "+"(Id,ProjectName,ProjectClient,ProjectManager,ProjectDeadLine,ProjectStatus) VALUES (?, ?, ?, ?, ?,?)";

        try
        {
            jdbcTemplate.update(sql,ProjectBeans.getId(),ProjectBeans.getProjectName(),ProjectBeans.getProjectClient(),ProjectBeans.getProjectManager(),ProjectBeans.getProjectDeadLine(),ProjectBeans.getProjectStatus());

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<ProjectBean> ListOfProjects() {
        String sql="SELECT * FROM Projects ";
        List<ProjectBean>listProjects=jdbcTemplate.query(sql, new RowMapper<ProjectBean >() {
            @Override
            public ProjectBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                ProjectBean  projectBean=new ProjectBean ();
                projectBean.setId(resultSet.getInt("id"));
                projectBean.setProjectName(resultSet.getString("ProjectName"));
                projectBean.setProjectClient(resultSet.getString("ProjectClient"));
                projectBean.setProjectManager(resultSet.getString("ProjectManager"));
                projectBean.setProjectDeadLine(resultSet.getString("ProjectDeadLine"));
                projectBean.setProjectStatus(resultSet.getString("ProjectStatus"));
                return  projectBean;
            }
        });
        return listProjects;

    }
    public void updateProjects(ProjectBean ProjectBeans)
    {
        String sql="UPDATE Projects "+"SET ProjectName =? ,ProjectClient = ?,ProjectManager = ?,ProjectDeadLine = ?,ProjectStatus = ? WHERE id = "+ProjectBeans.getId();

        try
        {
            jdbcTemplate.update(sql,ProjectBeans.getProjectName(),ProjectBeans.getProjectClient(),ProjectBeans.getProjectManager(),ProjectBeans.getProjectDeadLine(),ProjectBeans.getProjectStatus());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
