package com.abdullah.DataBase;

import org.springframework.stereotype.Component;

/**
 * Created by abdullah on 1/31/17.
 */
@Component
public class LoginVarifier
{
    public boolean isValidUser(String username,String password)
    {
        if(username.equals("r")&&password.equals("123"))return true;
        else return false;
    }
}
