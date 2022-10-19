package be.intecbrussel;

public class Oefening03 {
    public static void main(String[] args){

        int[] array = {3, 6, 9, 12, 15, 20};
        int som = 0;
        int multipli = 1;
        double num = 0;

        //De som
        for (int index : array){
            som = som + index;
        }
        System.out.println("De som van de array is: " + som);

        //  gemiddelde
        for (int index = 0; index < array.length; index++){
            num = num + array[index];
        }
        double average = num / array.length;
        System.out.println("De gemiddelde is: " + average);

        //Vermenigvuldiging
        for (int index : array) {
            multipli = multipli * index;
        }
        System.out.println("Het resultaat is: " + multipli);
    }
}
