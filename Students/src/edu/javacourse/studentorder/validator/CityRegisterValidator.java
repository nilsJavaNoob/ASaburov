package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;

import java.util.Iterator;
import java.util.List;

/**
 * Created by n on 12.05.18.
 */
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
        try{
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
            //получим у заявки список детей студенческой семьи
            List<Child> childList = so.getChildren();
            //1-й способ
            for(int i =0; i < childList.size(); i++){

                CityRegisterCheckerResponse cans = personChecker.checkPerson(childList.get(i));
            }
            //2-способ
            for(Iterator<Child> it = childList.iterator(); it.hasNext();){
                Child child = it.next();
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
            }
            //3-й способ
            for(Child child: childList){
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
            }

        } catch (CityRegisterException ex){
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return  ans;
    }
}//class
