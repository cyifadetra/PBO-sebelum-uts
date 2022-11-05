package PBO_Sebelum_UTS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ticket tcket = new Ticket();
        Scanner in = new Scanner(System.in);
        System.out.println( Judul.tambah("Bioskop") );



        System.out.print("Masukkan nama anda : ");
        String name = in.nextLine();
        System.out.print("Masukkan harga ticket : ");
        int org = in.nextInt();
        System.out.print("Masukkan jumlah ticket : ");
        int jumlaht = in.nextInt();





        tcket.setJumlaht(jumlaht);
        tcket.setOrg(org);
        tcket.setN(name);
        System.out.println("\n====================================\n");


        System.out.println("you want free food ? ");
        System.out.println("1. Tentu saja ");
        System.out.println("2. No thank u ");
        int ayam =in.nextInt();

        if (ayam ==  1 ){
            System.out.println("Congratulation anda ");
            Makanan food = new Makanan();
            food.show();
        }
        else{
            System.out.println("oh oke ");
        }
        System.out.println("=========================");
        System.out.println("Dengan Nama : " + tcket.name());
        System.out.println("harga : " + tcket.jumlah());
        System.out.println("=========================");
        System.out.println("Kursi");
        for(int x =1; x<=jumlaht; x++){
            System.out.println("Mendapatkan kursi no : " +x);


        }
        System.out.println( "\n");
        System.out.println( Film.tambah("Selesai"));
    }
}
