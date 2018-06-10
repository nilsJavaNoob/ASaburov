package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.domain.other.Adult;

import java.time.LocalDate;

/**
 * Created by n on 08.05.18.
 */
public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so = buildStudentOrder(10);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }
    static StudentOrder  buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificatedId("" + (123456000 + id));
        so.setMarrigeDate(LocalDate.of(2016,7,4));
        so.setMarriageOffice("Отдел ЗАГС");

        Address address = new Address("195000", "Заневский пр.","12", "", "142");
        //Муж
        Adult husband = new Adult("Васильев","Андрей","Васильевич", LocalDate.of(1997,8, 24));
              husband.getPassportSeria("" + (100 + id));
              husband.getPasspotNumber("" + (100000 + id));
              husband.setIssueDate(LocalDate.of(2017,9,15));
              husband.setIssueDepartment("Отдел милиции №" + id);
              husband.setStudentId("" + (100000 + id));
              husband.setAddress(address);
              //жена
        Adult wife = new Adult("Петрова","Вероника","Алексеева",LocalDate.of(1998,3,12));
              wife.setPassportSeria("" + (2000 + id));
              wife.setPasspotNumber("" + (200000 + id));
              wife.setIssueDate(LocalDate.of(2018,4,5));
              wife.setIssueDepartment("Отдел милиции №" + id);
              wife.setStudentId("" + (200000 + id));
              wife.setAddress(address);
              //child
        Child child = new Child("Петрова","Ирина","Викторовна",LocalDate.of(2018,6,29));
              child.setCertificateNumber("" + (300000 + id));
              child.setIssueDate(LocalDate.of(2018,7,19));
              child.setIssueDepartment("Отдел ЗАГС №" + id);
              child.setAddress(address);

          return so;
    }
}//class
