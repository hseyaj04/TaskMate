package com.taskmate.TaskMate.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@Document
public class Task {
    private ObjectId id;
    private String title;
    private String description;
    private boolean isComplete;
    private LocalDateTime createdAt;
}
