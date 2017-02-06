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
    @RequestMapping("/home")
    public ModelAndView handleRequest() throws Exception {
        ModelAndView mv = new ModelAndView("JSP/Home");
        return mv;
    }

}
