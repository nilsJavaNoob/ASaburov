/**
 * Created by n on 12.05.18.
 */
public class CityRegisterValidator {

    String hostName;
    String login;
    String password;
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("CityRegister is running:" + hostName + " " + login + " " +password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return  ans;
    }
}
