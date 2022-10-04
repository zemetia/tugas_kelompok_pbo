package Menu;

public class Snack extends Menu{
    public Snack(String nama, double harga){
        super();
        this.nama = nama;
        this.harga = harga;
    }

    public void cetakOrder(Hari hari){
        System.out.println("Jenis orderan adalah snack" +
                "Nama Menu: " + this.nama + "\n" +
                "Harga Menu: " + this.harga + "\n" +
                "Diskon Menu: " + this.getDiskon(hari) + "\n"
        );
    }
}
