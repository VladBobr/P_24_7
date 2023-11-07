package org.vvb.ex_24_7;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RWDB {
    private static String dbName;
    private static FileInputStream dataStream;
    private static XSSFWorkbook workbook;
    public RWDB() throws Exception {
        if( dataStream == null ) {
            throw new Exception("db not opened");
        }
    }

    public RWDB( String path ) throws Exception {
        try{
            if( dataStream == null) {
                dbName  = path;
                dataStream = new FileInputStream(path);
            } else if (dbName != path) {
                throw new Exception("DB already open: " + dbName);
            }
        } catch (FileNotFoundException e) {
            throw new Exception("File not found: " + path);
        }
    }

    public XSSFWorkbook getWorkbook() throws IOException {
        if( workbook == null){
            workbook = new XSSFWorkbook(dataStream);
        }
        return workbook;
    }

}
