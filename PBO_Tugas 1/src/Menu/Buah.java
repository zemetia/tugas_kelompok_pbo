package Menu;

public class Buah extends Menu{
    public Buah(String nama, double harga){
        super();
        this.nama = nama;
        this.harga = harga;
    }

    public void cetakOrder(Hari hari){
        System.out.println("Jenis orderan adalah buah" +
                "Nama Menu: " + this.nama + "\n" +
                "Harga Menu: " + this.harga + "\n" +
                "Diskon Menu: " + this.getDiskon(hari) + "\n"
        );
    }
}
