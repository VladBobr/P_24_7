package org.vvb.ex_24_7.Student;

import java.io.FileInputStream;

public enum StudyProfile {
    PHYSICS("Физика"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика"),
    MATHEMATICS("Математика")
    ;

    private String name;
    StudyProfile(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
