
/*
 
 */
import java.util.Scanner;

public class Tablet extends ukuranLayar {
    // 7 atribut
    private int tahunRilis;
    // create object input
    Scanner input = new Scanner(System.in);

    // Constructor dengan parameter
    public Tablet(String merk, String tipe, String warna,
            int storage, float harga, int tahunRilis, float ukuranLayar, int RAM, double berat) {
        super(ukuranLayar);
        this.tahunRilis = tahunRilis;
        this.setMerk(merk);
        this.setTipe(tipe);
        this.setWarna(warna);
        this.setStorage(storage);
        this.setHarga(harga);
        this.setRAM(RAM);
        this.setBerat(berat);

    }

    // Constructor input user
    public Tablet() {

        System.out.print("Merk: ");
        String merk = input.nextLine();
        super.setMerk(merk);

        System.out.print("tipe: ");
        String tipe = input.nextLine();
        super.setTipe(tipe);

        System.out.print("Warna: ");
        String warna = input.nextLine();
        super.setWarna(warna);

        System.out.print("Ukuran Layar (inci): ");
        float ukuranLayar = input.nextFloat();
        super.setUkuranLayar(ukuranLayar);
        input.nextLine();

        System.out.print("RAM (GB): ");
        int RAM = input.nextInt();
        super.setRAM(RAM);
        input.nextLine();

        System.out.print("Storage (GB): ");
        int storage = input.nextInt();
        super.setStorage(storage);
        input.nextLine();

        System.out.print("Harga: ");
        float harga = input.nextFloat();
        super.setHarga(harga);
        input.nextLine();

        System.out.println("Tahun Rilis: ");
        int tahunRilis = input.nextInt();
        setTahunRilis(tahunRilis);
        input.nextLine();

        System.out.println("Berat: ");
        double berat = input.nextDouble();
        super.setBerat(berat);
        input.nextLine();
    }

    // ===== Sette getter =====

    public void setMerk(String merk) {
        super.setMerk(merk);
    }

    public String getMerk() {
        return super.getMerk();
    }

    public void setHarga(float harga) {
        super.setHarga(harga);
    }

    public float getHarga() {
        return super.getHarga();
    }

    public void setStorage(int storage) {
        super.setStorage(storage);
    }

    public int getStorage() {
        return super.getStorage();
    }

    public void setTipe(String tipe) {
        super.setTipe(tipe);
    }

    public String getTipe() {
        return super.getTipe();
    }

    public void setWarna(String warna) {
        super.setWarna(warna);
    }

    public String getWarna() {
        return super.getWarna();
    }

    public void setUkuranLayar(float ukuranLayar) {
        super.setUkuranLayar(ukuranLayar);
    }

    public float getUkuranLayar() {
        return super.getUkuranLayar();
    }

    public void setRAM(int rAM) {
        super.setRAM(rAM);
    }

    public int getRAM() {
        return super.getRAM();
    }

    public void setBerat(double berat) {
        super.setBerat(berat);
    }

    public double getBerat() {
        return super.getBerat();
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

}