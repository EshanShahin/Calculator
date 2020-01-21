/**
 * Calculator project.
 * 
 * @author (Bhuiyan Md Shahin)
 * @version (2019/7/22)
 */

import java.util.Scanner;
public class Calculator
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c,selection;
        System.out.println("Please enter two value");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Make your Selection");
        
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multipication");
        
        selection = input.nextInt();
        while(selection>4){
            System.out.println("please enter the correct selection");
            selection=input.nextInt();
        }
        cal2 mani = new cal2();
        if(selection==1){
            c=mani.add(a,b);
            System.out.println("Your answer is : " + c );
        }
        else if ( selection ==2){
            c=mani.sub(a,b);
            
            System.out.println("Your answer is : " + c );
        }
        else if ( selection ==3){
            c=mani.div(a,b);
            System.out.println("Your answer is : " + c );
        }
        
        else if ( selection ==4){
            c=mani.mult(a,b);
            System.out.println("Your answer is : " + c );
        }
    }
}
