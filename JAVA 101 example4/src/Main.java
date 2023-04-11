public class Main {

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
    public static void main(String[] args) {

        System.out.println(f(5));

        //POLİNDROM SAYILARI BULAN PROGRAM

        int a = 2548;
        int sonuc = a % 10;
        System.out.println(sonuc);

        System.out.println(poindromMu(2459));

    }
}