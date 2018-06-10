package somepack;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

/**
 * Created by javaNoob on 18.05.2018.
 */
public class G extends Person{
    public G(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public void test(){
       // Person p = new Person();
      //  p.surName ="nd";//default(package-private)
     //   p.givenName ="gd";//private
     //   p.patronymic="pd";//protected

     //   System.out.println(p.surName + " "+p.patronymic +" " +p.givenName);

    }
}
