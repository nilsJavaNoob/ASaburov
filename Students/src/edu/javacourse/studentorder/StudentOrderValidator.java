package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

/**
 * Created by n on 12.05.18.
 */
public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        while(true){
            StudentOrder so = readStudentOrder();
            System.out.println("start");
            if(so == null){
                break;
            }
            System.out.println("finish");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success){
                break;

            }
            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);

            sendMail(so);
        }//while

    }//checkAll

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "host1";
        AnswerCityRegister answ = crv.checkCityRegister(so);
        return  answ;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cw = new ChildrenValidator();
        cw.checkChildren(so);
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        return  new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }

}//class
