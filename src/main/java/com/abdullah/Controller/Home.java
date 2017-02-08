package com.abdullah.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abdullah on 1/31/17.
 */

@Controller
public class Home
{
    @RequestMapping(value="/index")
    public ModelAndView processIndex()
    {
        ModelAndView model= null;
        try
        {
                model = new ModelAndView("Home");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/elements")
    public ModelAndView processElements()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Elements");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/charts")
    public ModelAndView processCharts()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Charts");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/panels")
    public ModelAndView processPanels()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Panels");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/notifications")
    public ModelAndView processNotifications()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Notifications");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-profile")
    public ModelAndView processPageProfile()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-Profile");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-login")
    public ModelAndView processPageLogin()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Login-Page");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-lockscreen")
    public ModelAndView processPageLockscreen()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-LockScreen");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/tables")
    public ModelAndView processTables()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Tables");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/typography")
    public ModelAndView processTypography()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Typography");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/icons")
    public ModelAndView processIcons()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Icons");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
