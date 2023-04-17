import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusteriAracBilgileri extends AracTalebi {
    Scanner input=new Scanner(System.in);
    List<AracTalebi> aracList=new ArrayList<>();
    long odenecekToplamGun;
    double toplamUcret;
    int secim;



    public  void aracTalep(){


        AracTalebi araba=new AracTalebi();
        input=new Scanner(System.in);
        System.out.println("Lütfen teslim alacağınız şehri girin");
        araba.alinacakSehir=input.next();
        System.out.println("Lütfen teslim edilecek sehri giriniz..");
        araba.teslimEdilecekSehir=input.next();
        System.out.println("Lütfen alinacak günü dd/MM/yyyy formatta giriniz..");
        araba.alinacakGun=input.next();
        System.out.println("Lütfen teslim gününü dd/MM/yyyy formatta giriniz..");
        araba.teslimGunu=input.next();
        System.out.println("Lütfen alinacak saati giriniz..");
        araba.alisSaati=input.next();
        System.out.println("Lütfen teslim saatini giriniz..");
        araba.teslimSaati=input.next();



       DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate alisGun=LocalDate.parse(araba.getAlinacakGun(),formatter);
      LocalDate teslimGun=LocalDate.parse(araba.getTeslimGunu(),formatter);




         odenecekToplamGun= ChronoUnit.DAYS.between(alisGun,teslimGun);

        if (odenecekToplamGun<0){
            System.out.println("Teslim tarihi alış gununden once olamaz.lütfen geçerli bir tarih giriniz");
            aracTalep();
        }else {
            System.out.println("Odeyeceginiz toplam gun sayısı: "+odenecekToplamGun);
            arabalar();
        }

    }

    public  void arabalar() {

        AracTalebi arac1=new AracTalebi("Honda","Civic","Benzin","Otomatik",250.0);
        AracTalebi arac2=new AracTalebi("Hundai","i20","Mazot","Manuel",300.0);
        AracTalebi arac3=new AracTalebi("Fiat","Doblo","Mazot","Manuel",200.0);
        AracTalebi arac4=new AracTalebi("Hundai","i30","Benzin","Manuel",300.0);


        aracList.add(arac1);
        aracList.add(arac2);
        aracList.add(arac3);
        aracList.add(arac4);

        int counter=1;
        for (AracTalebi w : aracList){
            System.out.println(counter+". arac= "+ w );
            counter++;
        }
        System.out.println("Lutfen secmek istediginiz arac nosunu giriniz");
        secim = input.nextInt();


      getAraba();
    }

    public  void getAraba() {

        System.out.println("Seçmiş oldugunuz arac: \n"+aracList.get(secim-1));
        toplamUcret = aracList.get(secim-1).gunlukUcret*odenecekToplamGun;

        System.out.println("Odemeni gereken toplam tutar: \n"+toplamUcret);

        System.out.println("Kiralama islemine devam etmek istiyor musunuz?\n 1-Evet 2-Hayir");
        secim=input.nextInt();
        switch (secim){
            case 1:
                musteriBilgileri();
            case 2:
                System.out.println("Hoşçakalın");
            break;
            default:
                System.out.println("Hatali giris yaptiniz");
                getAraba();
        }
    }

    public void musteriBilgileri() {
        System.out.println("Isminizi ve soyisminizi giriniz");
        String name=input.nextLine();
        String bosKod = input.nextLine();
        System.out.println("Lütfen ID'nizi giriniz");
        String ıD=input.next();
        System.out.println("Lütfen tel no giriniz");
        String telNo=input.next();
        bosKod = input.nextLine();

        odemeBilgileri();

    }

    public void odemeBilgileri() {
        System.out.println("Lütfen 12 haneli kart numarınızı giriniz");
        String kartNo=input.next();
        if (kartNo.length()!=12){
            System.out.println("Kart numaranızı eksik ya da fazla girdiniz\nLütfen tekrar deneyiniz");
            odemeBilgileri();
        }else {
            System.out.println("Kiralama İsleminiz onaylanmıştır.\nIyi gunler dileriz...");

        }
    }
}
