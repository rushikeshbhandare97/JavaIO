import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService<EmployeePayrollData> {
    private static UnicodeSet employeePayrollDataList;

    public List<EmployeePayrollData> getEmployeePayrollDataList() {
        return (List<EmployeePayrollData>) employeePayrollDataList;
    }

    public void setEmployeePayrollDataList(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollDataList = (UnicodeSet) employeePayrollDataList;
    }

    public enum IOService {CONSOLE_IO , FILE_IO , DB_IO ,REST_IO}
    private List<EmployeePayrollData> employeePayrollDataList;

    public  EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList, List<EmployeePayrollData> employeePayrollDataList) {
        EmployeePayrollService.employeePayrollDataList = (UnicodeSet) employeePayrollDataList;
    }

    public void setEmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {...}

    public void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList, (List) employeePayrollDataList);
        Scanner consoleService.Scanner consoleInputReader;
        readEmployeePayrollData(consoleInputReader);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmploeePayrollData();

    }
    private void readEmployeePayrollData(Scanner consoleInputReader) {

        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter employee salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollDataList.add(new EmployeePayrollData(id, name, salary));

    }

    private  void writeEmploeePayrollData() {

     System.out.println("\nWriting employee payroll roaster to console\n +employeePayrollList ");



    }
}
