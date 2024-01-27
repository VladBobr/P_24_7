package org.vvb.ex_24_7.Model.Students;

class StudentExamComparator implements StudentComparator {
    public int compare(Student a, Student b){

        return Float.compare(a.getAvgExamScore(), b.getAvgExamScore());

    }
}
