package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.AnswerCityRegisterItem;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.List;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    String password;
    private CityRegisterChecker personChecker;//interface

    public CityRegisterValidator() {

        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        AnswerCityRegister ans = new AnswerCityRegister();
        //ответы по всем членам студ. заявки
        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));

        //получим у заявки список детей студенческой семьи
        for(Child child: so.getChildren()){
            checkPerson(child);
        }
        return  ans;
    }

    private AnswerCityRegisterItem checkPerson(Person p){
        AnswerCityRegisterItem ans;
        try{
            CityRegisterResponse cans = personChecker.checkPerson(p);
        } catch (CityRegisterException ex){
            ex.printStackTrace();
        }

        return null;
    }
}//class

    //-------------------------
    //1-й способ
//            for(int i =0; i < childList.size(); i++){
//
//                CityRegisterResponse cans = personChecker.checkPerson(childList.get(i));
//            }
    //2-способ
//            for(Iterator<Child> it = childList.iterator(); it.hasNext();){
//                Child child = it.next();
//                CityRegisterResponse cans = personChecker.checkPerson(child);
//            }
    //3-й способ

