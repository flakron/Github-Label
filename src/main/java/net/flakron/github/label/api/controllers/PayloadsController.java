package net.flakron.github.label.api.controllers;

import net.flakron.github.label.entity.Payload;
import net.flakron.github.label.mapper.PayloadMapper;
import net.flakron.github.label.services.HipchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "api/payloads")
@RestController
public class PayloadsController {

    @Autowired
    private HipchatService service;

    @Autowired
    private PayloadMapper mapper;

    @PostMapping
    public void store(@RequestBody Payload payload) {
        service.notify(mapper.convert(payload));
    }

}
