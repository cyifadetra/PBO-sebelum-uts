package PBO_Sebelum_UTS;
public class Ticket extends Transaksi{

    private int jumlaht;
    private int org;
    private String n;

    public void setJumlaht(int jumlaht) {
        this.jumlaht = jumlaht;
    }
    public void setOrg(int org){
        this.org = org;
    }
    public void setN(String n){
        this.n = n;
    }

    @Override
    public double jumlah() {
        return jumlaht*org;
    }

    @Override
    public String name() {
        return n;
    }
}


