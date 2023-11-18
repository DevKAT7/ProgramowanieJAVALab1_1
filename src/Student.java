public class Student
{
    private String imie;
    private String nazwisko;
    private String pesel;
    public Student(String imie, String nazwisko, String pesel)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
    public void wyswietl()
    {
        System.out.println("Imie studenta: " + imie);
        System.out.println("Nazwisko studenta: " + nazwisko);
        System.out.println("PESEL studenta: " + pesel);
    }
}
