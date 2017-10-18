import java.time.LocalDate;

/**
 * Created by joacim on 2017-10-14.
 */

public class Customer {

    private String firstName;
    private String lastName;
    private String birthDate;
    private LocalDate paidDate;


    public Customer(String firstName, String lastName, String birthDate, LocalDate paidDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.paidDate = paidDate;

    }

    public String getFirstName() {
        return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }
}


