package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class TransportController {
    @Autowired
    private TransportService service;

    @PostMapping("/add")
    public String addTransport(@RequestBody Transport transport) {
        return service.addTransport(transport);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTransport(@PathVariable("id") int id) {
        return service.deleteTransport(id);
    }
}