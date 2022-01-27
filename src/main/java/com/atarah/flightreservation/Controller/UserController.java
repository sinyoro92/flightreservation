package com.atarah.flightreservation.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/signup")
    public String RegistrationPage()
    {
        return "login/SignUp";
    }
}
