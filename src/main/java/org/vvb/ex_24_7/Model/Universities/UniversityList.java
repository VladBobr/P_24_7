package org.vvb.ex_24_7.Model.Universities;

import java.util.ArrayList;
import java.util.Objects;

public class UniversityList extends ArrayList<University> {
    @Override
    public boolean add(University university) {
        return super.add(university);
    }

    public University getUniversity( String id ){
        for (University u : this) {
            if (Objects.equals(u.getId(), id))
                return u;
        }
        return null;
    }
}
