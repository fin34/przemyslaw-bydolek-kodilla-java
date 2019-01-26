package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String word, PoemDecorator poemDecorator){
        String decorateWord = poemDecorator.decorate(word);
        System.out.println("Słowo z upiekszaczem: " + decorateWord);
    }
}
