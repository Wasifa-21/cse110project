package hp.eta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Formatter;


public class Eta {


    public static void main(String[] args) {
      

        for (int i = 1; i > 0; i++) {
            System.out.println("Select Your Categories:-");
            System.out.println("1.Food.");
            System.out.println("2.Transportation.");
            System.out.println("3.Entertainment.");
            System.out.println("4.Health");
            System.out.println("5.Education.");
            System.out.println("6.Exit.");

            System.out.println("Choose your option-");
            Scanner num = new Scanner(System.in);
            int choice = num.nextInt();

            File dir = new File("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker");
            dir.mkdir();

            File File = new File("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

            try {
                File.createNewFile();

                if (choice == 1) {

                    int value2;
                    String line2;
                    try {
                        Formatter formatter = new Formatter("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

                        for (int j = 1; j > 0; j++) {

                            System.out.println("Information about Food:");

                            System.out.println("Date of Buying:");

                            LocalDate date = LocalDate.now();
                            System.out.println(date);

                            System.out.println("Amount:");

                            Scanner num2 = new Scanner(System.in);
                            value2 = num2.nextInt();

                            System.out.println("Write down the expense description:");

                            Scanner line = new Scanner(System.in);
                            line2 = line.nextLine();

                            formatter.format("%d %s", value2, line2);

                            break;

                        }
                        formatter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("e");
                    }
                }

                if (choice == 2) {
                    int value3;
                    String line3;
                    try {
                        Formatter formatter = new Formatter("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

                        for (int j = 1; j > 0; j++) {

                            System.out.println("Information about Transportation:");

                            System.out.println("Date of Buying:");

                            LocalDate date1 = LocalDate.now();
                            System.out.println(date1);

                            System.out.println("Amount:");

                            Scanner num3 = new Scanner(System.in);
                            value3 = num3.nextInt();

                            System.out.println("Write down the expense description:");

                            Scanner line = new Scanner(System.in);
                            line3 = line.nextLine();

                            formatter.format("%d %s", value3, line3);

                            break;

                        }
                        formatter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("e");
                    }
                }
                if (choice == 3) {
                    int value4;
                    String line4;
                    try {
                        Formatter formatter = new Formatter("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

                        for (int j = 1; j > 0; j++) {

                            System.out.println("Information about Entertainment:");

                            System.out.println("Date :");

                            LocalDate date2 = LocalDate.now();
                            System.out.println(date2);

                            System.out.println("Amount:");

                            Scanner num4 = new Scanner(System.in);
                            value4 = num4.nextInt();

                            System.out.println("Write down the expense description:");

                            Scanner line = new Scanner(System.in);
                            line4 = line.nextLine();

                            formatter.format("%d %s", value4, line4);

                            break;

                        }
                        formatter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("e");
                    }
                }
                if (choice == 4) {
                    int value5;
                    String line5;
                    try {
                        Formatter formatter = new Formatter("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

                        for (int j = 1; j > 0; j++) {

                            System.out.println("Information about Health:");

                            System.out.println("Date of Buying:");

                            LocalDate date3 = LocalDate.now();
                            System.out.println(date3);

                            System.out.println("Amount:");

                            Scanner num5 = new Scanner(System.in);
                            value5 = num5.nextInt();

                            System.out.println("Write down the expense description:");

                            Scanner line = new Scanner(System.in);
                            line5 = line.nextLine();

                            formatter.format("%d %s", value5, line5);

                            break;

                        }
                        formatter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("e");
                    }
                }

                if (choice == 5) {
                    int value6;
                    String line6;
                    try {
                        Formatter formatter = new Formatter("C:/Users/Hp/OneDrive/Desktop/ExpenseTracker/ETA.txt");

                        for (int j = 1; j > 0; j++) {

                            System.out.println("Information about Education:");

                            System.out.println("Date of Buying:");

                            LocalDate date4 = LocalDate.now();
                            System.out.println(date4);

                            System.out.println("Amount:");

                            Scanner num6 = new Scanner(System.in);
                            value6 = num6.nextInt();

                            System.out.println("Write down the expense description:");

                            Scanner line = new Scanner(System.in);
                            line6 = line.nextLine();

                            formatter.format("%d %s", value6, line6);

                            break;

                        }
                        formatter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("e");
                    }
                }
                if (choice == 6) {

                    break;
                }

            } catch (IOException e) {
                System.out.println("e");
            }
        }

        System.out.println(
                "Enter the salary:");
        Scanner sal = new Scanner(System.in);
        int salary = sal.nextInt();

        System.out.println(
                "Enter the percentage amount for Food:");
        Scanner salF = new Scanner(System.in);
        int salaryF = salF.nextInt();

        int sal1 = (salary * salaryF) / 100;

        System.out.println(
                "The expense percentage for Food-" + sal1 + "$");

        System.out.println(
                "Enter the percentage amount for Transportation:");
        Scanner salT = new Scanner(System.in);
        int salaryT = salT.nextInt();

        double sal2 = salary * salaryT / 100;

        System.out.println(
                "The expense percentage for Transportation -" + sal2 + "$");

        System.out.println(
                "Enter the percentage amount for Entertainment:");
        Scanner salE = new Scanner(System.in);
        int salaryE = salE.nextInt();

        double sal3 = salary * salaryE / 100;

        System.out.println(
                "The expense percentage for Entertainment-" + sal3 + "$");

        System.out.println(
                "Enter the percentage amount for Health:");
        Scanner salH = new Scanner(System.in);
        int salaryH = salH.nextInt();

        double sal4 = salary * salaryH / 100;

        System.out.println(
                "The expense percentage for Health-" + sal4 + "$");

        System.out.println(
                "Enter the percentage amount for Education:");
        Scanner salEd = new Scanner(System.in);
        int salaryEd = salEd.nextInt();

        double sal5 = salary * salaryEd / 100;

        System.out.println(
                "The expense percentage for Education-" + sal5 + "$");

        System.out.println(
                "Enter the percentage amount for Others:");
        Scanner salO = new Scanner(System.in);
        int salaryO = salO.nextInt();

        double sal6 = salary * salaryO / 100;

        System.out.println(
                "Others-" + sal6 + "$");

        double Sum = sal1 + sal2 + sal3 + sal4 + sal5 + sal6;

        System.out.println(
                "Total expense of month " + Sum);

        if (Sum > salary) {
            System.out.println("The budget is not under control");
        } else if (Sum < salary) {
            System.out.println("The budget is perfect");
        } else {
            System.out.println("Budget should be fixed");
        }
    }
}
