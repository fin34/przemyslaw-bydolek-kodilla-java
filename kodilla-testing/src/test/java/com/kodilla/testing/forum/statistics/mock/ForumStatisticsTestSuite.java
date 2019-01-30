package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatisticsWithMockExample1(){

        Statistics statisticsMock = mock(Statistics.class);
        List<String> listUser = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            listUser.add("a"+i);
        }
        int postsCount = 15;
        int commentsCount = 100;
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics();
        System.out.println("Test for: User numbers = " + listUser.size() + " Posts count = "+ postsCount + " Comments count = " + commentsCount);
        Assert.assertEquals(0.15, forumStatistics.getAveragePostsForUser(), 0);
        Assert.assertEquals(1.00, forumStatistics.getAverageCommentsForUser(), 0);
        Assert.assertEquals(6.67, forumStatistics.getAverageCommentsForPost(), 0.0001);

        Assert.assertEquals(6.0, 6.0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockExample2(){

        Statistics statisticsMock = mock(Statistics.class);
        List<String> listUser = new ArrayList<>();
        int postsCount = 1000;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics();
        System.out.println("Test for: User numbers = " + listUser.size() + " Posts count = "+ postsCount + " Comments count = " + commentsCount);
        Assert.assertEquals(0.00, forumStatistics.getAveragePostsForUser(), 0);
        Assert.assertEquals(0.00, forumStatistics.getAverageCommentsForUser(), 0);
        Assert.assertEquals(0.00, forumStatistics.getAverageCommentsForPost(), 0);
    }
}
