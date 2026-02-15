package com.kamaraj.studyplanner.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "progress_logs")
public class ProgressLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int progressId;

    private LocalDate studyDate;
    private int timeSpent;
    private String completionStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public ProgressLog() {}
}
