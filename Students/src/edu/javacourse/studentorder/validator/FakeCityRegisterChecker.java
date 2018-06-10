package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

/**
 * Created by javaNoob on 06.06.2018.
 */
public class FakeCityRegisterChecker implements CityRegisterChecker{

    public CityRegisterCheckerResponse checkPerson(Person person)throws CityRegisterException{

        return null;
    }
}
