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

    @RequestMapping("/saveTestData")
    public String save(){
        repository.save(new Task("Meeting", "1 to 1 Gavin", false, false));
        return "TaskAmigoAppSaved";}

    @RequestMapping("/save")
    public String save(String title, String description, Boolean planned, Boolean completed){
        repository.save(new Task(title, description, planned, completed));
        return "New task " + title + " saved";}

    @RequestMapping("/findAll")
    public Iterable<Task> findAll(){
        return repository.findAll();}

    @RequestMapping("/findAllByTitle")
    public Iterable<Task> findbyTitle(String title){
        return repository.findByTitle(title) ; }

}
