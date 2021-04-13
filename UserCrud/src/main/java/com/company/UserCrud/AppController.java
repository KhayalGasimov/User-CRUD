package com.company.UserCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class AppController {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public List<User> viewHomePage(Model model) {
    List<User> listUsers = service.findAll();
    model.addAttribute("listUsers",listUsers);

    return listUsers;
}
    @RequestMapping("/new")
    public String showNewUserPage(Model model) {
        User user  = new User();
        model.addAttribute("user", user);

            return showNewUserPage(model);
        }


    }
