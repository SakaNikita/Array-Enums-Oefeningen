package be.intecbrussel;

public class Oefening01 {
    public static void main(String[] args){

        int num = 50;
        System.out.println("De oneven nummers zijn: ");

        for (int index = 1; index <= num; index++){
            if (index % 2 != 0){
                System.out.println(index);
            }
        }
    }
}
