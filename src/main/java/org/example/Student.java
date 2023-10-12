package org.example;

public class Student {
    String universityId;
    String fullName;
    int currentCourseNumber;
    float avgExamScore;

    Student(University u){
        this.universityId = u.getId();
        this.fullName = "Kuku Ku";
        this.currentCourseNumber = 1;
        this.avgExamScore = 4.f;
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
