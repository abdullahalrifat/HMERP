package com.abdullah.LoginDataBase;

import com.abdullah.Login.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 1/31/17.
 */
@Component
public class LoginVarifier
{

    @Autowired
    private UserDAO userDAO;
    public boolean isValidUser(String username,String password)
    {

        List<LoginBean> listUser=userDAO.UserVarifier();
        for(int i=0;i<listUser.size();i++)
        {
            if(username.equals(listUser.get(i).getUsername())&&password.equals(listUser.get(i).getPassword()))return true;
        }
        return false;
    }
    public void register(String Name,String username,String password)
    {
        List<LoginBean> listUser=userDAO.UserVarifier();
        int size=listUser.size();
        LoginBean loginBean=new LoginBean(size+1,Name,username,password);
        userDAO.insert(loginBean);
    }
}
