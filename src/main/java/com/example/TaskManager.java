package com.example;
import java.util.List;
import java.util.ArrayList;

public interface TaskManager {
   void addTask(Task task);
   void setTaskAsCompleted(int index);
   List<Task> showAllTasks();
}
