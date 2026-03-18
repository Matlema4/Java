import javax.swing.*;
import java.util.Scanner;

public class InteractivePayRollSystem {
    public void employeeData(){
        String name = JOptionPane.showInputDialog(null, "Enter Employee Name");
        if(!name.matches("^[a-zA-Z ]+$")){
             JOptionPane.showMessageDialog(null, "Employee name cannot contain numbers or special characters, please try again!");
                return;
        }
        else{
            name = name;
        }

        String id = JOptionPane.showInputDialog(null, "Enter Employee ID");
        
        if(!id.matches("\\d+")){
             JOptionPane.showMessageDialog(null, "Employee ID cannot contain letters or special characters, please try again!");
                return;
        }
        int employeeID = Integer.parseInt(id);
            
        if(employeeID < 0){
        JOptionPane.showMessageDialog(null, "Employee employeeID cannot be negative, please try again!");
        return;
   }
        else{
            employeeID = employeeID;
        }
    
        

        String[] options = {"Hourly", "Annually"};
        int salaryOption = JOptionPane.showOptionDialog(null, "Select Salary Type", "Salary Type", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if(salaryOption == 0){
            double regularHoursPay = 15.00;
        double regularHours = 40.0;
        double overtimeRate = 1.5;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        double totalPay = 0.0;
        if(hoursWorked <= 40){
            totalPay = regularHours * regularHoursPay;
        }
        else if(hoursWorked > 40){
            totalPay = (regularHours * regularHoursPay) + ((hoursWorked - regularHours) * regularHoursPay * overtimeRate);
        }
        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nEmployee ID: " + employeeID + "\nTotal Pay: R" + String.format("%.2f", totalPay));
        }

        else if(salaryOption == 1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual salary: ");
        double annualSalary = scanner.nextDouble();
        //calculate monthly salary, biweekly salary, and weekly salary
        double monthlySalary = annualSalary / 12;
        double biweeklySalary = monthlySalary / 2;
        double weeklySalary = biweeklySalary / 2;
        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nEmployee ID: " + employeeID + "\nAnnual Salary: R" + String.format("%.2f", annualSalary) + "\nMonthly Salary: R" + String.format("%.2f", monthlySalary) + "\nBiweekly Salary: R" + String.format("%.2f", biweeklySalary) + "\nWeekly Salary: R" + String.format("%.2f", weeklySalary));
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid option selected, please try again!");
        }

    }
    public static void main(String[] args) {
        InteractivePayRollSystem payrollSystem = new InteractivePayRollSystem();
        payrollSystem.employeeData();
    }
    
}
