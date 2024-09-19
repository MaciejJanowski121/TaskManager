package com.example;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
TaskManager Tasks = new InMemoryTaskManager();

while (true) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Add a Task");
    System.out.println("2. Show All Tasks");
    System.out.println("3. Mark a task as executed");
    System.out.println("4. Exit the Program");
  int choose = scanner.nextInt();
  scanner.nextLine();

    switch (choose) {
        case 1:
  String taskName = scanner.nextLine();
  Task newTask = new Task(taskName);
  Tasks.addTask(newTask);
  System.out.println("The Task has been added " + taskName);
  break;

        case 2:

            if (Tasks.showAllTasks().isEmpty()) {
                System.out.println("The Task List ist Empty");
            } else  {
                for (int i = 0; i <Tasks.showAllTasks().size(); i++) {
                    System.out.println(i +1  + ": " + Tasks.showAllTasks().get(i));
                }

            }
            break;

        case 3 :
            String executeTask = scanner.nextLine();
boolean taskFound = false;
            for (Task task : Tasks.showAllTasks()) {
                if (task.getName().equalsIgnoreCase(executeTask)) {
                    task.arleadyExecuted();
                    System.out.println("The Task " + executeTask + "Is Executed");
               taskFound = true;
               break;
                }

            }
            if (!taskFound) {
                System.out.println("Wrong Chocie , this Task doesnt exists.");
            }

        case 4 :
            System.out.println("You have Successfully exited The program");
            return;



    }
}
    }
}