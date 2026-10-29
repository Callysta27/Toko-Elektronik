/*
 Class Handphone
 NIM : 0003
 NAMA : Jennifer Clairine Nathania Lolong
 */

import java.util.Scanner;

public class Handphone extends ukuranLayar { // jennifer - 825240003
    private String jaringan;
    private int kamera;

    Scanner inputUser = new Scanner(System.in);// scanner utk input user

    // constructor 1 inisialisasi
    public Handphone(String merk, String warna, String jaringan,
            String tipe, double berat, float ukuranLayar,
            int kamera, int storage, int ram, int harga) {
        super(ukuranLayar);// jennifer - 825240003
        this.setMerk(merk);
        this.setWarna(warna);
        this.setTipe(tipe);
        this.setBerat(berat);
        this.setUkuranLayar(ukuranLayar);
        this.setKamera(kamera);
        this.setStorage(storage);
        this.setRAM(ram);
        this.setHarga(harga);
        this.setJaringan(jaringan);
    }

    // constructor 2
    // jennifer - 825240003
    public Handphone() {
        System.out.println("Merk: ");
        String merk = inputUser.nextLine();
        super.setMerk(merk);

        System.out.print("Harga: ");
        float harga = inputUser.nextFloat();
        super.setHarga(harga);
        inputUser.nextLine();

        System.out.println("Tipe: ");
        String tipe = inputUser.nextLine();
        super.setTipe(tipe);

        System.out.println("Warna: ");
        String warna = inputUser.nextLine();
        super.setWarna(warna);

        System.out.println("Storage: ");
        int Storage = inputUser.nextInt();
        super.setStorage(Storage);

        System.out.println("Jaringan: ");
        String jaringan = inputUser.nextLine();
        setJaringan(jaringan);

        System.out.println("Kamera: ");
        int kamera = inputUser.nextInt();
        setKamera(kamera);

        System.out.println("Ukuran Layar: ");
        float ukuranLayar = inputUser.nextFloat();
        setUkuranLayar(ukuranLayar);
    }

    // setter getter
    // jennifer - 825240003
    public void setWarna(String warna) {
        super.setWarna(warna);
    }

    public String getWarna() {

        return super.getWarna();
    }

    public void setHarga(float harga) {

        super.setHarga(harga);
    }

    public float getHarga() {

        return super.getHarga();
    }

    public void setMerk(String merk) {

        super.setMerk(merk);
    }

    public String getMerk() {

        return super.getMerk();
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

    public void setJaringan(String jaringan) {
        this.jaringan = jaringan;
    }

    public String getJaringan() {
        return jaringan;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public int getKamera() {
        return kamera;
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

}
