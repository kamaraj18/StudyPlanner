package com.kamaraj.studyplanner.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "timetable")
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timetableId;

    private LocalDate studyDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int allocatedHours;
    private String status;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name ="subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name ="topic_id")
    private Topic topic;

    public Timetable() {
    }
}
