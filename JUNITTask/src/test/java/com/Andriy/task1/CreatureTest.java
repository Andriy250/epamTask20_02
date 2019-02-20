package com.Andriy.task1;

import org.junit.Assert;
import org.junit.Assume;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;


@RunWith(Parameterized.class)
public class CreatureTest {

    private final static boolean bug = false;

    //Creature creature;
    @Parameter(0)
    public int var1;
    @Parameter(1)
    public int var2;
    //or
  /*  private int var1;
    private int var2;


    public CreatureTest(int p1,int p2){
        var1 = p1;
        var2 = p2;
    }*/


    @Parameters
    static public Collection<Object[]> data(){
        Object[][] data = new Object[][]{{1,2},{0,5}};
        return Arrays.asList(data);
    }

    @Test
    public void speakStringShouldBeNotNull(){
        Creature creature = new Creature("tiger", 13);
        //assertNotNull(creature.speak());
        assertNull(creature.speak());
    }

    @Test
    public void speakStringShouldBeHelloMaster(){
        Creature creature = new Creature("dog",2);
        assertEquals("Hello, master", creature.speak());
        assertNotNull(creature.speak());
//        assertEquals("Hello, master!", creature.speak());
    }

    @Test
    public void checkThatAgeMoreThenParameter(){
        Creature creature = new Creature("monkey", 1);
        assertFalse("WRONG!!! var1 = " + var1 + ", var2 = " + var2,(!(creature.getAge() >= var1) || !(creature.getAge() <= var2)));

    }


    @Test
    public void checkBug(){

        if (bug)//(!bug)
        //    assertTrue("Bug", false);
            assumeTrue(false, "Bug");

    }
}
