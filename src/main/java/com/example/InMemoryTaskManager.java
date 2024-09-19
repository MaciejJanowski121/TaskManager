package com.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskManager implements TaskManager{

    List<Task> taskList = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        taskList.add(task);
    }

    @Override
public void setTaskAsCompleted (int index) {

        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).arleadyExecuted();
        } else {
            System.out.println("Wrong Task Number");
        }


    }
    @Override
    public List<Task> showAllTasks() {
        return taskList;
    }
}
