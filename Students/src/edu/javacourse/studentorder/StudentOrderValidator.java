package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();//провести все виды проверки
    }

    public StudentOrderValidator (){

        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public void checkAll(){
        //читаем все новые заявки студентов с сайта
        // и храним их в soArray[]
        System.out.println("читаем все новые заявки");
        StudentOrder[] soArray = readStudentOrders();
        //вытаскиваем заявки по одной и отдаём на все виды проверок
        // пока не закончитя массив
        System.out.println("вытаскиваем заявки по одной из цикла");

        /*for(int c = 0; c < soArray.length; c++){
                checkOneOrder(soArray[c]);
            }
*/
        for(StudentOrder so: soArray){
            System.out.println("");
            checkOneOrder(so);
        }
    }//checkAll

    public StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];

        for(int c = 0;c < soArray.length; c++){
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        return soArray;
    }

//проверяет одну заявку на все виды проверок
    public void checkOneOrder(StudentOrder so){
        System.out.println("order");
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding answerWedding = checkWedding(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);
        sendMail(so);
    }
    //для каждого вида проверок созданы специальные классы
    // в методах которых проходит проверка
     public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so){

        return childrenVal.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so)
    {
        return  studentVal.checkStudent(so);
    }
    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}//class
