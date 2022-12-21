import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int girdi = input.nextInt();
        int kalan1=0,deger1=0,kalan2=0,deger2 = 0;

        for (int i = girdi; i > 0; i++) {
            int sayi1=i;
            int basamak = String.valueOf(sayi1).length();
            for (int j = 0; j < basamak; j++) {
                kalan1 = sayi1 % 10;
                deger1 = deger1 * 10 + kalan1;
                sayi1 = sayi1 / 10;
            }
            if (deger1 == i) {
                System.out.println("ilk palindrom: "+deger1);
                break;
            }
        }

        for (int i = girdi; i > 0; i--) {
            int sayi2=i;
            int basamak = String.valueOf(sayi2).length();
            for (int j = 0; j < basamak; j++) {
                kalan2 = sayi2 % 10;
                deger2 = deger2 * 10 + kalan2;
                sayi2 = sayi2 / 10;
            }
            if (deger2 == i) {
                System.out.println("ikinci palindrom: "+deger2);
                break;
            }
        }
        int islem1=girdi-deger1;
        int ilk = Math.abs(islem1);
        int islem2=girdi-deger2;
        int ikinci = Math.abs(islem2);
        int cıktı = ilk > ikinci ? deger2 : deger1;

        System.out.println(cıktı);
    }
}

