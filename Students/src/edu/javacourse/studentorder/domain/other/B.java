package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

/**
 * Created by javaNoob on 16.05.2018.
 */
public class B {
    public void test(){
        Person p = new Person();
        p.surName ="nd";//def
        p.givenName ="gd";//private
        p.patronymic="pd";//protected

        System.out.println(p.surName + " "+p.patronymic +" " +p.givenName);

    }
}
