package com.klef.fsad.exam;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;

    @Column(name = "course_name", nullable = false, length = 100)
    private String name;

    @Column(name = "course_description", length = 500)
    private String description;

    @Column(name = "course_date")
    private LocalDate date;

    @Column(name = "course_status", length = 50)
    private String status;

    @Column(name = "course_duration")
    private int duration; // in hours

    @Column(name = "course_instructor", length = 100)
    private String instructor;

    @Column(name = "course_credits")
    private int credits;

    // Default constructor (required by Hibernate)
    public Course() {
    }

    // Parameterized constructor
    public Course(String name, String description, LocalDate date,
                  String status, int duration, String instructor, int credits) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
        this.duration = duration;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course {" +
               "\n  ID          : " + id +
               "\n  Name        : " + name +
               "\n  Description : " + description +
               "\n  Date        : " + date +
               "\n  Status      : " + status +
               "\n  Duration    : " + duration + " hrs" +
               "\n  Instructor  : " + instructor +
               "\n  Credits     : " + credits +
               "\n}";
    }
}
