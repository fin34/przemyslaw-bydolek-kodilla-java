package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        double a = 10;
        double b = 5;
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(a, b);
        double sub = calculator.sub(a, b);
        double mul = calculator.mul(a, b);
        double div = calculator.div(a, b);
        //Then
        Assert.assertEquals(15.00, add, 0.01);
        Assert.assertEquals(5.00, sub, 0.01 );
        Assert.assertEquals(50.00, mul, 0.01);
        Assert.assertEquals(2.00, div, 0.01);
    }
}
