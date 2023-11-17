package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }

    @RequestMapping(path="/submitRegistrationForm", method = RequestMethod.POST)

    public String handleSubmitRegistration(@RequestParam String userEmail, @RequestParam("userPassword") String password, Model model){
        model.addAttribute("email", userEmail);
        model.addAttribute("password", password);
        return "success";
    }
}
