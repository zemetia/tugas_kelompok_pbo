package Menu;

public class Makanan extends Menu{
    private int levelPedas;


    public Makanan(String nama, double harga){
        super();
        this.nama = nama;
        this.harga = harga;
    }

    public void cetakOrder(Hari hari){
        System.out.println("Jenis orderan adalah Makanan" +
                "Nama Menu: " + this.nama + "\n" +
                "Harga Menu: " + this.harga + "\n" +
                "Diskon Menu: " + this.getDiskon(hari) + "\n"
        );
    }

    public int getLevelPedas(){
        return this.levelPedas;
    }

    public int setLevelPedas(int value){
        this.levelPedas = value;
    }
}
