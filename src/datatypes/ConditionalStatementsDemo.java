package datatypes;

import java.util.Scanner;

public class ConditionalStatementsDemo {
    public static void main(String []args) {
        //Example 1

        Scanner keyboard = new Scanner(System.in);


//        System.out.print("/********** MENU *****************\n" +
//                "These are the choices for week of the day. \n" +
//                "Please enter only values from 1-7:\n" +
//                "1. MONDAY\n" +
//                "2. TUESDAY\n" +
//                "3. WEDNESDAY\n" +
//                "4. THURSDAY\n" +
//                "5. FRIDAY\n" +
//                "6. SATURDAY\n" +
//                "7. SUNDAY\n" +
//                "**********************************/\n ");
//
//        int dayOfTheWeek = keyboard.nextInt();
//
//        switch (dayOfTheWeek) {
//            case 1:
//                System.out.println("MONDAY: It is back to work.....");
//
//                System.out.println("Did you have your breakfast?");
//
//                System.out.println("************ SUB MENU *****************");
//                System.out.println("1. Yes, I had my breakfast");
//                System.out.println("2. No, I would like one ");
//                System.out.println("****************************************");
//
//                System.out.println("Enter choice (1 or 2):");
//                int subChoice = keyboard.nextInt();
//
//                    switch (subChoice){
//                        case 1:
//                            System.out.println("Good. Now you have a catchup meeting at 9 A.M. Prepare your notes. ");
//                            break;
//                        case 2:
//                            System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
//                            break;
//                        default :
//                            //user has entered a value which is neither 1 nor 2
//                            System.out.println("NO such choice available");
//                    }
//                break;
//
//            case 2:
//                System.out.println("Tuesday: It is coding time");
//                break;
//
//            case 3:
//                System.out.println("Wednesday: Design the program");
//                break;
//
//            case 4:
//                System.out.println("Thursday: Start coding.....");
//                break;
//
//            case 5:
//                System.out.println("Friday: Run tests and check if the program is working as expected.......");
//                break;
//
//
//            case 6:
//                System.out.println("Saturday: Rest a bit and study a bit.......");
//                break;
//
//
//            case 7:
//                System.out.println("Sunday: I am going to chill .........");
//                break;
//
//            default:
//                System.out.println("Invalid week of DAY");
//        }
        //Example 2

        boolean isEnginOn = false;
        String gear = "P";
        int speed =0;
        int choice = 0;


        while(choice != 5)
        {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");

        System.out.println("Enter your choice: ");

        choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    isEnginOn = !isEnginOn;
                    System.out.println("Engin is ON");
                    break;

                case 2:
                    System.out.print("Enter gear (P, D, R): ");
                    gear = keyboard.next();
                    System.out.println("Gear is now on " + gear);
                    break;

                case 3:
                    if (isEnginOn && !gear.equals("P")) {
                        speed += 10;
                        System.out.println("+10 Speed added");
                    } else {
                        System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;

                case 4:
                    if (isEnginOn && speed > 0){
                        speed -= 5;
                        System.out.println("-5 Speed added");
                    } else {
                        System.out.println("Cannot apply braking while engine is off or car not moving.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println();
        System.out.println("Turning off engine and exiting the car. Goodbye!");
      
    }
}
