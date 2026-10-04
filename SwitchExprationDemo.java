import java.util.Scanner;

public class SwitchExprationDemo {
    public static void main(String[] args) {
        int num1, num2;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number ");
        num1= sc.nextInt();
        System.out.println("Enter the Second  number ");
        num2= sc.nextInt();

        System.out.println("Enter your choice ");

        choice=sc.next().charAt(0);
        int result=0;

        // First method
        /*result = switch(choice){ 


            case 'A', 'p' -> num1+num2;
                
            case 'M', 'S'  -> num1-num2;
               
            default ->0;
                

        };
        System.out.println("Result: "+ result);*/


        // Third method
        result = switch(choice){


            case 'A', 'p' -> {
                System.out.println("You choice Addition ");
                yield num1+num2;
            }

                
            case 'M', 'S'  ->{

                System.out.println("You choice Subtraction  ");
                yield num1-num2;

            }
               
            default ->{

                System.out.println("Wrong  choice   ");
                yield 0;
            }
                

        };
        System.out.println("Result: "+ result);

        // Second method 
       /*  switch(choice){
            case  'A':
                System.out.println("You choice Addition");
                result = num1+num2;
                break; 
            case 'S':
                System.out.println("You choice Subtraction");
                result = num1-num2;
                break;
            default :
                System.out.println("Wrong choice ");
        }
        System.out.println("Result: "+ result); */

        

    

    }

}
