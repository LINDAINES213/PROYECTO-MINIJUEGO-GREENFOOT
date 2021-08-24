import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Linda Ines Jimenez Vides 
 * @version (a version number or a date)
 */
public class Arena extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Comida comida = new Comida();
        addObject(comida,127,90);
        Comida comida2 = new Comida();
        addObject(comida2,283,100);
        Comida comida3 = new Comida();
        addObject(comida3,473,84);
        Comida comida4 = new Comida();
        addObject(comida4,471,228);
        Comida comida5 = new Comida();
        addObject(comida5,301,233);
        Comida comida6 = new Comida();
        addObject(comida6,150,243);
        Comida comida7 = new Comida();
        addObject(comida7,160,381);
        Comida comida8 = new Comida();
        addObject(comida8,307,322);
        Comida comida9 = new Comida();
        addObject(comida9,448,371);
        Jugador jugador = new Jugador();
        addObject(jugador,289,538);
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,67,45);
        enemigo.setLocation(104,102);
        Comida comida10 = new Comida();
        addObject(comida10,524,334);
        Comida comida11 = new Comida();
        addObject(comida11,131,553);
        Comida comida12 = new Comida();
        addObject(comida12,45,495);
        Comida comida13 = new Comida();
        addObject(comida13,60,310);
        Comida comida14 = new Comida();
        addObject(comida14,264,385);
        Comida comida15 = new Comida();
        addObject(comida15,358,424);
        Comida comida16 = new Comida();
        addObject(comida16,457,503);
        Comida comida17 = new Comida();
        addObject(comida17,528,429);
        Comida comida18 = new Comida();
        addObject(comida18,546,515);
        Comida comida19 = new Comida();
        addObject(comida19,388,231);
        Comida comida20 = new Comida();
        addObject(comida20,396,81);
        Comida comida21 = new Comida();
        addObject(comida21,568,54);
        Comida comida22 = new Comida();
        addObject(comida22,543,192);
        Comida comida23 = new Comida();
        addObject(comida23,214,43);
        Comida comida24 = new Comida();
        addObject(comida24,35,212);
        Comida comida25 = new Comida();
        addObject(comida25,239,275);
        Comida comida26 = new Comida();
        addObject(comida26,205,472);
    }
}
