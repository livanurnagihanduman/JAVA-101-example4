import java.util.Scanner;
public class Main {

    static int UsHesapla(int x , int f){
        int total2 = 1;
        int p = 1;
        while(p<=f){
            total2 *= x;
            p++;
        }
        return total2;
    }

    static int topla(int y , int q){
        int sonuc = y + q;
        System.out.println("Toplam =  " + sonuc);
        return sonuc;
    }

    static int cikar(int y , int q){
        int sonuc = y - q;
        System.out.println("Fark = "  + sonuc);
        return sonuc;
    }

    static int carp(int y , int q){
        int sonuc = y * q;
        System.out.println("Sonuç = " + sonuc);
        return sonuc;
    }

    static int bol(int y , int q){
        int sonuc = y / q;
        System.out.println("Sonuç = " + sonuc);
        return sonuc;
    }

    static int modAl(int y , int q){
        int sonuc = y % q;
        System.out.println("Sonuç = " + sonuc);
        return sonuc;
    }

    static int dikdötrgenAlanveCevre(int y , int q){
        int alanSonuc = y * q;
        int cevreSonuc = 2*y + 2*q;
        System.out.println("Sonuç = " + alanSonuc);
        System.out.println("Sonuç = " + cevreSonuc);
        return alanSonuc;
    }

    static int silindirinHacmi(int y , int q){
        int hacim = 3*(y*y)*q;
        System.out.println("Hacim = " + hacim);
        return hacim;
    }

    static int usAlma(int y , int q){
        int sonuc = 1;
        for(;q != 0 ; q--){
            sonuc *= y;
        }
        System.out.println("Sonuç = " + sonuc);
        return sonuc;
    }


    static int f(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        return result;
    }
    static boolean poindromMu(int sayi){
        int degisken = sayi , tersSayi = 0 , sonSayi;
        while(degisken != 0){
            System.out.println("************");
            System.out.println("Sayi = " + degisken);

            sonSayi = degisken % 10;
            System.out.println("Son Basamak = " + sonSayi);

            tersSayi =  (tersSayi * 10) + sonSayi;
            System.out.println("YeniSayi = " + tersSayi);

            degisken /= 10;
            System.out.println("Yeni Değişken = " + degisken);

            if(sayi == degisken){
                System.out.println("Tebrikler!!! Polindrom Sayı");
            }else{
                System.out.println("Sorry!!! Polindrom Sayı Değil");

            }
        }
        return true;

    }

    static int fibo(int x){
        if(x==1 || x==2){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }


    public static void main(String[] args) {

        System.out.println(f(5));







        //POLİNDROM SAYILARI BULAN PROGRAM

        int a = 2548;
        int sonuc = a % 10;
        System.out.println(sonuc);

        System.out.println(poindromMu(2459));


        // FİBONACCİ PROGRAMI

        System.out.println(fibo(6));
        System.out.println(fibo(7));



        // GELİŞMİŞ HESAP MAKİNESİ

        Scanner key = new Scanner(System.in);
        int sec;
        System.out.println("Gelişmiş Hesap Makinesi Programına Hoşgeldiniz!");
        System.out.println("\n");

        String menu = "1.Toplama İşlemi\n" +
                      "2.Çıkarma İşlemi\n" +
                      "3.Çarpma İşlemi\n" +
                      "4.Bölme İşlemi\n" +
                      "5.Mod Alma\n" +
                      "6.Dikdörtgenin Alanı ve Çevresi\n" +
                      "7.Silindirin Hacmi\n" +
                      "8.Üslü Sayı Hesaplama\n" +
                      "0.Çıkış\n";

        while (true){

            System.out.println(menu);
            System.out.println("Bir işlem seçiniz: ");
            sec = key.nextInt();

            if(sec == 0){
                break;
            }

            System.out.println("İlk sayıyı giriniz: ");
            int y = key.nextInt();
            System.out.println("İkinci sayıyı seçiniz: ");
            int q = key.nextInt();

            switch(sec){

                case 1:
                    topla(y,q);
                    break;

                case 2:
                    cikar(y,q);
                    break;

                case 3:
                    carp(y,q);
                    break;

                case 4:
                    bol(y,q);
                    break;

                case 5:
                    modAl(y,q);
                    break;

                case 6:
                    dikdötrgenAlanveCevre(y,q);
                    break;

                case 7:
                    silindirinHacmi(y,q);
                    break;

                case 8:
                    usAlma(y,q);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }
        System.out.println("Hoşçakalın!");


        // ÜSLÜ HESAPLAYAN PROGRAM

        System.out.println(UsHesapla(2,3));
        System.out.println(UsHesapla(5,3));





    }
}