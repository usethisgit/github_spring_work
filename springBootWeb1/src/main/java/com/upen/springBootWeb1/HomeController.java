
package com.upen.springBootWeb1;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        //System.out.println("Home method called");
       // return "index.jsp";
        return "index"; // This will resolve to index.html or index.jsp based on your view resolver configuration
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView modelAndView) {

        int result=num1+num2;
        //session.setAttribute("result", result);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result"); // This will resolve to result.html or result.jsp based on your view resolver configuration
      //  return "result.jsp";
        return modelAndView;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView add(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView modelAndView) {
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        modelAndView.addObject("alien", alien);
//        modelAndView.setViewName("result"); // This will resolve to result.html or result.jsp based on your view resolver configuration
//        //  return "result.jsp";
//        return modelAndView;
//    }
@RequestMapping("addAlien")
    public String addAlien( Alien alien){
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
        return "result";
    }

}
