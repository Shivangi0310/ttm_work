package com.annotationBased;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
        //EXTRA QUESTION
@Controller
@RequestMapping("/student")
public class LoginReqMap {
    //@RequestMapping(value = "/submitForm.html", method = RequestMethod.GET)
    ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("submitForm");
        return modelAndView;
    }

    //@RequestMapping(value = "/student.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(String username, String lastname) {
        return username + " " + lastname;
    }

}