package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Abril",Species.CAT,Race.ANGORA,(byte)4,Gender.FEMALE,Colour.GREY_AND_WHITE,4.2);
        System.out.println("Hello World!");
        System.out.println(pet1);
    }
}
