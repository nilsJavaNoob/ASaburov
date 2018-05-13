package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by n on 12.05.18.
 */
public class WeddingValidator {
     public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

}
