package com.b2mate.clientSide;

/**
 * Created by Will on 6/8/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String home(){
        StringBuilder sb = new StringBuilder();
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
            sb.append(customer.toString());
            sb.append("\n");
        }
        System.out.println();
        return sb.toString();
    }

    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String Greeting(){
        return "Message From SpringBoot Service - Hello World!";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerUser(Model model){
        model.addAttribute("customer", new Customer());
        return "helloworld";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(Model model, @ModelAttribute Customer customer){
        repository.save(customer);
        model.addAttribute("customers", repository.findAll());
        return "allClients";
    }


}
