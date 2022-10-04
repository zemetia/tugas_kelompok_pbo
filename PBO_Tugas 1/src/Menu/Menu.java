package Menu;

import java.util.ArrayList;

public class Menu {
    protected String nama;
    protected double harga;
    protected double diskon;
    protected String ukuran;
    protected String deliver;
    protected boolean sudahDibayar;
    protected ArrayList<Hari> hariDiskon = new ArrayList<Hari>();
    protected ArrayList<String> addOns = new ArrayList<String>();

    public Menu(){
        this.sudahDibayar = false;
    }

    public void pushAddOns(String addOns){
        this.addOns.add(addOns);
    }

    public double getHarga(){
        return this.harga;
    }

    public void setHarga(double value){
        this.harga = value;
    }

    public double getDiskon(){
        return this.diskon;
    }
    public double getDiskon(Hari hari){
        if(hariDiskon.contains(hari))
            return this.diskon;
        return 0;
    }

    public void setDiskon(double value){
        this.diskon = value;
    }

    public String getUkuran(){
        return this.ukuran;
    }

    public void setUkuran(String value){
        this.ukuran = value;
    }

    public void dibayar(){
        this.sudahDibayar = true;
    }

    public void setDeliver(String type){
        this.deliver = type;
    }

    public void cetakOrder(){
        System.out.println("Nama Menu: " + this.nama + "\n" +
                        "Harga Menu: " + this.nama + "\n" +
                        "Diskon Menu: " + this.nama + "\n"
                );
    }

    public void addHariDiskon(Hari hari){
        this.hariDiskon.add(hari);
    }

    public double getHargaWithDiskon(){
        return this.harga * (1 - this.getDiskon());
    }

}
