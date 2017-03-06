package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "DEMO_SEGMENT")
@Entity(name = "demo$Segment")
public class Segment extends StandardEntity {
    private static final long serialVersionUID = 944620213673839255L;

    @Column(name = "START_")
    protected Integer start;

    @Column(name = "DURATION")
    protected Integer duration;

    @Column(name = "COLOR")
    protected String color;

    @Column(name = "TASK_")
    protected String task;

    @Column(name = "INDEX_")
    protected Integer index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_SPAN_ID")
    protected TaskSpan taskSpan;

    public void setTaskSpan(TaskSpan taskSpan) {
        this.taskSpan = taskSpan;
    }

    public TaskSpan getTaskSpan() {
        return taskSpan;
    }


    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return start;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }


}