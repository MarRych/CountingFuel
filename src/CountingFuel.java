import java.util.Scanner;

public class CountingFuel {
    public static void main (String[]args){
        /*
        Program do przeliczania zużytego paliwa z mili
        na galkon na litry na 100 kilometrów i odwrotnie.
        g=galon

         */
        //przeliczenik kilometrów na mile
        Scanner scanner = new Scanner(System.in);
        double km,miles;
        System.out.println("Enter the distance in Kilometers: ");
        km = scanner.nextDouble();

        miles = (km * 1.621371);
        //"%.2f Kilometers = %.2f Miles"- dwa miejsca po przecinku
        System.out.printf("%.2f Kilometers = %.2f Miles", km, miles);


        /*
        Zad8 przeliczanie jednostek z mil na galon na litry
        na sto kilometrów i odwrotnie */

        //1l= 0.264172052 galon    galon = 3.78541178 km
        //100km= 62,5 mile  100miles = 161km
        //1mile=1.609344km
        double litersPerKilometr, galons, galonsPerMile, liters;

        // ilość litrów gdy obliczmy galony
        System.out.println("\nEnter amount liters: ");
        litersPerKilometr= scanner.nextDouble();
        galons = (litersPerKilometr*3.78541178)/1.609344*100;
        System.out.printf(" %.2f l/100km = %.2f miles/galon ",litersPerKilometr, galons);

        // ilość galonów gdy obliczmy galony
        System.out.println("\nEnter amount galons: ");
        galonsPerMile = scanner.nextDouble();
        liters = 0.62137119/(galonsPerMile*0.264172052)*100;
        System.out.printf(" %.2f miles/galon = %.2f l/100km ", galonsPerMile, liters);

    }
}
