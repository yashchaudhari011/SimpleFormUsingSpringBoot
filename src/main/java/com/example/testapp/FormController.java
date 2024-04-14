package com.example.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String showForm() {
        return "index.html";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String phoneNumber) {
        User user = new User(name, email, phoneNumber);
        userRepository.save(user);
        System.out.println(userRepository);
        return "redirect:/";
    }
}

