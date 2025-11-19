
// SET 4: University Staff Management
class UniversityStaffManagement {
    private int staffId;
    private String name;
    public final String UNIVERSITY_NAME = "KMIT University";
    public static int count = 0;

    // Constructor increments count
    public UniversityStaffManagement(int staffId, String name) {
        this.staffId = staffId;
        this.name = name;
        count++;
    }

    public void displayDetails() {
        System.out.println("University Name: " + UNIVERSITY_NAME);
        System.out.println("Staff ID       : " + staffId);
        System.out.println("Staff Name     : " + name);
    }
}

// TeachingStaff subclass
class TeachingStaff extends UniversityStaffManagement {
    private String subject;

    public TeachingStaff(int staffId, String name, String subject) {
        super(staffId, name);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject        : " + subject);
        System.out.println("--------------------------------");
    }
}

// NonTeachingStaff subclass
class NonTeachingStaff extends UniversityStaffManagement {
    private String department;

    public NonTeachingStaff(int staffId, String name, String department) {
        super(staffId, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department     : " + department);
        System.out.println("--------------------------------");
    }
}

// Main class
public class MainSet4 {
    public static void main(String[] args) {
        TeachingStaff t1 = new TeachingStaff(101, "Dr. Arjun", "Physics");
        TeachingStaff t2 = new TeachingStaff(102, "Dr. Priya", "Mathematics");
        NonTeachingStaff n1 = new NonTeachingStaff(103, "Mr. Ravi", "Accounts");

        t1.displayDetails();
        t2.displayDetails();
        n1.displayDetails();

        System.out.println("Total Staff Members: " + UniversityStaffManagement.count);
    }
}
