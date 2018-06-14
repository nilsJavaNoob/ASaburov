package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.other.Adult;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
private long studentOrderId;
private Adult husband;
private Adult wife;
private List<Child> children;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public void addChild(Child child){
        if (children == null){
            children = new ArrayList<Child>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setMarriageCertificatedId(String s) {
    }

    public void setMarrigeDate(LocalDate of) {
    }

    public void setMarriageOffice(String s) {
    }
}//class
