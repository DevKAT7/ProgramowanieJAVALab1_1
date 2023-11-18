import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        //zadanie 2
        //System.out.println("Hello world!");

        //zadanie 3
        //Student s = new Student("Kamila", "Nowak", "97311249566");
        //s.wyswietl();

        //zadanie 4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz imie studenta: ");
        String imieStudenta = scanner.nextLine();

        System.out.print("Wprowadz nazwisko studenta: ");
        String nazwiskoStudenta = scanner.nextLine();

        System.out.print("Wprowadz pesel studenta: ");
        String peselStudenta = scanner.nextLine();

        System.out.println("Imie studenta: " + imieStudenta);
        System.out.println("Nazwisko studenta: " + nazwiskoStudenta);
        System.out.println("PESEL studenta: " + peselStudenta);

        scanner.close();
    }
}
