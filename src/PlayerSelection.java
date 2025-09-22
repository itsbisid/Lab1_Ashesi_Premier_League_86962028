import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome! Enter the details of the player: ");

        System.out.print("Enter the player's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the player's Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the player's height in metres: ");
        double heightm = scanner.nextDouble();

        System.out.print("Enter the player's weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the player's Jersey Number: ");
        int jerseyNumber = scanner.nextInt();

        System.out.println("PLAYERS DETAILS");
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightm + "m"); // fixed
        System.out.println(weight + "lbs");
        System.out.println("Jersey number - " + jerseyNumber);

        // Task 2
        double pound = 0.45359237; // conversion constant
        double meter = 100;        // conversion constant
        double weightkg = pound * weight; // convert the weight to kilograms
        int weightkgInt = (int) weightkg; // Typecasting the weight onto an integer
        double heightcm = heightm * meter; // convert the height

        System.out.println("---PLAYERS DETAILS WITH CONVERTED VALUES---");
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + heightcm + "cm");
        System.out.println(weightkgInt + "kg");
        System.out.println("Jersey number - " + jerseyNumber);

        // Task 3
        System.out.println("---CHANGE IN PLAYER STATISTICS---");
        System.out.println("Current age: " + age);

        age++; // Increment of age
        jerseyNumber--; // decrement of the jersey number (fixed comment)

        System.out.println("The player age at the end of the season is: " + age);
        System.out.println("After penalty, the jersey number is: " + jerseyNumber);

        // Task 4
        System.out.println("---CHECK FOR ELIGIBILITY---");
        boolean eligible = (age >= 18 && age <= 35 && weightkgInt < 90);
        if (eligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // Applying the OR operator
        if (age < 18 || weightkgInt >= 90) {
            System.out.println("The player is Too young and Over Weight");
        }

        // Task 5
        System.out.println("---CATEGORIZING PLAYERS BY AGE---");
        String category;
        if (age < 20) {
            category = "Rising star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("Category: " + category);


        // Task 6
        System.out.println("---POSITION ASSIGNMENT---");
        String position;
        switch (jerseyNumber) {
            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Player position not known"; break;
        }
        System.out.println("Position:" + position);

        // Task 7
        System.out.println("---UNWANTED FALL-THROUGH---");
        switch (jerseyNumber) {
            case 2: System.out.println("Case 2: Defender");
            case 6: System.out.println("Case 6: Midfielder");
            case 7: System.out.println("Case 7: Winger");
            default: System.out.println("Default reached!");
        }

        // Task 7B
        System.out.println("---Task 7B: Grouped Cases---");
        switch (jerseyNumber) {
            case 2: case 5: System.out.println("Defender"); break;
            case 6: case 8: System.out.println("Midfielder"); break;
            case 7: case 11: System.out.println("Winger"); break;
            case 9: System.out.println("Striker"); break;
            default: System.out.println("Unknown Position"); break;
        }

        // Task 8
        System.out.println("---STARTING LINEUP DECISION---");
        String startinglineup; // create a string for the player lineup
        if (category.equals("Prime Player")) { // use .equals() to show comparison
            if (weightkgInt < 80) {
                startinglineup = "Starting Lineup";
            } else {
                startinglineup = "Bench";
            }
        } else {
            startinglineup = "Bench";
        }
        System.out.println("Lineup Decision: " + startinglineup);

        // Task 9
        System.out.println("TERNARY OPERATOR");
        String FinalDecision = (eligible ? "Play" : "Rest");
        System.out.println("Final Decision: " + FinalDecision);

        // Task 10
        System.out.println(" ---PLAYER REPORT--- ");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightcm + " cm");
        System.out.println("Weight: " + weightkgInt + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + startinglineup);
        System.out.println("Final Decision: " + FinalDecision);

        scanner.close();
    }
}
