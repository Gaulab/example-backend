package com.gaulab.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaulab.demo.model.Box;
import com.gaulab.demo.repository.BoxRepository;

@Service
public class BoxService {

    private final BoxRepository repository;

    public BoxService(BoxRepository repository) {
        this.repository = repository;
    }

    public List<Box> findAll() {
        return repository.findAll();
    }

    public Box save(Box box) {
        return repository.save(box);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
