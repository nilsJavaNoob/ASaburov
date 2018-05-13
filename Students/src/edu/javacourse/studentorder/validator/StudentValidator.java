package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by n on 12.05.18.
 */
public class StudentValidator {
     public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
