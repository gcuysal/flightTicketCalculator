import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, tickedPrice, bill;

        Scanner input = new Scanner(System.in);

        System.out.println("Yolculuğunuz kaç km?: ");
        km = input.nextInt();

        System.out.println("Yaşınız?: ");
        age = input.nextInt();

        tickedPrice = (int) (km * 0.10);

        double ageDiscount;
        if (age < 12) {
            ageDiscount = tickedPrice*0.50;
        } else if (age >= 12 && age < 25) {
            ageDiscount = tickedPrice*0.10;
        } else if (age >= 65) {
            ageDiscount = tickedPrice*0.30;
        } else {
            ageDiscount = tickedPrice*0;
        }

        int ageDiscountedPrice = (int) (tickedPrice-ageDiscount);

        System.out.println("Yolculuk tipi seçiniz: \n1-Tek Gidiş\n2-Gidiş-Dönüş");
        int select = input.nextInt();
        double roadTripDiscount=0.20;
        switch (select) {
            case 1:
                roadTripDiscount = 0.00;
                break;
            case 2:
                roadTripDiscount = (ageDiscountedPrice*0.20);
                break;
        }

        int discountedPrice = (int) (ageDiscountedPrice-roadTripDiscount);

        if (select == 2) {
            bill = discountedPrice*2;
        } else {
            bill = discountedPrice;
        }

        System.out.println(bill);


    }
}
