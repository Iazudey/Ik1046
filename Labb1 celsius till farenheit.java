import java.util.Scanner; // Ringer efter hantverkaren

public class tempconverter {


// Metod Mainmetoden används av java virtual machine.
  public static void main(String[] args) {


//instansierar ett scanner objekt för att kunna läsa in från t-bord.
//tar in hantverkaren i köket!
Scanner input = new Scanner(System.in);

System.out.print( "hur många grader celsius? ");

// metod för att konvertera celsius till farnheit
double celsius = input.nextDouble();
double farenheit = celsius * 1.8 +32;


// skriver ut text + resultat i programmet
System.out.print(celsius +" grader celsius är " + farenheit + " farenheit") ;
}
}
