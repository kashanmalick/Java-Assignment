package com.company;



import java.util.Scanner;


public class University {
    Scanner getval = new Scanner(System.in);
    Student s;
    Teacher t;
    int index = 0;
    Teacher teacher[] =  new Teacher[5];
    Student student[] = new Student[5];

    public void addstudent(Student s) {
        s = new Student();
        System.out.println("Name : ");
        String name = getval.next();
        s.setName(name);
        System.out.println("Age : ");
        int age = getval.nextInt();
        s.setAge(age);
        System.out.println("RollNum : ");
        int roll = getval.nextInt();
        s.setRollnum(roll);
        student[index++] = s;
    }
    public void addteacher(Teacher t) {
        t = new Teacher();
        System.out.println("Name : ");
        String name = getval.next();
        t.setName(name);
        System.out.println("Age : ");
        int age = getval.nextInt();
        t.setAge(age);
        System.out.println("Course : ");
        String course = getval.next();
        t.setCourse(course);
        teacher[index++] = t;
    }

    public void display(int roll) {
        System.out.println("Name \t Age \t RollNumber");
        for (int i = 0; i < student.length; i++) {
            if (student[i].getRollnum() == roll && student[i] != null){
                      System.out.println(student[i].getName() + " \t " + student[i].getAge() + " \t " + student[i].getRollnum());
                System.out.println(" \n");
                break;
        }
        }

    }
    public void displayteacher(String name) {
        System.out.println("Name \t Age \t Course");
        if(teacher.length<1){

        }else {
            for (int i = 0; i < teacher.length; i++) {
                if (teacher[i].getName().equalsIgnoreCase(name) && teacher[i] != null) {
                    System.out.println(teacher[i].getName() + " \t " + teacher[i].getAge() + " \t " + teacher[i].getCourse());
                    System.out.println(" \n");
                    break;
                }

            }
        }


    }

}
