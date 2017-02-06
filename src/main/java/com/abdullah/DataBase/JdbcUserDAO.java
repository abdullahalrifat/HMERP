package com.abdullah.DataBase;

import com.abdullah.Login.LoginBean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by abdullah on 2/6/17.
 */
public class JdbcUserDAO implements UserDAO
{
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
    }
    @Override
    public void insert(LoginBean loginBean) {
        String sql="INSERT INTO Login "+"(Id,FullName,UserName,PassWord) VALUES (?, ?, ?, ?)";
        Connection conn=null;
        try
        {
            conn=dataSource.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,loginBean.getId());
            ps.setString(2,loginBean.getFullname());
            ps.setString(3,loginBean.getUsername());
            ps.setString(4,loginBean.getPassword());
        }catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(conn!=null)
            {
                try
                {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Boolean UserVarifier(String username, String password)
    {

        String sql="SELECT * FROM Login WHERE (Id,FullName,UserName,PassWord) = VALUES (?, ?, ?, ?)";
                Connection conn=null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(3,username);
            ps.setString(4,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                String user=rs.getString("UserName");
                String pass=rs.getString("PassWord");
                if(user.equals(username)&&pass.equals(password))
                {
                    conn.close();
                    return true;
                }
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
        return false;
    }
}
