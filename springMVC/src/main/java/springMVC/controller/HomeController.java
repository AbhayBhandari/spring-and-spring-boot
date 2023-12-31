package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("name", "Abhay Bhandari");
        return "about";
    }
}
