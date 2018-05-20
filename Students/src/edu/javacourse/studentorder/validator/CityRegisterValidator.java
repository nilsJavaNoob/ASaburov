package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by n on 12.05.18.
 */
public class CityRegisterValidator {

    public String hostName;
    protected int port;
    String password;
    String login;
    //это пока заглушка
     public AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("CityRegister is running:" + hostName + " " + login + " " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return  ans;
    }
}
