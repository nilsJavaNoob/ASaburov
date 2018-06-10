package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class B extends Person {
    public B(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public void test(){
       // Person p = new Person();
        //p.surName ="nd";//def
       // p.givenName ="gd";//private
        //p.patronymic="pd";//protected

       // System.out.println(p.surName + " "+p.patronymic +" " +p.givenName);

    }
}
