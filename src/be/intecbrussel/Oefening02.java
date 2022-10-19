package be.intecbrussel;

public class Oefening02 {
    public static void main(String[] args){

        int[] array = {3, 20, 6, 35, 9, 99, 12};
        int max = array[0];

        for (int index = 1; index < array.length; index++){
            if (array[index] < max){
                max = array[index];
            }
        }

        int max02 = array[0];
        for (int index = 1; index < array.length; index++){
            if (array[index] > max02 && array[index] > max)
                max02 = array[index];
        }

        System.out.println("Het hoogste getal in de array is : " + max02);
    }
}
