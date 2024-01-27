package org.vvb.ex_24_7.Model.Universities;

import org.vvb.ex_24_7.Model.Students.Student;

import java.util.Comparator;

abstract interface UniversityComparator extends Comparator<University> {
    public abstract int compare(University a, University b);
}
