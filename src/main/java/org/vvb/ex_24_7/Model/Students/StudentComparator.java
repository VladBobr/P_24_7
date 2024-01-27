package org.vvb.ex_24_7.Model.Students;

import java.util.Comparator;

abstract interface StudentComparator extends Comparator<Student> {
    public abstract int compare(Student a, Student b);
}
