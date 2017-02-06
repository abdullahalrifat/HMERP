package com.abdullah.DataBase;

import com.abdullah.Login.LoginBean;
import org.springframework.stereotype.Component;

/**
 * Created by abdullah on 2/6/17.
 */
@Component
public interface UserDAO
{
    public void insert(LoginBean loginBean);
    public Boolean UserVarifier(String username, String password);
}
