import java.util.*;

public class mad_lib {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    String adj1;
    String noun1;
    String adj2;
    String verb1;
    String adj3;

    System.out.print("Enter an adjective (Description): ");
    adj1 = sc.nextLine();
    System.out.print("Enter a noun (animal or person): ");
    noun1 = sc.nextLine();
    System.out.print("Enter an adjective (Description): ");
    adj2 = sc.nextLine();
    System.out.print("Enter a verb end with -ing (action): ");
    verb1 = sc.nextLine();
    System.out.print("Enter an adjective (Description): ");
    adj3 = sc.nextLine();


    System.out.println("Today I went to a " + adj1 + "zoo.");
    System.out.println("In an exhibit, i saw a " + noun1 + ".");
    System.out.println(noun1 + "was " + adj2 + "and " + verb1 + "!");
    System.out.println("I was "+adj3 + "!");

    sc.close();
    
    }
}
