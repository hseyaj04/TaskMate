package com.taskmate.TaskMate.repository;

import com.taskmate.TaskMate.entity.Task;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends MongoRepository<Task, ObjectId> {
}
