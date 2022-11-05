package PBO_Sebelum_UTS;
public class Makanan extends Transaksi {
        String gratis = "Tidak usah bayar";

   public void show(){
       System.out.println("Mendapatkan : " +super.namam ) ;
       System.out.println("jumlah makanan : " +super.jumlahm ) ;
       System.out.println("makananya\n"+this.gratis ) ;

   }


}






