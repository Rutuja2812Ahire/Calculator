import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        int number1, number2, choice;
        char isAgain;

        Scanner input = new Scanner(System.in); 

        
        do
        {
        System.out.println("******Calculator Program******");


        // Inputting two numbers from the user
        System.out.println("Please Enter any two numbers : ");
        number1 = input.nextInt();
        number2 = input.nextInt();

        System.out.println("Calculator performs following operations :");
        System.out.println("1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION \n 5.EXIT");

        //Inputting user's choice
        System.out.println("PLease Enter your choice from above options : ");
        choice = input.nextInt();

       

        switch(choice)
        {
            case 1 : // addition
              System.out.println(number1+" + "+number2+" = "+(number1+number2));
              break;

            case 2: // subtarction
              System.out.println(number1+" - "+number2+" = "+(number1-number2));
              break;

            case 3: // multiplication
              System.out.println(number1+" * "+number2+" = "+(number1*number2));
              break;

            case 4: // division
               if(number2 == 0 && choice == 4)
                {
                     System.out.println("DIVIDE BY ZERO ERROR!!!");
                     System.out.println("Sorry !! Calculator cannot perfrom this operation because, a number cannot be divided by zero");
                }
                else
                {
                    System.out.println(number1+" / "+number2+" = "+(number1/number2));
                }
              break;

            case 5: // exit
              System.out.println("Thank you for using calculator !!");
              System.exit(0);
              break;


            default:
              System.out.println("Invalid choice!! Please enter choice from above given options only");
        }

        System.out.println("Do you want to use this calculator again? (y/n)");
        isAgain = input.next().charAt(0);

    }while(isAgain == 'Y' || isAgain == 'y');

     input.close(); // closed scanner object

    }
}