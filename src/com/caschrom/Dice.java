package com.caschrom;




//This class represents information and methods relating to a set of dice
public class Dice
{

    //Attributes

    private int numdice;    //number of dice
    private int numsides;   //number of sides


    //Constructors

    public Dice()      //default constructor
    {
        numdice=2;
        numsides=6;
    }

    public Dice(int d, int s)      //allows user to set sides and number of dice
    {
        numdice=d;
        numsides=s;
    }

    //Accessors

    public int getSides() //accesses the number of sides
    {
        return numsides;
    }

    public int getNumDice() //accesses the number of dice
    {
        return numdice;
    }


    public int rollDice()   // returns a random number representing number rolled by dice
    {
        int total=0;
        for (int i=0; i<numdice; i++)
            total+=(int)(Math.random()*numsides)+1;
        return total;
    }




}
