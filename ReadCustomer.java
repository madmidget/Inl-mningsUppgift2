import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joacim on 2017-10-13.
 */

public class ReadCustomer {

    public static void main(String[] arg) throws IOException {

        Scanner sc = new Scanner(new File("Customers.txt"));

        String s = JOptionPane.showInputDialog("Namn eller personummer");

        List<Customer> customers = readCustomers(sc);

        boolean foundCustomer = false;
        for (Customer c : customers) {
            if (s.equalsIgnoreCase(c.getFirstName()) || s.equals(c.getBirthDate())) {
                foundCustomer = true;
                processMembership(c);
            }
        }

        if (!foundCustomer) {
            System.out.println("Personen tränar inte här");
        }
    }

    private static void processMembership(Customer c) throws IOException {

        if (LocalDate.now().minusMonths(12).isBefore(c.getPaidDate())) {
            System.out.println("Personen är medlem");
            Writer writer = new Writer();
            writer.write(c.getFirstName() + " " + c.getLastName() + " " + c.getBirthDate() + " " + LocalDate.now());

        } else {
            System.out.println("Personens medlemskort har gått ut");
        }
    }


    private static List<Customer> readCustomers(Scanner sc) {
        List<Customer> customers = new ArrayList<>();

        while (sc.hasNext()) {
            String birthDate = sc.next().replace(",", "");
            String firstName = sc.next();
            String lastName = sc.next();
            LocalDate paidDate = LocalDate.parse(sc.next());

            customers.add(new Customer(firstName, lastName, birthDate, paidDate));
        }
        return customers;
    }
}





