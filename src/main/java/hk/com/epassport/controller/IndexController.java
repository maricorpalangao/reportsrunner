package hk.com.epassport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(Model m){
        ModelAndView mav = new ModelAndView();
        mav.addObject("test","hello world");
        mav.setViewName("/pages/index");
        return mav;
    }
}
