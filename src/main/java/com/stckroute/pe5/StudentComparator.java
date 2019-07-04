package com.stckroute.pe5;

import java.util.Comparator;


//Student Comparator class contains all the setter and getter method
public class StudentComparator {

    //Initialises the Class variables
    private int id;
    private int age;
    private String name;

   //Constructor of the StudentComparator class
    public StudentComparator(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //String method is overriden
    @Override
    public String toString() {
        return  "{"+"id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

    //Implementation of the comparator constructor
    class StudentSorter implements Comparator<StudentComparator>{
        @Override
        public int compare(StudentComparator obj1, StudentComparator obj2) {

            //Comparison of all aspects starting from age then Name then Age
            if(obj1.getAge()==obj2.getAge())
            {
                if(obj1.getName()==obj2.getName())
                {
                    return obj2.getId()-obj2.getId();
                }
                else
                {
                    return obj2.getName().compareTo(obj1.getName());
                }
            }
            else
            {
                return  obj2.getAge()-obj1.getAge();
            }

        }
    }

