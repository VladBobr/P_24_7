package org.vvb.ex_24_7.Model.Universities;

public class UniversityNameComparator implements UniversityComparator {
    public int compare(University a, University b){

        return a.getFullName().compareTo(b.getFullName());
    }
}
