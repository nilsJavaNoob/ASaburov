package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.other.Adult;

/**
 * Created by n on 12.05.18.
 */
public class AnswerChildren {

    public void test(){
        Person p = new Person();
        p.surName  = "ss";
        p.givenName  = "gs";
        p.patronymic  = "ps";

        System.out.println(p.surName + " "+p.patronymic +" " +p.givenName);
    }
    
}
