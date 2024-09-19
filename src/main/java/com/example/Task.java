package com.example;

public class Task {



   private String name;
    private Boolean executed;

   public Task (String name) {
        this.name = name;
        this.executed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
      this.executed = executed;
    }

    public void arleadyExecuted() {
       this.setExecuted(true);
    }

    public String toString() {
        return name + (executed ? "[Finished]" : "[Not Finished]");
    }
}
