package com.kamaraj.studyplanner.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectId;

    private String subjectName;
    private String priorityLevel;
    private String difficultyLevel;
    private LocalDate examDate;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Subject() {
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public User getUser() {
        return user;
    }
}
