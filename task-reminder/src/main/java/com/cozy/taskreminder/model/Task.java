package com.cozy.taskreminder.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "done")
    private boolean done;

    @Column(name = "activation_period")
    private int activationPeriod;

    @Column(name = "last_completion_date")
    private Timestamp lastCompletionDate;

    @ManyToOne
    @JoinColumn(name = "fk_priority_id")
    private Priority priority;

    public Task() {
    }

    public Task(String title, String description, int activationPeriod, Priority priority) {
        this.title = title;
        this.description = description;
        this.activationPeriod = activationPeriod;
        this.priority = priority;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getActivationPeriod() {
        return activationPeriod;
    }

    public void setActivationPeriod(int activationPeriod) {
        this.activationPeriod = activationPeriod;
    }

    public Timestamp getLastCompletionDate() {
        return lastCompletionDate;
    }

    public void setLastCompletionDate(Timestamp lastCompletionDate) {
        this.lastCompletionDate = lastCompletionDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
