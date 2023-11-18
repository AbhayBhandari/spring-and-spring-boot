package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springMVC.model.User;

@Controller
public class RegistrationController {
    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }

//    @RequestMapping(path="/submitRegistrationForm", method = RequestMethod.POST)
//    public String handleSubmitRegistration(@RequestParam String userEmail, @RequestParam("userPassword") String password, Model model){
//        model.addAttribute("email", userEmail);
//        model.addAttribute("password", password);
//        return "success";
//    }

    //no need for RequestParam as ModelAttribute will take data from View (html form) and also transfer this data to another view i.e similar to model.addAtrribute("user",user)

    @RequestMapping(path="/submitRegistrationForm", method = RequestMethod.POST)
    public String handleSubmitRegistration(@ModelAttribute User user){
        return "success";
    }

}
