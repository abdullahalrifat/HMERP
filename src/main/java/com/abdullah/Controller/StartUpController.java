package com.abdullah.Controller;

import com.abdullah.LoginDataBase.LoginVarifier;
import com.abdullah.Login.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abdullah on 1/31/17.
 */

@Controller
public class StartUpController
{
    @Autowired
    LoginVarifier loginvarify;

    @RequestMapping(value="/login-form")
    @ResponseBody
    public ModelAndView personPage()
    {
       // System.out.println("start");
        return new ModelAndView("Login-Page", "login-entity", new LoginBean());
    }

    @RequestMapping(value="/login-Varify")
    public ModelAndView processPerson(@ModelAttribute LoginBean loginBean)
    {
        ModelAndView model= null;
        try
        {
            boolean isValidUser =loginvarify.isValidUser(loginBean.getUsername(), loginBean.getPassword());
            if(isValidUser)
            {
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("Login-Page", "login-entity", new LoginBean());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/login-register")
    public ModelAndView processPersonRegister(@ModelAttribute LoginBean loginBean)
    {
        ModelAndView model= null;
        try
        {
            loginvarify.register(loginBean.getFullname(),loginBean.getUsername(), loginBean.getPassword());

            model = new ModelAndView("Login-Page", "login-entity", new LoginBean());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
