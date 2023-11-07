package org.vvb.ex_24_7;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.vvb.ex_24_7.Student.Student;
import org.vvb.ex_24_7.University.University;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.vvb.ex_24_7.University.UniversityList;

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

            System.out.println(universityList);
            System.out.println();
            System.out.println();
            System.out.println(studentList);

        }catch(Exception e){
            System.out.println(e);
        }



//        XSSFSheet sheetSt = db.getWorkbook.getSheet("Студенты");

//        University u = new University();
  //      Student s = new Student( u );

    //    System.out.println(u);
    }
}