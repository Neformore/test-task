package com.example.testtask.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task_assignees")
public class TaskAssignee {

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
