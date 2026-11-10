package datatypes;

public class StringDemo {
    public static void main(String[] args) {

        // Exercise for String : 1//

        System.out.println("Exercise for String : 1");
        System.out.println("\n");

        String firstName = "Harry";
        String lastName = "Grow";
        String email =  "harry.grow@example.com";

        String userName = firstName + lastName;
        // Merging two string
        String userNameInLowerCase = userName.toLowerCase();

        //Replacing text
        String newEmail = email.replace("example.com","gamil.com");
        //Finding Location for @
        int atIndex = email.indexOf('@');

        System.out.println("username after conversion and concatenation: " + userNameInLowerCase);
        System.out.println("email after replacing example.com with gmail.com: " + newEmail);
        System.out.println("index of @ in the email address is: " + atIndex);

        System.out.println("\n");

        // Exercise for String : 2//

        System.out.println("Exercise for String : 2");
        System.out.println("\n");

        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();

        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialise the length of shortened book title
        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle =  bookTitle.substring(0, maxLength);
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = true;
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

        System.out.println("\n");

        // Exercise for String : 3//
        System.out.println("\n");

        System.out.println("Exercise for String : 3");

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Declare and initialize an array of Super hero names
        String[] superheroNames = {"Batman", "Superman", "Captain America", "Spider-Man", "Iron Man"};

        //TODO 1: Print all the 5 superheroes names as suggested in the example
        // Print the superhero names
        System.out.println("Superhero Names: ");
        System.out.println(superheroNames[0]);
        System.out.println(superheroNames[1]);
        System.out.println(superheroNames[2]);
        System.out.println(superheroNames[3]);
        System.out.println(superheroNames[4]);


        //TODO 2: Print the introductionYear of the superheroes.
        // Print the introduction years
        System.out.println("Introduction Years:");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);


        // TODO 3a: Print the original name of the third superhero
        System.out.println("Original superhero name at position 3: " + superheroNames[2]);

        // TODO 3b: Modify the third superhero name
         superheroNames[2] =  "Thor";

        // TODO 3c: Print the modified name of the third superhero
        System.out.println("Modified superhero name at position 3: " + superheroNames[2]);

        // TODO 4a: Print the original year of introduction of the third superhero
        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);

        // TODO 4b: Modify the year of introduction of the third superhero
        introductionYears[2] = 2011;
        // TODO 4c: Print the modified year of introduction of the third superhero
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);


        // TODO 5a: Print the length of the array containing superhero names
        int lengthOfNames = superheroNames.length;
        System.out.println("Total superheroes names in String array: "+ lengthOfNames);

        // TODO 5b: Print the length of the array containing superhero year of introduction
        int lengthOfYears = introductionYears.length;
        System.out.println("Total superheroes introduction year in int array: "+ lengthOfYears);



        // Exercise for String : 4//
        System.out.println("\n");
        System.out.println("Exercise for String : 4");
        System.out.println("\n");

        //TODO 1: Declare and initialize variable for First Name
        String firstNameCustomer = "Sandy";

        //TODO 1: Declare and initialize variable for Last Name
        String lastNameCustomer = "Jones";

        //TODO 1: Declare and initialize variable for Movie Title
        String movieTitle = "The Source Code";

        //TODO 1: Declare and initialize variable for Number of tickets
        int numberOfTickets = 8;

        //TODO 1: Declare and initialize variable for Price per ticket
        double pricePerTicket = 10.57;

        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
        double totalPrice = numberOfTickets * pricePerTicket;
        System.out.println("Total Price of " +  numberOfTickets +  " tickets: " + totalPrice);

        //TODO 3: Concatenate first name and last name into new variable username with no space in between
        // first and last name and convert them to lower case
        String username = firstNameCustomer.toLowerCase() + lastNameCustomer.toLowerCase();
        System.out.println("username : " + userName);

        // TODO 4: Convert the movie title to upper case and assign to variable movieName
        String movieName = movieTitle.toUpperCase();
        System.out.println("Updated movie name : " + movieName);

        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
        System.out.println("Thank you for choosing us for booking your movie tickets\n");
        System.out.println("Enjoy your movie!!!");
    }

}




