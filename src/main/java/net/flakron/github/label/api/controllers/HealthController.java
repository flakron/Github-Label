package net.flakron.github.label.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/health")
@RestController
public class HealthController {

    @GetMapping
    public String index() {
        return "OK";
    }

}
