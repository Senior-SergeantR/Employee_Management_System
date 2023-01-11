package EmployeeManagementApp;

import java.util.HashSet;
import java.util.Scanner;


public class EmployeeService {

    HashSet<Employee> empset = new HashSet<>();

    Employee emp1 = new Employee(101,"Shital",24,"Developer","IT", 25000);
    Employee emp2 = new Employee(102,"Meena",26,"Tester","CO", 57000);
    Employee emp3 = new Employee(103,"Bob",20,"DevOps Eng","Admin", 50000);
    Employee emp4 = new Employee(104,"Max",27,"Systems Eng","CO", 70000);

    Scanner sc =new Scanner(System.in);

    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;
    boolean found = false;



    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

    // this a method for viewing all employees

    public void viewAllEmployees(){
        for (Employee emp:empset){
            System.out.println(emp);
        }

    }
 // viewing employee base on their id
    public void viewEmployee(){
        System.out.println("Enter employee id: ");

        id = sc.nextInt();

        for (Employee emp:empset){

            if (emp.getId()==id){
                System.out.println(emp);
                found = true;
            }
        }

        if (!found){
            System.out.println("There is no such employee");
        }
    }


    // method that update employee details to the system
    public void updateEmployee() {
        System.out.println("Enter Id:");
        id = sc.nextInt();
        found= false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name= sc.next();

                System.out.println("Enter new salary: ");

                salary = sc.nextDouble();

                emp.setName(name);
                emp.setSalary(salary);

                System.out.println("Update details of employee are: ");
                System.out.println(emp);
                found= true;
            }
        }


        if (!found){
            System.out.println("The employee is not available");

        }else {
            System.out.println("Updated successfully!!!");
        }

    }

    // a method that deletes an employee from the system

    public void deleteEmployee(){
        System.out.println("Enter Employee Id to delete: ");
        id= sc.nextInt();
        Employee empdelete = null;
        boolean found = false;
        for (Employee emp: empset){
            if(emp.getId()==id){
                empdelete=emp;
                found = true;
            }
        }
        if (!found){
            System.out.println("The Employee doesn't exist");
        }else {
            empset.remove(empdelete);
            System.out.println("Employee deleted Successfully!!!");
        }
    }

    // adding employee method

    public void addEmployee(){
        System.out.println("Enter Id of the Employee: ");
        id= sc.nextInt();

        System.out.println("Name of the Employee: ");
        name = sc.next();

        System.out.println("Enter Age of the Employee: ");
        age = sc.nextInt();

        System.out.println("Enter Designation of employee: ");
        designation = sc.next();

        System.out.println("Enter Department: ");
        department = sc.next();

        System.out.println("Enter Salary");
        salary = sc.nextDouble();

        Employee emp = new Employee(id,name,age,designation,department,salary);

        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee Added Successfully!!!");

    }

}
