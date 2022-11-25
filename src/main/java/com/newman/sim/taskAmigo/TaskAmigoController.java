package com.newman.sim.taskAmigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskAmigoController {

    @Autowired
    TaskRepository repository;

    @RequestMapping("/")
    public String index(){return "TaskAmigo Application is up!";}

    @RequestMapping("/save")
    public String save(){
        repository.save(new Task("Meeting", "1 to 1 Gavin"));
        return "TaskAmigoAppSaved";}

    @RequestMapping("/findAll")
    public Iterable<Task> findAll(){
        return repository.findAll();}

}
