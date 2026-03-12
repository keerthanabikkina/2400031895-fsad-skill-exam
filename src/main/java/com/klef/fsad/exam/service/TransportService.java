package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {
    @Autowired
    private TransportRepository repository;

    public String addTransport(Transport transport) {
        repository.save(transport);
        return "Transport Record Added Successfully!";
    }

    public String deleteTransport(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Transport Record Deleted Successfully!";
        }
        return "ID Not Found!";
    }
}