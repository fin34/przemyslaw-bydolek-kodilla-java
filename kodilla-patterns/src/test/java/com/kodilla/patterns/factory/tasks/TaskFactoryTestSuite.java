package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskShopping() {

        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        Assert.assertEquals("First shopping task", shopping.getTaskName());
    }

    @Test
    public void testTaskDriving() {

        TaskFactory factory = new TaskFactory();
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        Assert.assertEquals("First driving task", driving.getTaskName());
    }

    @Test
    public void testTaskPainting() {

        TaskFactory factory = new TaskFactory();
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        Assert.assertEquals("First painting task", painting.getTaskName());
    }

    @Test
    public void testIsTaskExecuted() {

        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
    }

}
