package edu.javacourse.studentorder.domain;

/**
 * Created by javaNoob on 24.05.2018.
 */
public class CityRegisterCheckerResponse {
    boolean existing;
    Boolean temporal = null;
    /*Integer d;
    Double f;
    Long g;  
    Character ch;*/

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }


}
