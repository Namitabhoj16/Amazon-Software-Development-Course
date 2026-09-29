package datatypes;

public class DataTypeDemo {
    public static void main(String[] args) {

        // 1. byte in JAVA
            //smallest whole-number box in JAVA
            //uses 8 bits of memory.
            //holds numbers from -128 to 127

        //EXAMPLE
            byte age = 25;     // Fits
            byte temp = -40;   //Fits
            //byte big = 200;    // ERROR: 200 is more than 127

        //What is it used for?
            //1. Saving memories
            //2. For Raw date (Files, images, and network data are all just streams of bytes.)

     //-----------------------------------------------------------------------------------------------------------------//

        // 2. short
            //medium small number box
            //uses 16 bits memory.
            //hold memory from -32768 to 32767

        //EXAMPLE
            short year =2006;       //fits
            short score = -15000;   //fits
            //short big = 40000;      // ERROR: more than 32,767

        //What is it used for?
            //1. Rarely. It's a middle ground between byte and int, used to save memory in big arrays of medium-sized numbers
            // (like 1 million years or prices in cents under 32,000). Most developers just use int.

        //-----------------------------------------------------------------------------------------------------------------//

        // 3. int
            //standard whole-number box.
            //uses 32 bits memory.


        // EXAMPLE
        int population = 1500000;
        int temperature = -12;
        //int big = 3000000000;   // ERROR: more than 2,147,483,647


        //-----------------------------------------------------------------------------------------------------------------//

        // 4. long
            // its big int

        //EXAMPLE
        long populations = 8000000000L;   // put an L at the end

        //-----------------------------------------------------------------------------------------------------------------//

        //5. float
            //decimal box(small)
            //4 bytes

        //Example
        float price = 9.99f;   // without the f, ERROR

        //-----------------------------------------------------------------------------------------------------------------//

        //6.Double
            //decimal box (big)
            // 8 bytes

        //example
        double pi = 3.14159265358979;

        //-----------------------------------------------------------------------------------------------------------------//


        //7. char
            //one single character
           // 2 bytes

        //Example

        char grade = 'A';
        char c = 'A';
        c++;                        // now 'B'

        //Under the hood, a char is a number ('A' is 65), which is why c++ works.

        //-----------------------------------------------------------------------------------------------------------------//


        // 8. Boolean
            //yes/no switch
            //Only two values: true or false. Default is false. It's used for conditions (if, while).

        //Example

        boolean isPassed = true;

        //-----------------------------------------------------------------------------------------------------------------//

        //9. string
            //Text in double quotes

        //Example

        String name = "Sara";

        //String is not a primitive. It's a class (an object), which is why it starts with a capital S. Its default value is null.

        //Two key facts:
            //Strings are immutable: once created, they can't be changed. Methods like toUpperCase() give you a new String.
            //Compare with .equals(), not ==:

        //Example

        String a = new String("hi");
        String b = new String("hi");
        System.out.println(a == b);        // false (compares memory location)
        System.out.println(a.equals(b));   // true (compares the text)



        //Type	  Size	      Holds	               Default
        //byte	   1 byte	tiny whole numbers	     0
        //short	   2 bytes	small whole numbers	     0
        //int	   4 bytes	whole numbers	         0
        //float	   4 bytes	decimals (needs f)	     0.0f
        //double   8 bytes	decimals	             0.0
        //char	   2 bytes	one character	         '\u0000'
        //boolean  n/a	    true/false.	             false
        //String  object    text	                 null
    }
}
