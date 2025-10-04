package kz.bitlab.g139springtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationRequestController {

    // TODO: пример
    @GetMapping("/")
    public String list() {
        return "home";
    }

    // TODO: пример
    @PostMapping("/applications/add")
    public String add() {
        return "home";
    }


}
