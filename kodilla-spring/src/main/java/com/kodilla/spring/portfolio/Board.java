package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void taskAddToDoList(String task){
        toDoList.getTasks().add(task);
    }

    public void taskAddInProgressList(String task){
        inProgressList.getTasks().add(task);
    }

    public void taskAddDoneList(String task){
        doneList.getTasks().add(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public String readTask(TaskList taskList) {
       return taskList.getTasks().get(0);
    }
}
