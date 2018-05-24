package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.B;

/**
 * Created by n on 08.05.18.
 */
public class SaveStudentOrder {

    public static void main(String[] args) {
        //StudentOrder so = buildStudentOrder(id);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }
    static StudentOrder  buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        Adult husband = new Adult("Васильев","Андрей","Васильевич",
                null,"1234",)
          return so;
    }
}//class
