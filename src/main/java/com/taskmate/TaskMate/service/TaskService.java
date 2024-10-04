package com.taskmate.TaskMate.service;

import com.taskmate.TaskMate.entity.Task;
import com.taskmate.TaskMate.repository.TaskRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll(){
        return taskRepository.findAll();
    }
    public boolean saveTask(Task task){
        try{
            taskRepository.save(task);
            return true;
        }
        catch (Exception e){
            System.out.println("Exception :" + e);
            return false;
        }
    }

    public Optional<Task> findById(ObjectId id){
        return taskRepository.findById(id);
    }

    public boolean deleteById(ObjectId id){
        taskRepository.deleteById(id);
        return true;
    }
}
