package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.other.someClass;

/**
 * Created by n on 08.05.18.
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = buildStudentOrder();
        //System.out.println(so.getHusband().getAdultString());
        new AnswerChildren().test();
        new someClass().test();

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }
    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setSurName("Ivan");
        husband.setGivenName("Ivanov");
        husband.setPatronymic("Ivanych");
        so.setHusband(husband);
        return so;
    }
}//class
