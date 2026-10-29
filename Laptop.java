
/*
        Class Laptop
        NIM : 12
        NAMA : Callysta Dethan
 */
import java.util.Scanner; //library untuk read text file

public class Laptop extends Elektronik { // callysta 825240012
    // enkapsulasi
    private String prosesor, sistemOperasi;
    private int stok;
    // create object input
    Scanner inputUser = new Scanner(System.in);

    // constructor 1: inisialisasi
    // a. memberikan nilai ke variabel secara langsung
    public Laptop(String merk, String tipe, String warna, float harga,
            int stok, String prosesor, int RAM, int storage,
            double berat, String sistemOperasi) {
        super(warna, harga, merk, tipe, storage, RAM, berat); // callysta 825240012
        this.prosesor = prosesor;
        this.sistemOperasi = sistemOperasi;
        this.stok = stok;
    }

    // constructor 2: user Input
    // b. meminta input user untuk nilai variabel
    // Callysta - 825240012
    public Laptop() {
        // minta input

        System.out.println("Merek: ");
        String merk = inputUser.nextLine();
        setMerk(merk);

        System.out.print("Tipe: ");
        String tipe = inputUser.nextLine();
        setTipe(tipe);

        System.out.print("Warna: ");
        String warna = inputUser.nextLine();
        setWarna(warna);

        System.out.print("Harga: ");
        float harga = inputUser.nextFloat();
        setHarga(harga);
        inputUser.nextLine();

        System.out.print("Stok: ");
        int stok = inputUser.nextInt();
        setStok(stok);
        inputUser.nextLine();

        System.out.print("Prosesor: ");
        String prosesor = inputUser.nextLine();
        setProsesor(prosesor);

        System.out.print("RAM (GB): ");
        int RAM = inputUser.nextInt();
        super.setRAM(RAM);
        inputUser.nextLine();

        System.out.print("Storage (GB): ");
        int storage = inputUser.nextInt();
        super.setStorage(storage);
        inputUser.nextLine();

        System.out.print("Berat (kg): ");
        double berat = inputUser.nextDouble();
        setBerat(berat);
        inputUser.nextLine();

        System.out.print("Sistem Operasi: ");
        String sistemOperasi = inputUser.nextLine();
        setSistemOperasi(sistemOperasi);
    }

    // setters and getters
    // callysta - 825240012

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setProsesor(String prosesor) {
        this.prosesor = prosesor;
    }

    public String getProsesor() {
        return prosesor;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

}
