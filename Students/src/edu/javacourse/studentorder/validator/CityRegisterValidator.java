package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;

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
            CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex){
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return  ans;
    }
}//class
