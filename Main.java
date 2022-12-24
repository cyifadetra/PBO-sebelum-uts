package PBO_Sebelum_UTS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asus k = new Asus();
        Ticket tcket = new Ticket();
        Parkir prkr = new Bayaran(1);


        Scanner in = new Scanner(System.in);
        System.out.println(Judul.tambah("Bioskop"));

        System.out.print("Masukkan nama anda : ");
        String name = in.nextLine();

        int hidup;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan Kasir");
            System.out.println("[2] Matikan Kasir");
            System.out.println("[3] Perbesar Suhu AC");
            System.out.println("[4] Kecilkan Suhu AC");
            System.out.println("[5] Mengisi Data Pengunjung");
            System.out.println("[6] Out");
            System.out.println
                    ("--------------------------");
            System.out.print("Pilih aksi> ");
            hidup = in.nextInt();

            if (hidup == 1) {
                k.On();
            } else if (hidup == 2) {
                k.Off();
            } else if (hidup == 3) {
                k.Acup();
            } else if (hidup == 4) {
                k.Acdown();
            } else if (hidup == 5) {
                try {
                    File file = new File("sad.txt");
                    PrintWriter output = new PrintWriter(file);


                    System.out.println("Mengisi data ");
                    System.out.print("Masukkan harga ticket : ");
                    int org = in.nextInt();
                    System.out.print("Masukkan jumlah ticket : ");
                    int jumlaht = in.nextInt();

// untuk yg masukin variable salah pak bingung

                    tcket.setJumlaht(jumlaht);
                    tcket.setOrg(org);
                    tcket.setN(name);

                    System.out.println("\n====================================\n");


                    System.out.println("you want free food ? ");
                    System.out.println("1. Tentu saja ");
                    System.out.println("2. No thank u ");
                    int ayam = in.nextInt();
                    if (ayam == 1) {
                        System.out.println("Congratulation anda ");
                        Makanan food = new Makanan();
                        food.show();
                    } else {
                        System.out.println("oh oke ");
                    }


                    System.out.println("\n");
                    output.println("=========================");
                    output.println("Dengan Nama : " + tcket.name());
                    output.println("harga : " + tcket.jumlah());
                    for (int x = 1; x <= jumlaht; x++) {
                        output.println("Mendapatkan kursi no : " + x);
                    }
                    System.out.println("Dengan suhu ruangan bioskop = " + k.getAc() + "c");
                    output.println("=========================");
                    output.println("Parkir: " + prkr.getArea());
                    output.println(Film.tambah("Selesai"));
                    output.close();

                }catch (FileNotFoundException e) {
                    System.out.println("File mu Tidak ada!");
            }}
            else if (hidup == 6) {
                            System.exit(6);
                }
            else {
                System.out.println("salah ");

            }
        }
    }

}