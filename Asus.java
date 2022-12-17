package PBO_Sebelum_UTS;

public class Asus implements Kasir,Ac {
    private  int ac;
    private boolean isOn;;

    public Asus() {
        this.ac = 30;
        this.isOn = false;
    }


    @Override
    public void On() {
        isOn = true;
        System.out.println("Kasir Nyala ");
        System.out.println("Selamat daatang di bioskop X");
    }

    @Override
    public void Off() {
    isOn = false;
    System.out.println("Kasir Mati ");
    }

    @Override
    public void Acup() {
    if(isOn == true){
        if(this.ac == MAX_AC){
            System.out.println("Gak kepanasan bang ?");
            System.out.println("Sudah di derajat " + this.getAc() + "C");
        }else {
            this.ac += 2;
            System.out.println("AC sekarang : " + this.getAc()+ " C");
        }
    }else{
        System.out.println("Nyalakan kasir terlebih dahulu ");
    }
    }

    @Override
    public void Acdown() {
        if(isOn){
            if(this.ac == MIN_AC){
                System.out.println("AC = 0 C ");
                System.out.println("gk kedinginan bang ?");
            }else{
                this.ac -= 2;
                System.out.println("Suhu ruangan = " + this.getAc() + "c");
            }
        }else {
           System.out.println("Nyalakan kasir ");
        }
    }

    public int getAc() {
        return ac;
    }
}