package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

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
        //-------------------
        //weddingVal = new WeddingValidator();
        //childrenVal = new ChildrenValidator();
        //studentVal = new StudentValidator();
        //mailSender = new MailSender();
    }

    public void checkAll(){
        //читаем все новые заявки студентов с сайта
        // и храним их в soArray[]
        System.out.println("получаем список все  заявок");
		//этот метод возвратит LinkedList с заявками семей студентов
        List<StudentOrder> soList = readStudentOrders();
        //вытаскиваем заявки по одной и отдаём на все виды проверок
        // пока не закончитя массив
        System.out.println("вытаскиваем заявки по одной из цикла");

        //for(int c = 0; c < soArray.length; c++){
          //      checkOneOrder(soArray[c]);
        //}
        //извлекаем из массива по одной заявке 
		
        for(StudentOrder so: soList){
            System.out.println("!извлекли заявку!");
			//отдаём по одной заявке в метод checkOneOrder
            checkOneOrder(so);
        }
    }//checkAll

    public List<StudentOrder> readStudentOrders(){
		//создали пустой список
        List<StudentOrder> soList = new LinkedList<StudentOrder>();
     // в цикле заполняем этот список заявками от студсемей
        for(int c = 0;c < 5; c++){
            StudentOrder so = SaveStudentOrder.buildStudentOrder(c);
            soList.add(so);
        }
        return soList;
    }

//проверяет одну заявку на все виды проверок
    public void checkOneOrder(StudentOrder so){
        System.out.println("Checking order ");
		//класс-результат
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        //------------------
        //AnswerWedding answerWedding = checkWedding(so);
        //AnswerChildren answerChildren = checkChildren(so);
        //AnswerStudent answerStudent = checkStudent(so);
        //sendMail(so);
    }
    //для каждого вида проверок созданы специальные классы
    // в методах которых проходит проверка
     public AnswerCityRegister checkCityRegister(StudentOrder so) {
        //просим класс cityRegisterValidator проверить
        // наличие семьи в городском реестре
        //и ожидаем ответ в AnswerCityRegister
        return cityRegisterVal.checkCityRegister(so);
    }
//------------------
    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so){
        return  studentVal.checkStudent(so);
    }
    public void sendMail(StudentOrder so)
    {
        mailSender.sendMail(so);
    }
}//class
