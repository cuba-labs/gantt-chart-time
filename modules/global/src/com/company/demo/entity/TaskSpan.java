package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Table(name = "DEMO_TASK_SPAN")
@Entity(name = "demo$TaskSpan")
public class TaskSpan extends StandardEntity {
    private static final long serialVersionUID = 716218467215769852L;

    @Column(name = "CATEGORY", nullable = false)
    protected String category;

    @OrderBy("index")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "taskSpan")
    protected List<Segment> segments;

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Segment> getSegments() {
        return segments;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }


}