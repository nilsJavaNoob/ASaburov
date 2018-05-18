package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person {
    private  String passportSeria;
    private  String passpotNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentId;

//====
    //public String getAdultString(){
      //  return "name"+ " " + surName + " " + givenName + " " + patronymic + " !";
    //}
//====

    public String getPassportSeria() {
         = "ddd";
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPasspotNumber() {
        return passpotNumber;
    }

    public void setPasspotNumber(String passpotNumber) {
        this.passpotNumber = passpotNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}//class
