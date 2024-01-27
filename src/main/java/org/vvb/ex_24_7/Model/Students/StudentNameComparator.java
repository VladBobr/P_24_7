package org.vvb.ex_24_7.Model.Students;

import java.util.Comparator;

public class StudentNameComparator implements StudentComparator {
    public int compare(Student a, Student b){

        return a.getFullName().compareTo(b.getFullName());
    }
}
