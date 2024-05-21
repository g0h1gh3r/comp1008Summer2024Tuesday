package intro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Week2 {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
    }

    static void Example1(){
        System.out.println("this is example1!");
        int age = 100;
        boolean havingFun = true;
        double temperature = 15.5;
        String name = "Zeng";

    }
    static void Example2(){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("your are" + age + " years old.");
    }
    static void Task1(){
        System.out.println("What's your age?");
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        int months = years * 12;
        int weeks = years * 52;
        int days = years * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("your age is " + years + " years " + "\n" +  months + " months " + "\n" +  weeks + " weeks " + "\n"  +  days + " days " + "\n" +  hours + " hours " + "\n" +  minutes + " minutes " + "\n" +  seconds + " seconds ");
    }
    static void Task2(){
        System.out.println("please give me two number.");
        System.out.println("please input the first number");
        Scanner sc = new Scanner(System.in);
        int fn = sc.nextInt();
        System.out.println("please input the second number");
        int sn = sc.nextInt();
        System.out.println( "their sum is " +(fn + sn) + "\n" + "their product is " + fn*sn + "\n" + "their difference is " + (fn-sn) + "\n" + "their quotient is " + fn/sn );

    }
    static void Task3(){
        System.out.println("please give me a number");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        for(int i=1;i<=userInput;i++) {
            System.out.println(i);
        }
        while(userInput>=0) {
            System.out.println(userInput);
            userInput--;
        }
    }
    static void Task4(){
        String pizzaSize = "L";
        int toppings = 0;
        int distance = 0;
        double price = 0;
        while(true){
            System.out.println("welcome! what size of pizza do you want? please input S, M, L or XL");
            Scanner sc = new Scanner(System.in);
            String tempStr = sc.nextLine();

            if(tempStr.equals("S")  || tempStr.equals("s")  || tempStr.equals("M")  || tempStr.equals("m")  || tempStr.equals("L")  || tempStr.equals("l")  ||tempStr.equals("XL")  || tempStr.equals("xl")  ){
                pizzaSize = tempStr;
                break;
            }
            else{
                System.out.println("your input is invalid");
            }
        }
        while(true){
            System.out.println("welcome! what size of pizza do you want? please input S, M, L or XL");
            Scanner sc = new Scanner(System.in);
            String tempStr = sc.nextLine();

            if(tempStr.equals("S")  || tempStr.equals("s")  || tempStr.equals("M")  || tempStr.equals("m")  || tempStr.equals("L")  || tempStr.equals("l")  ||tempStr.equals("XL")  || tempStr.equals("xl")  ){
                pizzaSize = tempStr;
                break;
            }
            else{
                System.out.println("your input is invalid");
            }
        }
        while(true){
            System.out.println("how many toppings do you want? please input 1-5");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();

            if(temp>=1 && temp<=5){
                toppings = temp;
                break;
            }
            else{
                System.out.println("your input is invalid");
            }
        }
        while(true){
            System.out.println("how many km away they live from the pizza store? please input 1-20");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();

            if(temp>=1 && temp<=20){
                distance = temp;
                break;
            }
            else{
                System.out.println("your input is invalid");
            }
        }
        price = 5 + 3*toppings + 1.5*distance;
        System.out.println("your bill is " + price + "$");
    }
}
