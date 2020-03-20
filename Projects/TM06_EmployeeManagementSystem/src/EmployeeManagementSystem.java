import java.io.*;
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        FileReader read = null;
        FileWriter write = null;
        String empName = "";
        String salary;
        String empId;
        String empAge;
        int choice = 0;
        do {
            try {
                read = new FileReader("input.txt");


                System.out.println("Main Menu\n" +
                        "1. Add an Employee\n" +
                        "2. Display All\n" +
                        "3. Exit");
                choice = Integer.parseInt(in.nextLine());
                switch (choice) {
                    case 1:
                        write = new FileWriter("input.txt",true);
                        System.out.println("Enter Employee ID :");
                        empId = in.nextLine();
                        System.out.println("Enter Employee Name :");
                        empName = in.nextLine();
                        System.out.println("Enter Employee Age :");
                        empAge = in.nextLine();
                        System.out.println("Enter Employee Salary :");
                        salary = in.nextLine();
                        String st = empAge;
                        write.write(empId + " " + empName + " " + empAge + " " + salary+"\n");
                        write.close();
                        break;

                    case 2:
                        int c = 0;

                        read = new FileReader("input.txt");
                        System.out.println("----Report-----");
                        while ((c = read.read()) != -1) {
                            System.out.print((char) c);
                        }
                        System.out.println("----End of Report-----");
                        read.close();
                        break;

                    case 3:
                        System.out.println("Exiting the System");
                        choice = -1;
                        System.exit(0);
                        break;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (choice > 0);

    }
}
