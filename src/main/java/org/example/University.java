package org.example;

import static org.example.StudyProfile.INGENER;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    University(){
        this.id = "UNIVER";
        this.fullName = "BIG UNIVER";
        this.shortName = "BU";
        this.yearOfFoundation = 1099;
        this.mainProfile = INGENER;
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

