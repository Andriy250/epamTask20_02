package com.Andriy.task1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MokitoTest {

    @Mock
    Person obj;

    @Rule public MockitoRule mokitoRule = MockitoJUnit.rule();

   /* Person aMan = Mockito.mock(Person.class);

    @BeforeAll
    public void useTestMansTestMethod(){aMan.test(12);}*/

    @Test
    public void testNullObject(){
        //Person person = new Person(obj);
        Person person1 = Mockito.mock(Person.class);

       //assertNotNull("Name equals null" , person.getName());
        //assertNotNull("Name equals null", person1.getName());

    }

    @Test
    public void testVerify(){
        Person person = Mockito.mock(Person.class);//new Person(new StringBuilder("Andriy"), 19);

       person.test(12);
        person.test(11);
        //verify(person).test(10);// diff?
        //verify(person).test(ArgumentMatchers.eq(12));
        //verify(person, never()).test(12);
        //verify(person, atLeast(2)).test(12);


    }
}
