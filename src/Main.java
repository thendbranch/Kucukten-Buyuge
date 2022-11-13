// https://app.patika.dev
// https://app.patika.dev/thendbranch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("!! Küçükten Büyüğe Sıralama !!");

        System.out.print("Birinci Sayı : ");
        int sayi_1 = input.nextInt();

        System.out.print("İkinci Sayı : ");
        int sayi_2 = input.nextInt();

        System.out.print("Üçüncü Sayı : ");
        int sayi_3 = input.nextInt();

        if (sayi_1 < sayi_2 && sayi_1 < sayi_3){
            System.out.println("küçükten büyüğe 1. sıradaki sayı : " + sayi_1);
            if (sayi_2<sayi_3){
                System.out.println("Küçükten büyüğe sıralama : " + sayi_1 + " < " + sayi_2 + " < " + sayi_3 );
            }else {
                System.out.println("Küçükten büyüğe sıralama : " + sayi_1 + " < " + sayi_3 + " < " + sayi_2 );
            }
        }else if (sayi_2 < sayi_1 && sayi_2 < sayi_3){
            System.out.println("küçükten büyüğe 1. sıradaki sayı : " + sayi_2);
            if (sayi_1 < sayi_3){
                System.out.println("Küçükten büyüğe sıralama : " + sayi_2 + " < " + sayi_1 + " < " + sayi_3 );
            }else {
                System.out.println("Küçükten büyüğe sıralama : " + sayi_2 + " < " + sayi_3 + " < " + sayi_1 );
            }
        } else if (sayi_3 < sayi_2 && sayi_3 < sayi_1) {
            System.out.println("küçükten büyüğe 1. sıradaki sayı : " + sayi_3);
            if (sayi_1 < sayi_2){
                System.out.println("Küçükten büyüğe sıralama : " + sayi_3 + " < " + sayi_1 + " < " + sayi_2 );
            }else {
                System.out.println("Küçükten büyüğe sıralama : " + sayi_3 + " < " + sayi_2 + " < " + sayi_1 );
            }
        }else {
            System.out.println("Girilen sayılarda eşitlik olabilir, geçerli sayılar giriniz.");
        }

    }
}