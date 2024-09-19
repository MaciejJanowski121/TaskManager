package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
  System.out.println("The Task has been added" + taskName);
  break;



    }
}
    }
}