package org.vvb.ex_24_7.Model.Students;

import org.apache.poi.ss.usermodel.Row;
import org.vvb.ex_24_7.Model.Universities.University;
import org.vvb.ex_24_7.Model.Universities.UniversityList;

public class Student {

    String universityId;
    String fullName;
    int currentCourseNumber;
    float avgExamScore;

    public Student(University u){
        this.universityId = u.getId();
        this.fullName = "Kuku Ku";
        this.currentCourseNumber = 1;
        this.avgExamScore = 4.f;
    }

    public Student(UniversityList ul, Row row ){
        this.universityId = ul.getUniversity( row.getCell(0).getStringCellValue() ).getId();
        this.fullName = row.getCell(1).getStringCellValue();
        this.currentCourseNumber = (int)row.getCell(2).getNumericCellValue();
        this.avgExamScore = (float)row.getCell(3).getNumericCellValue();
    }

    @Override
    public String toString() {
        return universityId + " " + fullName+ " "+
                Integer.toString(currentCourseNumber)+" "+Float.toString(avgExamScore);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

}
