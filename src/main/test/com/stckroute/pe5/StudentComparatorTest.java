package com.stckroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentComparatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void StudentTest(){
        List<StudentComparator>  students= new ArrayList<>();
        StudentComparator obj1=new StudentComparator(1,54,"Ram");
        StudentComparator obj2=new StudentComparator(2,24,"Alex");
        StudentComparator obj3=new StudentComparator(3,19,"Abdul");
        StudentComparator obj4=new StudentComparator(4,35,"John");
        StudentComparator obj5=new StudentComparator(5,43,"Tim");
        StudentComparator obj6=new StudentComparator(6,39,"Siku");

        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        Collections.sort(students, new StudentSorter());
        assertEquals("[{id=1, age=54, name='Ram'}, {id=5, age=43, name='Tim'}, {id=6, age=39, name='Siku'}, {id=4, age=35, name='John'}, {id=2, age=24, name='Alex'}, {id=3, age=19, name='Abdul'}]",students.toString());
    }
}