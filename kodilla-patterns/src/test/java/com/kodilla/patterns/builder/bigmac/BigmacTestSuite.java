package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite im{

    @Test
    public void testBigmac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("Sesame")
                .Burgers(2)
                .Sauce("barbecue")
                .Ingredient("onion")
                .Ingredient("bacon")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(2, howManyIngredients);
    }
}
