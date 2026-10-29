
/*
 Nama anggota dan jobdesk
 Jennifer Lolong - 825240003 - Diagram class Elektronik, Class Handphone
 Callysta Dethan - 825240012 - App, Class Laptop, Class Elektronik, inheritence, polymorphosis
 Keisha Lijaya - 825239203 - class Tablet, output tablet
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App_ {
    public static void main(String[] args) throws Exception {
        // object scanner
        Scanner sc = new Scanner(System.in);
        Scanner sc_hp = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // buat array
        ArrayList<Laptop> shapeList = new ArrayList<>();
        ArrayList<Handphone> hpList = new ArrayList<>();
        ArrayList<Tablet> tabletList = new ArrayList<>();

        // callysta - nim 825240012
        File laptopFile = new File("src/Laptop.txt");
        if (laptopFile.length() == 0) {
            shapeList
                    .add(new Laptop("Macbook", "Air M1", "Biru", 20000000.0f, 12, "Ryzen 7", 16, 512, 3.78, "Windows"));
        }

        try {
            File myObj = new File("src/Laptop.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(",");

                shapeList.add(new Laptop(
                        str[0], str[1], str[6],
                        Float.parseFloat(str[7]),
                        Integer.parseInt(str[9]),
                        str[2],
                        Integer.parseInt(str[4]),
                        Integer.parseInt(str[3]),
                        Double.parseDouble(str[8]),
                        str[5]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Data tidak ditemukan, file akan dibuat otomatis.");
        }
        // jennifer - nim 825240003
        File hpFile = new File("src/Handphone.txt");
        if (hpFile.length() == 0) {
            hpList.add(new Handphone("d", "hitam", "Samsung", "Apple", 200.0, 12, 3, 512, 12, 2000000));
        }
        try {
            File myObj_ = new File("src/Handphone.txt");
            Scanner myReader_hp = new Scanner(myObj_);
            while (myReader_hp.hasNextLine()) {
                String data = myReader_hp.nextLine();
                String[] str = data.split(",");

                hpList.add(new Handphone(
                        str[0],
                        str[1],
                        str[2],
                        str[3],
                        Double.parseDouble(str[4]),
                        Float.parseFloat(str[5]),
                        Integer.parseInt(str[6]),
                        Integer.parseInt(str[7]),
                        Integer.parseInt(str[8]),
                        Integer.parseInt(str[9])));
            }
            myReader_hp.close();
        } catch (

        FileNotFoundException e) {
            System.out.println("Data tidak ditemukan, file akan dibuat otomatis.");
        }
        // keisha Liyaja - nim 825239203
        // tablet
        File tabFile = new File("src/Tablet.txt");
        if (tabFile.length() == 0) {
            tabletList.add(new Tablet("Samsung","Ipad","Hitam",512,12500000.0f,2025,5.05f,12,5.04));
        }
        try {
            File myObj__ = new File("src/Tablet.txt");
            Scanner myReader__ = new Scanner(myObj__);
            while (myReader__.hasNextLine()) {
                String data = myReader__.nextLine();
                String[] str = data.split(",");
                tabletList.add(new Tablet(
                        str[0],                      // merk (String)
                        str[1],                      // tipe (String)
                        str[2],                      // warna (String)
                        Integer.parseInt(str[3]),    // storage (int)
                        Float.parseFloat(str[4]),    // harga (float)
                        Integer.parseInt(str[5]),    // tahunRilis (int)
                        Float.parseFloat(str[6]),    // ukuranLayar (float)
                        Integer.parseInt(str[7]),    // RAM (int)
                        Double.parseDouble(str[8])   ));// berat (double)));
            }
            myReader__.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan, file akan dibuat otomatis.");
        }
        // Callysta - nim 825240012
        System.out.print("Masukan jumlah data input (Laptop): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            shapeList.add(new Laptop());
        // input data laptop ke file
        try {
            FileWriter fw = new FileWriter("src/Laptop.txt", false); // simpan data ke file txt, true => agar file yang
            for (Laptop shape : shapeList) {
                fw.write(shape.getMerk());
                fw.write(",");
                fw.write(shape.getTipe());
                fw.write(",");
                fw.write(shape.getProsesor());
                fw.write(",");
                fw.write(String.valueOf(shape.getStorage()));
                fw.write(",");
                fw.write(String.valueOf(shape.getRAM()));
                fw.write(",");
                fw.write(shape.getSistemOperasi());
                fw.write(",");
                fw.write(shape.getWarna());
                fw.write(",");
                fw.write(String.format("%.0f", shape.getHarga()));
                fw.write(",");
                fw.write(String.valueOf(shape.getBerat()));
                fw.write(",");
                fw.write(String.valueOf(shape.getStok()));
                fw.write(System.lineSeparator());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        // jennifer - 825240003
        System.out.print("Masukkan jumlah data input (Handphone): ");
        int o = sc_hp.nextInt();

        for (int i = 0; i < o; i++)
            hpList.add(new Handphone());
        try {
            FileWriter fw = new FileWriter("src/Handphone.txt", false);

            for (Handphone hp : hpList) {
                fw.write(hp.getMerk());
                fw.write(",");
                fw.write(hp.getWarna());
                fw.write(",");
                fw.write(hp.getJaringan());
                fw.write(",");
                fw.write(hp.getTipe());
                fw.write(",");
                fw.write(String.valueOf(hp.getUkuranLayar()));
                fw.write(",");
                fw.write(String.format("%.0f", hp.getHarga()));
                fw.write(",");
                fw.write(String.valueOf(hp.getKamera()));
                fw.write(",");
                fw.write(String.valueOf(hp.getStorage()));
                fw.write(System.lineSeparator());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        // tablet
        // keisha lijaya - nim 825239203
        System.out.print("Masukkan jumlah data(Tablet): ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++)
            tabletList.add(new Tablet());
        try {
            FileWriter fw = new FileWriter("src/Tablet.txt", false);
            for (Tablet tab : tabletList) {
                fw.write(tab.getMerk());
                fw.write(",");
                fw.write(tab.getTipe());
                fw.write(",");
                fw.write(tab.getWarna());
                fw.write(",");
                fw.write(String.valueOf(tab.getUkuranLayar()));
                fw.write(",");
                fw.write(String.valueOf(tab.getRAM()));
                fw.write(","); // pakai String.valueOf
                fw.write(String.valueOf(tab.getStorage()));
                fw.write(",");
                fw.write(String.format("%.0f", tab.getHarga()));
                fw.write(",");
                fw.write(String.valueOf(tab.getTahunRilis()));
                fw.write(",");
                fw.write(String.valueOf(tab.getBerat()));
                fw.write(System.lineSeparator());
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println("=== SELAMAT DATANG DI TOKO ABC ===");
        System.out.println(" Semua Data Barang Ada di Sini ");
        System.out.println("--------------------------------------");

        System.out.println("=== Semua Data Laptop ===");
        for (Elektronik laptop : shapeList) {
            // callysta - 825240012
            if (laptop instanceof Laptop) {// polymorphic => menggunakan upcasting
                Laptop l = (Laptop) laptop;
                System.out.println("Merk: " + l.getMerk());
                System.out.println("Tipe: " + l.getTipe());
                System.out.println("Warna: " + l.getWarna());
                System.out.println("Harga: Rp " + String.format("%.0f", l.getHarga()));
                System.out.println("Stok: " + l.getStok());
                System.out.println("Prosesor: " + l.getProsesor());
                System.out.println("ram: " + l.getRAM());
                System.out.println("storage: " + l.getStorage());
                System.out.println("berat: " + l.getBerat());
                System.out.println("Sistem Operasi: " + l.getSistemOperasi());
                System.out.println("-------------------------------------");
            }
        }

        System.out.println("\n=== Semua Data Handphone ===");
        for (Handphone hp : hpList) {
            if (hp instanceof Handphone) {// polymorphic => menggunakan upcasting
                // Jennifer 825240003
                Handphone h = (Handphone) hp;
                System.out.println("Merk         : " + h.getMerk());
                System.out.println("Warna        : " + h.getWarna());
                System.out.println("Jaringan     : " + h.getJaringan());
                System.out.println("Tipe         : " + h.getTipe());
                System.out.println("Ukuran Layar : " + h.getUkuranLayar() + " inch");
                System.out.println("Harga        : Rp " + String.format("%.0f", h.getHarga()));
                System.out.println("Kamera       : " + h.getKamera() + " MP");
                System.out.println("Memori       : " + h.getStorage() + " GB");
                System.out.println("-------------------------------------");
            }
        }

        for (Tablet tab : tabletList) {
            // Callysta - 825240012
            if (tab instanceof Tablet) {// polymorphic => menggunakan upcasting
                Tablet t = (Tablet) tab;
                System.out.println("\n=== Semua Data Tablet === ");
                System.out.println("Merk: " + t.getMerk());
                System.out.println("Model: " + t.getTipe());
                System.out.println("Warna: " + t.getWarna());
                System.out.println("Ukuran Layar: " + t.getUkuranLayar() + " inci");
                System.out.println("RAM: " + t.getRAM() + " GB");
                System.out.println("Storage: " + t.getStorage() + " GB");
                System.out.println("Harga: Rp " + String.format("%.0f", t.getHarga()));
                System.out.println("Tahun Rilis: " + t.getTahunRilis());
                System.out.println("Berat: " + t.getBerat());
            }
        }
        sc.close();
        input.close();
        sc_hp.close();
    }
}
