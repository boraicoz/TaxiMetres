import java.util.Scanner;
public class TaxiRide {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double kmPrice=2.20,firstPrice=10,price,controlPrice,km;
        System.out.print("Kaç KM yol gidildi?:");
        km=in.nextDouble();
        controlPrice=firstPrice+(km*kmPrice);
        price=(controlPrice>=20)?controlPrice:20;
        System.out.println("Toplam Tutar:"+price);
    }


}
