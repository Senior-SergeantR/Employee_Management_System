package EmployeeManagementApp;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String Designation;
    private String Department;
    private double salary;

    public Employee(int id, String name, int age, String Designation, String department,double salary){
        super();
        this.id=id;
        this.name = name;
        this.age =age;
        this.salary = salary;
        this.Department = department;
        this.Designation = Designation;


    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void  setAge(int age){
        this.age =age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        this.Designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Designation='" + Designation + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
