package com.deck;

public class Deck implements DeckOfardsImpl{
    static String[] deck=new String[52];
    String[] suit={"Spade","Heart","Diamond","Club"};
    String[] rank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    @Override
    public void initialize()
    {
        String[] deck = new String[52];
        for(int i = 0; i<deck.length; i++)
        {
            deck [i] = String.valueOf(i);


        }
    }

    @Override
    public void display()
    {

        for (int i = 0; i < deck.length; i++)
        {
            String suits=  suit[i / 13];
            String ranks=  rank[i / 13];
            System.out.println(ranks+suits);


        }
    }
}
