class UniversityStaffManagement 
{    
    private int staffId;
    private String name;
    public final String University_name = "KMIT University";
    public static int count = 0;
    
    public UniversityStaffManagement(int staffId,String name)
    {
        this.staffId = staffId;
        this.name = name;
    }
    class TeachingStaff extends UniversityStaffManagement
    {
        public static String sub;

        public TeachingStaff(int staffId, String name,String sub) {
            super(staffId, name);
        }
    
    }
    class NonTeachingStaff extends UniversityStaffManagement 
    {
        public static String dept;

        public NonTeachingStaff(int staffId, String name,String dept) {
            super(staffId, name);
        }
        
    }
    int numberOfStaffMem()
    {
      return count += 1;  
    }
    public void displayDetails()
    {
        System.out.println("Staff ID          : " + staffId);
        System.out.println("Name of the staff : " + name);
        System.out.println("In Field          : " + University_name);
        System.out.println("Number of Staff members: " + numberOfStaffMem());
    }
    public void display()
    {
        System.out.println("Teaching : ");
    }
    public static void main(String[] args)
    {
        UniversityStaffManagement Staff1 = new UniversityStaffManagement(101,"A");
        UniversityStaffManagement Staff2 = new UniversityStaffManagement(102,"B");
        UniversityStaffManagement Staff3 = new UniversityStaffManagement(103,"C");
        
        Staff1.displayDetails();
        Staff2.displayDetails();
        Staff3.displayDetails();

        
    }
}

/*
 * SET 1:
Employee Management System

Write a Java Program for a
company wants to maintain details of employees and managers.
Create a base class Employee with private attributes 
empId, name, and salary.Provide public getter/setter 
methods to access these fields.
Create a derived class Manager that inherits from Employee and has
an additional attribute department.The company gives a fixed bonus
to all managers, which should be represented using a final static 
variable BONUS. Create a method calculateTotalSalary() 
in Manager that adds bonus to salary.
Demonstrate creating objects and displaying their complete details.


----------------------------------------------------------



Set 2: 

Vehicle Information System

Case:
Write a Java Program for a 
system to manage vehicles.Define a base class Vehicle with 
private data members model, price.Use public methods to set 
and get these details.Derive two subclasses Car and Bike.
Define a final method showVehicleType() in Vehicle which
 displays the type of vehicle.Add a static counter variable
 to count how many vehicles are created.Display the total 
count of vehicles using a static method displayCount().

---------------------------------------------------------------



SET 3:
 Bank Account Simulation

Write a Java Program for a simple bank system.
Base class names BankAccount with private fields like accountNumber,
 balance and
public methods like deposit(), withdraw(), getBalance().Subclasses
 are SavingsAccount (adds interest rate, overrides withdraw() with balance check) 
and CurrentAccount (allows overdraft facility).

Use a final static field BANK_NAME = "National Bank".Display all 
account details along with the bank name.Keep a static counter to 
show the total number of accounts created.
----------------------------------------------------------------



SET 4:
University Staff Management

Write a Java Program for a university 
employs teaching and non-teaching staff.Create a base class Staff
 with private fields like staffId, name.Derive two subclasses like
 TeachingStaff (with subjects taught) and NonTeachingStaff
 (with department name).
Use a final field UNIVERSITY_NAME = "KMIT University". 
Maintain a static variable count to keep track of staff members. 
Provide public methods to enter and display details. 
Display staff count after adding each staff member.



------------------------------------------------------------------

SET 5: 

Online Store Inventory

Write a Java Program for an inventory 
system for an online store with base class Product with private members
 productId, productName, price. Two Derived classes Electronics
 and Clothing.Add a final discount value 
(e.g., final double DISCOUNT = 0.05) applied on all products.
 Maintain a static field productCount to count total items added. 
Implement public methods to add products and display discounted prices.

-----------------------------------------------------------------------------
 */