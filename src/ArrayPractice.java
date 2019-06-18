    import java.util.Arrays;
    import java.util.Scanner;

    public class ArrayPractice {
        public static void main(String[] args) {


            Scanner key = new Scanner(System.in);


            //user input on how many #s to calculate.
            System.out.println("How many numbers would you like to calculate? ");

            //Declares an array
            int numbersToCalc = key.nextInt();
            int numbers[] = new int[numbersToCalc]; //= new int[]{1,2,3,4,5,6,7,8,9,10};
            int sum = 0;
            int average = 0;

            //Calculate sum and average of user input
            for (int i = 0; i < numbersToCalc; i++)
            {
                System.out.println("Enter number " + (i+1));
                numbers[i] = key.nextInt();
                sum = (sum + numbers[i]);
                average = (sum / numbersToCalc);
            }

            //Output of sum and average
            System.out.println("The sum is: " + sum);
            System.out.println("The average is " + average);

            System.out.println("\nEnd of this part of program\n\n-----------------------------------------------------");


            //This program asks for user input and prints them.
            System.out.println("How many names would you like to input? ");
            int numberOfNames = key.nextInt();

            //Declaring and initializing scanner variable.
            String [] names = new String[numberOfNames];

            //for loop inputs
            for (int i=0; i < numberOfNames; i++) {
                System.out.println("Input name " + (i +1));
                names[i] = key.next();
            }


            System.out.println("These are the names input by the user \n" + Arrays.toString(names));

            System.out.println("\nEnd of this part of program\n\n-------------------------------------------");



            System.out.println("\n\nThis part of program will print only the index of the values in the array equal to 5\n");
            int setNumbers[] = {2,5,9,0,2,1,8,5,4};


            for (int i=0; i < setNumbers.length; i++) {

                if (setNumbers[i]== 5)
                    System.out.println("This is the index of all values equaling " + setNumbers[i] + ": Index #" + i);

                else
                    ;
            }
            System.out.println("\nEnd of this part of program\n\n-----------------------------------------------------");

            System.out.println("\nWould you like to continue to backwards array program? Y/N\n");
            String answer3 = key.next();

            //This part of the program will print the array backwards
            if (answer3.equalsIgnoreCase("Y"))
            {
                int backwardsArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                for (int i = (backwardsArray.length - 1); i >= 0; i--) {
                    System.out.println(backwardsArray[i] + " ");
                }
            } else
                ;

            System.out.println("\nEnd of this part of program\n\n--------------------------------------------------");


            //Asking user to continue with program
            System.out.println("Continue? y/n");
            String answer4 = key.next();

            //For loop within if statement that changes the value within the array to different string value
            if (answer4.equalsIgnoreCase("y")) {
                System.out.println("This program will replace the letter 't' with 'hello' in the array [w,t,y,h,k]");
                String newArray[] = {"w", "t", "y", "h", "k"};

                for (int i = 0; i < newArray.length; i++) {
                    if (newArray[i].equalsIgnoreCase("t")) {
                        newArray[i] = "hello";
                    } else
                        ;
                }

                System.out.println("This is what array looks like now: \n");
                System.out.println(Arrays.toString(newArray));

            }//if statement closes

            System.out.println("\nEnd of this part of program\n\n-----------------------------------------------------");



            System.out.println("\n\nFinal part of program\n\n" +
                    "This part of program will only give the pairs of matching values from two different arrays");

            //This program will print all the matching pairs of values in two different arrays

            int array1of2[] = {1,7,6,5,9};
            int array2of2[] = {2,7,6,3,4};

            System.out.println("Array 1: " + Arrays.toString(array1of2));
            System.out.println("Array 2: " + Arrays.toString(array2of2));

            for (int i=0; i < array1of2.length; i++ )
            {
                if (array1of2[i] == array2of2[i])
                {
                    System.out.println("\n(" + array1of2[i] + "," + array2of2[i] + ")");
                } else
                    ;

            }

            System.out.println("\nGood-Bye");



        }//End main method
    }//End class

