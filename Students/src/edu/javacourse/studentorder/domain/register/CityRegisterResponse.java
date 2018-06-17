package edu.javacourse.studentorder.domain.register;

/**
 * Created by javaNoob on 24.05.2018.
 */
public class CityRegisterResponse
{
    boolean existing;
    boolean temporal;
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

    @Override
    public String toString() {
        return "CityRegisterResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}//class
