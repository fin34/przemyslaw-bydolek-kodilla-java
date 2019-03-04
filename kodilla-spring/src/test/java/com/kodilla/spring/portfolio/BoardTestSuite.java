package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.taskAddDoneList("Done task");
        board.taskAddInProgressList("Task in progress");
        board.taskAddToDoList("Task to do");
        String resultToDo = board.readTask(board.getToDoList());
        String resultInProgress = board.readTask(board.getInProgressList());
        String resultDoneList = board.readTask(board.getDoneList());
        //Then
        Assert.assertEquals("Task to do", resultToDo);
        Assert.assertEquals("Task in progress", resultInProgress);
        Assert.assertEquals("Done task", resultDoneList);
    }
}
