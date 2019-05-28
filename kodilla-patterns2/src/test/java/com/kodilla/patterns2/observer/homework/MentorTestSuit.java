package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuit {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue queueFirstUser = new TasksQueue("Queue first user");
        TasksQueue queueSecondUser = new TasksQueue("Queue second user");
        TasksQueue queueThirdUser = new TasksQueue("Queue third user");
        Mentor andrzejWajda = new Mentor("Andrzej Wajda");
        Mentor romanPolanski = new Mentor("Roman Polanski");
        queueFirstUser.registerObserver(andrzejWajda);
        queueSecondUser.registerObserver(romanPolanski);
        queueThirdUser.registerObserver(andrzejWajda);
        //When
        queueFirstUser.addTask("1.1 task");
        queueFirstUser.addTask("1.2 task");
        queueFirstUser.addTask("1.3 task");
        queueSecondUser.addTask("2.3 task");
        queueSecondUser.addTask("2.4 task");
        queueSecondUser.addTask("2.5 task");
        queueSecondUser.addTask("2.6 task");
        queueThirdUser.addTask("4.4 task");
        //Then
        assertEquals(4, andrzejWajda.getUpdateCount());
        assertEquals(4, romanPolanski.getUpdateCount());
    }
}
