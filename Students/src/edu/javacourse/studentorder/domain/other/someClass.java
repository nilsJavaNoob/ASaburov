package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class someClass {
    public void test(){
        Person p = new Person();
        p.surName ="nd";
        p.givenName ="gd";
        p.patronymic="pd";

        System.out.println(p.surName + " "+p.patronymic +" " +p.givenName);

    }
}
