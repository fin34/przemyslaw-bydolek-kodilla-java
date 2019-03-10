package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User adam = new ZGeneration("Frog");
        User andrzej = new YGeneration("Fox");
        User monika = new Millenials("Pork");

        Assert.assertEquals("Twitter", adam.sharePost());
        Assert.assertEquals("Facebook", andrzej.sharePost());
        Assert.assertEquals("Snapchat", monika.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {

        User adam = new ZGeneration("Frog");
        System.out.println("Social media: " + adam.sharePost());
        adam.setSocialMedia(new FacebookPublisher());
        System.out.println("New social media: " + adam.sharePost());

        Assert.assertEquals("Facebook", adam.sharePost());
    }
}
