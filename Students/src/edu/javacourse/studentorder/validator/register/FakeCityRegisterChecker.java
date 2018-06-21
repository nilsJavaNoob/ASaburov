package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    public static final String GOOD_1 = "1000";//Все участники пропмсаны, нет ошибок
    public static final String GOOD_2 = "2000";//Все участники пропмсаны, нет ошибок
    public static final String BAD_1 = "1001";//заявитель не прописан, но нет ошибок
    public static final String BAD_2 = "2001";//заявитель не прописан, но нет ошибок
    public static final String ERROR_1 = "1002";//Ошибки из ГРН(мы их должны обработать)
    public static final String ERROR_2 = "2002";//Ошибки из ГРН(мы их должны обработать)
    public static final String ERROR_T_1 = "1003";//Транспортная ошибка
    public static final String ERROR_T_2 = "2003";//Транспортная ошибка


    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException,TransportException{
        CityRegisterResponse response = new CityRegisterResponse();
        if(person instanceof Adult){
            System.out.println("ADULT");
            Adult a = (Adult)person;
            String ps = a.getPassportSeria();
            if(ps.equals(GOOD_1) || ps.equals(GOOD_2) ){

                response.setExisting(true);
                response.setTemporal(false);
            }
            if(ps.equals(BAD_1) || ps.equals(BAD_2) ){

                response.setExisting(false);//чел не прописан
                response.setTemporal(false);
            }
            if(ps.equals(ERROR_1) || ps.equals(ERROR_2) ){

                CityRegisterException ex = new CityRegisterException("1","GRN ERROR " + ps);
                throw ex;
            }
            if(ps.equals(ERROR_T_1) || ps.equals(ERROR_T_2) ){

                TransportException ex = new TransportException("Transport Error" + ps);
                throw ex;
            }
        }
        if(person instanceof Child){
            response.setExisting(true);
            response.setTemporal(true);
        }

        System.out.println(response.toString());
        return response;
    }
}
