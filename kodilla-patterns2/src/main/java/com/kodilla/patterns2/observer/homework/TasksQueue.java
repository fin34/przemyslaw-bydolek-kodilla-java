package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements Observable {
    private final List<Observer> mentors;
    private final Deque<String> tasks;
    private final String name;

    public TasksQueue(String name) {
        tasks = new ArrayDeque<>();
        mentors = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
