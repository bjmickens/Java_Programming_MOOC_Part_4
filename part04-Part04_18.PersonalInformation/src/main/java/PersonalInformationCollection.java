
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = scanner.nextLine();

        while (!(firstName.equals(""))) {
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));

            System.out.println("First name: ");
            firstName = scanner.nextLine();
        }
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
