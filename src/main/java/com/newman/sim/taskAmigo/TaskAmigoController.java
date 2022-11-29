package com.newman.sim.taskAmigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskAmigoController {

    @Autowired
    TaskRepository repository;

    @GetMapping("/")
    public String index(){return "TaskAmigo Application is up!";}

    @PostMapping("/saveTestData")
    public String save(){
        repository.save(new Task("Meeting", "1 to 1 Gavin", false, false));
        return "TaskAmigoAppSaved";}

    //post for creating new resource and put for updating existing resource
    @PostMapping("/save")
    public String save(String title, String description, Boolean planned, Boolean completed){
        repository.save(new Task(title, description, planned, completed));
        return "New task " + title + " saved";}

    @GetMapping("/findAll")
    public Iterable<Task> findAll(){
        return repository.findAll();}

    @GetMapping("/findAllByTitle")
    public Iterable<Task> findbyTitle(String title){
        return repository.findByTitle(title) ; }

}
