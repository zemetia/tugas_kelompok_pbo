package Menu;

public class Minuman extends Menu{
    private String coldHot;
    private String takaranGula;

    public Minuman(String nama, double harga, String coldHot){
        super();
        this.nama = nama;
        this.harga = harga;
        this.coldHot = coldHot;
    }

    public void cetakOrder(Hari hari){
        System.out.println("Jenis orderan adalah Minuman" +
                "Nama Menu: " + this.nama + "\n" +
                "Harga Menu: " + this.harga + "\n" +
                "Diskon Menu: " + this.getDiskon(hari) + "\n"
        );
    }

    public void refill(){
        System.out.println("Minuman anda sudah direfill");
    }

    public void refill(double persentage){
        System.out.println("Minuman anda sudah diisi sebanyak " + (persentage * 100) + " persen");
    }

    public void setColdHot(String coldHot){
        this.coldHot = coldHot;
    }

    public String getColdHot(){
        return this.coldHot;
    }
}
