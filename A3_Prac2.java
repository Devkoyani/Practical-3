import java.util.Scanner;
import java.util.Vector;
public class A3_Prac2 {
    interface IPrinter {
        void displayPersonalDetails();
        void displayJobDetails();
    }
    interface IScanner {
        void getPersonalDetails();
        void getJobDetails();
    }
    class Details implements IPrinter, IScanner {
        String name;
        String address;
        String city;
        String companyName;
        double salary;
        // creating object of scanner class
        Scanner object = new Scanner(System.in);
        public void getPersonalDetails() {
            System.out.print("Enter Name : ");
            name = object.nextLine();
            System.out.print("Enter Address : ");
            address = object.nextLine();
        }
        public void getJobDetails() {
            System.out.print("Enter Company Name : ");
            companyName = object.nextLine();
            System.out.print("Enter Salary : ");
            salary = object.nextInt();
        }
        public void displayPersonalDetails() {
            System.out.println("Your Name : " + name);
            System.out.println("Your Address : " + address);
        }
        public void displayJobDetails() {
            System.out.println("Company Name : " + companyName);
            System.out.println("Salary : " + salary);
        }
    }
    public class Concrete {
        public static void main(String[] args) {
            Details d[] = new Details[5];
            for (int x = 0; x < 5; x++) {
                d[x] = new Details();
            }
            Vector<Details> object1 = new Vector<Details>();
            for (int k = 0; k < 5; k++) {
                object1.add(d[k]);
            }
            for (int i = 0; i < 5; i++)
            {
                System.out.println("For "+(i+1)+" Detail ");
                d[i].getPersonalDetails();
                d[i].getJobDetails();
            }
            for (int j = 0; j < 5; j++) {
                d[j].displayPersonalDetails();
                d[j].displayJobDetails();
            }
        }
    }
}
