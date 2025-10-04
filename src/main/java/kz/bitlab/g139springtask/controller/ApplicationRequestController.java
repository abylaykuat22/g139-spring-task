package kz.bitlab.g139springtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationRequestController {

    // TODO: пример
    @GetMapping("/application-requests/list")
    public String list() {
        return "home";
    }


}
