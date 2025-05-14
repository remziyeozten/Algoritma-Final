import java.util.Arrays;
import java.util.Scanner;

public class operatorler
{

    public static void main(String [] args)
    {

        Scanner entry = new Scanner(System.in);
        boolean isValid = false; // Geçerli giriş kontrolü için bayrak


        while (!isValid) {

        System.out.print("Bir işlem seçin: (Factoriyel: 1, Çift sayı: 2, Tek sayı: 3, Kare alma: 4, Ortalama: 5): ");
        int choice = entry.nextInt();

        switch (choice)
        {

            case 1:

                double fac = 1;

                System.out.print("Bir değer girin : ");
                isValid = true;
                int n = entry.nextInt();

                for (int i = 1; i <= n; i++)
                {

                    fac *= i;

                }
                System.out.print(+n+ "! = " + fac);
                break;
            case 2:
                System.out.print("Bir değer girin : ");
                isValid = true;
                int a = entry.nextInt();

                for (int i = 1; i <= a; i++)
                {

                    if (i % 2 == 0)
                    {
                        System.out.print(i + " ");

                    }

                }
                break;
            case 3:
                System.out.print("Bir değer girin : ");
                isValid = true;
                int m = entry.nextInt();

                for (int i = 1; i <= m; i++)
                {

                    if (i % 2 != 0)
                    {
                        System.out.print(i + " ");

                    }

                }
                break;
            case 4:

                System.out.print("Kaç sayının karesini alıcaksınız : ");
                isValid = true;
                int v = entry.nextInt();

                double toplam = 0;

                for (int i = 1; i <=v; i++)
                {
                    System.out.print("Bir değer girin: ");
                    int sayi = entry.nextInt();

                    toplam += sayi * sayi;
                }
                System.out.print("Sonuç: " + toplam);
                break;
            case 5:

                System.out.print("Kaç tane sayının ortalamasını alıcaksınız? : ");
                isValid = true;
                int sayilar = entry.nextInt(); // sayaç
                int toplaam = 0;

                for (int i = 1; i <= sayilar; i++)
                {
                    System.out.print("Sayı gir: ");
                    int d = entry.nextInt();
                    toplaam += d;
                }
                double ort = toplaam / sayilar;
                System.out.println("Toplam değer: " + toplaam);
                System.out.print("Ortalama değer: " + ort);
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz lütfen tekrar deneyin : ");

        }
    }
}

}
