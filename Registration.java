import java.util.Scanner;

public class Registration {
    // Made these variables class-level so they can be accessed in main()
    static String Fname, Lname, email, city;
    static int dob, age;

    public static void UserInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        Fname = s.nextLine();
        System.out.println("Enter Last Name: ");
        Lname = s.nextLine();
        System.out.println("Enter E-mail: ");
        email = s.nextLine();
        System.out.println("Enter City: ");
        city = s.nextLine();
        System.out.println("Enter Year of Birth (in YYYY): ");
        dob = s.nextInt();
        System.out.println("Enter age (in years): ");
        age = s.nextInt();

        if (age >= 18) {
            System.out.println("Courses available ");
            Courses();
        } else {
            System.out.println("No Courses are available, Start Learning");
            Learn();
        }

        System.out.println("\n------- Registration Details -------");
        System.out.println("First Name: " + Fname);
        System.out.println("Last Name: " + Lname);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
        System.out.println("Year of Birth: " + dob);
        System.out.println("Age: " + age);

        s.close(); // Close the scanner here
    }

    private static void Courses() {
        System.out.println("Core Java, MySQL, Basic of C, JDBC");
    }

    private static void Learn() {
        System.out.println("Learn.....");
    }

    public static void main(String[] args) {
        UserInput();


        int result = rUserDataDAO.insertUserData(Fname, Lname, email, city, dob, age);

        if (result == 1) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println("Registration failed. Please try again.");
        }
    }
}