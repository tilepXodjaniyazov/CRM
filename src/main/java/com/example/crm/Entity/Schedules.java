package com.example.crm.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Groups groups;
    @ManyToMany
    private List<Subject> subject;
    @ManyToOne
    private Teachers teachers;
    private Weekday weekday;
    private Integer lesson_number;
}
