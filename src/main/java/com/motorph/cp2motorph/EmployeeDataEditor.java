/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.exceptions.CsvException;
import java.io.FileWriter;

import javax.swing.table.DefaultTableModel;

public class EmployeeDataEditor {
    
    public static void employeeReader (){
        String csvFile = "src\\employee_data.csv"; 
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                System.out.println("Employee Number: " + record[0] + ", Last Name: " + record[1] + ", First Name: " + record[2] + ", Birthday: " + record[3] + ", Address: " + record[4] + ", Phone Number: " + record[5] + ", SSS: " + record[6] + ", Philhealth: " + record[7] + ", TIN Number: " + record[8] + ", Pagibig: " + record[9] + ", Status: " + record[10] + ", Position: " + record[11] + ", Immediate supervisor: " + record[12] + ", Basic Salary: " + record[13] + ", Rice Subsidy: " + record[14] + ", Phone Allowance: " + record[15] + ", Clothing Allowance: " + record[16] + ", Gross Semi-Annual Salary: " + record[17] + ", Hourly Rate: " + record[18]);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
    
    public void updateEmployeeData(int rowIndex, String updatedEmployeeNumber, String updatedLastName, String updatedFirstName) throws IOException, CsvException {
        List<String[]> records;
        try (CSVReader reader = new CSVReader(new FileReader("src\\employee_data.csv"))) {
            records = reader.readAll();
        }

        // Update the data in the records list
        System.out.println("updateEmployeeData is running and index is: " + rowIndex);
        String[] updatedRow = {updatedEmployeeNumber, updatedLastName, updatedFirstName};
        records.set(rowIndex + 1, updatedRow);

        // Write the updated records back to the CSV file
        try (CSVWriter writer = new CSVWriter(new FileWriter("src\\employee_data.csv"))) {
            writer.writeAll(records);
        }
    }
    
    public DefaultTableModel loadCSV() throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader("src\\employee_data.csv"))) {
            List<String[]> records = reader.readAll();
            
            // Assuming the first row contains the column names
            String[] columnNames = records.get(0);
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            
            // Add rows to the model
            for (int i = 1; i < records.size(); i++) {
                model.addRow(records.get(i));
            }
            return model;
        }
    }
    
    
    
    public void updateDataForm(int selectedEmployeeRow, String employeeNumber, String lastName, String firstName) throws IOException, CsvException {
        updateForm uform = new updateForm();
        uform.updateEmployeeNumber.setText(employeeNumber);
        uform.updateLastName.setText(lastName);
        uform.updateFirstName.setText(firstName);
        int rowIndex = selectedEmployeeRow;
        
        String updatedEmployeeNumber = uform.updateEmployeeNumber.getText();
        String updatedLastName = uform.updateLastName.getText();
        String updatedFirstName = uform.updateFirstName.getText();
        
        uform.show();
        updateEmployeeData(rowIndex, updatedEmployeeNumber, updatedLastName, updatedFirstName);
        }
}
    

