package org.vvb.ex_24_7.University;

import org.apache.poi.ss.usermodel.Row;
import org.vvb.ex_24_7.Student.StudyProfile;

import static org.vvb.ex_24_7.Student.StudyProfile.*;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    private University(){
        this.id = "UNIVER";
        this.fullName = "BIG UNIVER";
        this.shortName = "BU";
        this.yearOfFoundation = 1099;
        this.mainProfile = PHYSICS;
    }
    public University( Row row ){
        this.id = row.getCell(0).getStringCellValue();
        this.fullName = row.getCell(1).getStringCellValue();
        this.shortName = row.getCell(2).getStringCellValue();
        this.yearOfFoundation = (int)row.getCell(3).getNumericCellValue();
        this.mainProfile = StudyProfile.valueOf(row.getCell(4).getStringCellValue());
    }

    @Override
    public String toString() {
        return id+" "+fullName+" "+shortName+" "
                +Integer.toString(yearOfFoundation)+" "+mainProfile.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }
}

