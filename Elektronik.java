//Callysta - 825240012
public class Elektronik {
    private String warna, merk, tipe;
    private float harga;
    private int storage, RAM;
    private double berat;

    // constructor inisialisasi
    public Elektronik(String warna, float harga, String merk, String tipe, int storage,
            int RAM, double berat) {
        this.warna = warna;
        this.harga = harga;
        this.merk = merk;
        this.tipe = tipe;
        this.storage = storage;
        this.RAM = RAM;
        this.berat = berat;
    }

    // constructor user input
    public Elektronik() {
        this.warna = "";
        this.harga = 0;
        this.merk = "";
        this.tipe = "";
        this.storage = 0;
        this.RAM = 0;
        this.berat = 0;
    }

    // setter getter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public float getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public int getRAM() {
        return RAM;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public double getBerat() {
        return berat;
    }

}
