package com.deck;

import oracle.jrockit.jfr.StringConstantPool;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("Welcome to the Deck Of Cards");
        Deck obj= new Deck();
        obj.initialize();
        obj.display();
    }
}
