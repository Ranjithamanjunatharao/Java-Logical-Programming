/*A company has different types of employees, including full-time employees and part-time employees. The company wants to keep track of each employee's personal information, such as their names and contact details, as well as their job-specific information, such as their salary and work hours. Create a superclass called "Employee" with the following attributes: name (String) email (String) phone number (String) salary (double) work hours (int) Create two subclasses of Employee: FullTimeEmployee, with the additional attribute of "benefits" (boolean) PartTimeEmployee, with the additional attribute of "hourly rate" (double) Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes. Also, update the salary of each employee as they receive promotions or raises.*/
import java.util.*;
class Employee
  {
    private String name;
    private String email;
    private String phoneNumber;
    private double salary;
    private int workHours;
    public Employee(String name, String email, String phoneNumber, double salary, int workHours)
    {
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.salary = salary;
      this.workHours = workHours;
    } 
    public String getName()
    {
      return name;
    } 
    public void setName(String name)
    { 
      this.name = name;
    } 
    public String getEmail() 
    { 
      return email;
    } 
    public void setEmail(String email)
    {
      this.email = email; 
    } 
    public String getPhoneNumber()
    { 
      return phoneNumber;
    } 
    public void setPhoneNumber(String phoneNumber)
    { 
      this.phoneNumber = phoneNumber; 
    } 
    public double getSalary()
    { 
      return salary;
    } 
    public void setSalary(double salary)
    {
      this.salary = salary;
    } 
    public int getWorkHours()
    {
      return workHours;
    } 
    public void setWorkHours(int workHours)
    {
      this.workHours = workHours;
    }
  }
class FullTimeEmployee extends Employee
  {
    private boolean benefits;
    public FullTimeEmployee(String name, String email, String phoneNumber, double salary, int workHours, boolean benefits)
    {
      super(name, email, phoneNumber, salary, workHours);
      this.benefits = benefits;
    }
    public boolean hasBenefits()
    {
      return benefits;
    }
    public void setBenefits(boolean benefits)
    {
      this.benefits = benefits;
    } 
    public void displayInfo()
    {
      System.out.println("Name: " + getName()); 
      System.out.println("Email: " + getEmail()); System.out.println("Phone Number: " + getPhoneNumber()); System.out.println("Salary: " + getSalary()); System.out.println("Work Hours: " + getWorkHours()); System.out.println("Benefits: " + hasBenefits());
    }
  } 
 class PartTimeEmployee extends Employee
  {
    private double hourlyRate;
    public PartTimeEmployee(String name, String email, String phoneNumber, double salary, int workHours, double hourlyRate)
    { 
      super(name, email, phoneNumber, salary, workHours); 
      this.hourlyRate = hourlyRate;
    } 
    public double getHourlyRate()
    { 
      return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate)
    {
      this.hourlyRate = hourlyRate;
    } 
    public void displayInfo()
    { 
System.out.println("Name: " + getName()); System.out.println("Email: " + getEmail()); System.out.println("Phone Number: " + getPhoneNumber()); System.out.println("Salary: " + getSalary()); System.out.println("Work Hours: " + getWorkHours()); System.out.println("Hourly Rate: " + getHourlyRate());
    } 
  } 
class test
  {
    public static void main(String[] args)
    {
      FullTimeEmployee fte = new FullTimeEmployee("Ranju", "ranju@gmail.com", "0123456789", 50000, 40, true);
      fte.displayInfo();
      fte.setSalary(60000.0);
      System.out.println("Updated Salary: " + fte.getSalary());
      System.out.println();
      PartTimeEmployee pte = new PartTimeEmployee("Ramya", "ramya@gmail.com", "1234512345", 20000, 20, 15.0);
      pte.displayInfo(); pte.setSalary(25.0); System.out.println("Updated Salary: " + pte.getSalary());
    } 
  }