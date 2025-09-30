// HEADER
// File name: ArrayCreationLab
// Today's date: 9-30-2025
// Name: Marcus Ceradini

import java.util.Scanner;

public class ArrayCreationLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Part1
        //Array length
        int part1[] = new int[5];
        System.out.println("Array length: " + part1.length);

        //Separator
        //-------------------------------------------------------------------------------------------
        //Part 2

        //define array and input Colors uses for-each loop
        String Colors[] = new String[3];
        Colors[0] = "Red";
        Colors[1] = "Green";
        Colors[2] = "Blue";

        for (String color : Colors){
            System.out.println(color);
        }

        //-------------------------------------------------------------------------------------------
        //Part 3

        //define array and input prices
        double Prices[] = new double[3];
        Prices[0] = 9.99;
        Prices[1] = 14.50;
        Prices[2] = 20.00;

        System.out.println(Prices[0] + " " + Prices[1] +" " + Prices[2]);

        //-------------------------------------------------------------------------------------------
        //Part 4

        //gets number of foods for array
        System.out.print("How many favorite foods? ");
        int userFavFoodNum = input.nextInt();
        String FavFoods[] = new String[userFavFoodNum];
        input.nextLine();


//        for (int J = 1; J < FavFoods.length+1; J++){
//            System.out.print(J);
//            System.out.print("Enter food: ");
//            String userfood = input.nextLine();
//            FavFoods[i] = userfood;
//        }
        //gets food inputs
        for (int i = 0; i < FavFoods.length; i++) {
                System.out.print("Enter food: ");
                String userfood = input.nextLine();
                FavFoods[i] = userfood;
        }

        // Prints food array
        System.out.print("Your favorite foods are: ");
        for (int i = 0; i < FavFoods.length; i++){
            if (i != FavFoods.length-1){
                System.out.print(FavFoods[i] + ", ");
            }else {
                System.out.print(FavFoods[i]);
            }
        }


    }
}
