package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by n on 08.05.18.
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.sethFirstName("Alex");
        so.sethLastName("Mook");
        so.setwFirstName("Mary");
        so.setwLastName("Poppins");

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.gethLastName());
        return answer;
    }
}//class
