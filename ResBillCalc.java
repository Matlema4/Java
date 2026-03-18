import java.util.Scanner;

public class ResBillCalc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter meal cost
        System.out.print("How much does the meals cost? R");
        double mealCost = input.nextDouble();

        //Enter number of people 
        System.out.println("How people have ordered the meals? "); 
        int numberOfPeople = input.nextInt();

        //server rating 
        System.out.println("What is the rating of the server?(0-5) "); 
        int serverRating = input.nextInt();

        //tip amount 
        double tipAmount; 
        if (serverRating == 0){ 
            tipAmount = mealCost*0;
        } 
        else if (serverRating == 1){ 
            tipAmount = mealCost*0.1; 
        } 
        else if (serverRating == 2){ 
            tipAmount = mealCost*0.2; 
        } 
        else if (serverRating == 3){ 
            tipAmount = mealCost*0.3; 
        } 
        else if (serverRating == 4){ 
            tipAmount = mealCost*0.4; 
            } 
        else if (serverRating == 5){ 
            tipAmount = mealCost*0.5; 
        }
        else{ 
            System.out.print("Error input. Please restart the whole process!"); 
            return; 
        }

        //tax
        double taxAmount = mealCost * 0.085;
        //total 
        double totalAmount = mealCost + taxAmount + tipAmount; 
        //cost per person
        double costPerPerson = totalAmount/numberOfPeople;

        //receipt
        System.out.println("\n******Receipt********"); 

        System.out.printf("Meal Cost = R%.2f%n", mealCost);
        System.out.printf("Tax Amount = R%.2f%n", taxAmount ); 
        System.out.printf("Tip Amount = R%.2f%n", tipAmount ); 
        System.out.printf("Total Cost = R%.2f%n", totalAmount ); 
        System.out.printf("Cost Per Person = R%.2f%n", costPerPerson ); 

        System.out.println(" "); System.out.println("\nThank You. Please Come Again!"); 
        System.out.print("Served By Rakgwale Venas");


    }
        
}