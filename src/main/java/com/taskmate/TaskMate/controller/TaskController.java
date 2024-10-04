package com.taskmate.TaskMate.controller;

import com.taskmate.TaskMate.entity.Task;
import com.taskmate.TaskMate.service.TaskService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.findAll();
    }

    @PostMapping
    public boolean addTask(@RequestBody Task task){
        task.setCreatedAt(LocalDateTime.now());
        taskService.saveTask(task);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable ObjectId id){
        taskService.deleteById(id);
        return true;
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable ObjectId id){
        return taskService.findById(id);
    }
}
