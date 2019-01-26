package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    Statistics statistics;
    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

//    private int numberOfUsers;
//    private int numberOfPosts;
//    private int numberOfComments;
//    private double averagePostsForUser;
//    private double averageCommentsForUser;
//    private double averageCommentsForPost;
//
//    public void calculateAdvStatistics(Statistics statistics){
//        numberOfUsers = statistics.usersNames().size();
//        numberOfPosts = statistics.postsCount();
//        numberOfComments = statistics.commentsCount();
//    }

    public double getAveragePostsForUser() {
        averagePostsForUser*= 100;
        averagePostsForUser=Math.round(averagePostsForUser);
        averagePostsForUser/=100;
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        averageCommentsForUser*= 100;
        averageCommentsForUser=Math.round(averageCommentsForUser);
        averageCommentsForUser/=100;
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        averageCommentsForPost*= 100;
        averageCommentsForPost= Math.round(averageCommentsForPost);
        averageCommentsForPost/=100;
        return averageCommentsForPost;
    }

    public void calculateAdvStatistics(){
        if(statistics.usersNames().size()>0 && statistics.postsCount()>0) {
            averagePostsForUser = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        if(statistics.usersNames().size()>0 && statistics.commentsCount()>0) {
            averageCommentsForUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()>0 && statistics.postsCount()>0) {
            averageCommentsForPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }

    public void showStatistics(){
        System.out.println(averageCommentsForPost + ", " + averagePostsForUser + ", " + averageCommentsForUser);
    }
}
