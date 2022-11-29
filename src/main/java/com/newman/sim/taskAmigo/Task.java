package com.newman.sim.taskAmigo;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Boolean planned;
    private Boolean completed;

    protected Task() {}

    public Task(String title, String description,
                Boolean planned, Boolean completed) {
        this.title = title;
        this.description = description;
        this.planned = planned;
        this.completed = completed;

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getPlanned() {
        return planned;
    }

    public Boolean getCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", planned=" + planned +
                ", completed=" + completed +
                '}';
    }
}
