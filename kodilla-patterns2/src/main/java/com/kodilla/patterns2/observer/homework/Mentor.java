package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(mentorName + " new Task in " + tasksQueue.getName() + "\n" +
                " total: " + tasksQueue.getTasks().size() + " tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
