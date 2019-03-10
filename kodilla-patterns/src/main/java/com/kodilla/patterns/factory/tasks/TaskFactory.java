package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("First driving task", "London", "Car");
            case PAINTINGTASK:
                return new PaintingTask("First painting task", "Red", "Apple");
            case SHOPPINGTASK:
                return new ShoppingTask("First shopping task", "TV", 1.0);
            default:
                return null;
        }
    }
}
