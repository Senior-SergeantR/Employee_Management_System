package EmployeeManagementApp;

import java.util.Scanner;

public class Main {


    static  boolean ordering = true;

    public static void menu(){
        System.out.println("\n\n***********Welcome to Employee management System**********" +
                "\n1.Add Employee" +
                "\n2.View Employee" +
                "\n3.Update Employee" +
                "\n4.Delete Employee" +
                "\n5.View All Employees" +
                "\n6.Exit");
    }

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Employee");
                    service.addEmployee();
                }
                case 2 -> {
                    System.out.println("View Employee");
                    service.viewEmployee();
                }
                case 3 -> {
                    System.out.println("Update Employee");
                    service.updateEmployee();
                }
                case 4 -> {
                    System.out.println("Delete Employee");
                    service.deleteEmployee();
                }
                case 5 -> {
                    System.out.println("View All Employees");
                    service.viewAllEmployees();
                }
                case 6 -> {
                    System.out.println("Thank you for using the application!!!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a valid choice");
            }
        }while (ordering);
    }
}
