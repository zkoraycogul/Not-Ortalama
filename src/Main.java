import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Matematik notunu gir :  ");
        mat = girdi.nextInt();

        System.out.print("Fizik notunu gir :  ");
        fizik = girdi.nextInt();

        System.out.print("Kimya notunu gir :  ");
        kimya = girdi.nextInt();

        System.out.print("Turkce notunu gir :  ");
        turkce = girdi.nextInt();

        System.out.print("Tarih notunu gir :  ");
        tarih = girdi.nextInt();

        System.out.print("Muzik notunu gir :  ");
        muzik = girdi.nextInt();

        float ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print(ortalama<60?"Kaldı":"Geçti");


    }
}
