package com.example.minimumfromfile.service;

import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.function.Consumer;

@Service
@RequiredArgsConstructor
public class FileHandler {

    public void readFile(String filePath, Consumer<Integer> cellConsumer) {
        try (FileInputStream file = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                cellConsumer.accept((int) row.getCell(0).getNumericCellValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
