package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by n on 12.05.18.
 */
public class ChildrenValidator {

     public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check is running");
        return new AnswerChildren();
    }
}
