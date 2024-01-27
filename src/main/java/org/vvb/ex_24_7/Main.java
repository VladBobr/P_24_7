package org.vvb.ex_24_7;

import org.apache.poi.ss.usermodel.Row;
import org.vvb.ex_24_7.Model.Students.Student;
import org.vvb.ex_24_7.Model.Students.StudentsComparators;
import org.vvb.ex_24_7.Model.Universities.UniversitiesComparators;
import org.vvb.ex_24_7.Model.Universities.University;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.vvb.ex_24_7.Model.Universities.UniversityList;

import static org.vvb.ex_24_7.Model.Students.StudentsComparators.*;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        try {
            RWDB db = new RWDB("./src/main/resources/universityInfo.xlsx");

            UniversityList universityList = new UniversityList();

            ArrayList<Student> studentList = new ArrayList<Student>();

            Iterator<Row> it = db.getWorkbook().getSheet("Университеты").iterator();
            if( it.hasNext() )
                it.next();
            while( it.hasNext() ){
                universityList.add(new University(
                        it.next()
                ));
            }

            it = db.getWorkbook().getSheet("Студенты").iterator();
            if( it.hasNext() )
                it.next();
            while( it.hasNext() ){
                studentList.add(new Student(
                        universityList,
                        it.next()
                ));
            }

            universityList.stream()
                    .sorted(UniversitiesComparators.BY_NAME.getComparator())
                    .forEach(System.out::println);

            System.out.println();

            studentList.stream()
                    .sorted(StudentsComparators.BY_EXAM.getComparator())
                    .forEach(System.out::println);

        }catch(Exception e){
            System.out.println(e);
        }



//        XSSFSheet sheetSt = db.getWorkbook.getSheet("Студенты");

//        University u = new University();
  //      Student s = new Student( u );

    //    System.out.println(u);
    }
}