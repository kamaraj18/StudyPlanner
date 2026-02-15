package com.kamaraj.studyplanner.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;

    private String topicName;
    private int estimatedHours;
    private String status;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Topic() {
    }

    public int getTopicId() {
        return topicId;
    }
    public String getTopicName() {
        return topicName;
    }

    public Subject getSubject() {
        return subject;
    }
}
