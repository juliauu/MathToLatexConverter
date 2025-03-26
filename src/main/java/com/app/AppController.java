package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    private final InterpreterService interpreterService;

    public AppController(InterpreterService interpreterService) {
        this.interpreterService = interpreterService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/interpret")
    public String interpret(@RequestParam String expression, Model model) {
        String result = interpreterService.interpret(expression);
        model.addAttribute("result", result);
        return "index";
    }
}
