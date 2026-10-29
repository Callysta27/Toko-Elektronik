# 🛒 Toko Elektronik

Program konsol berbasis **Java** untuk mengelola data barang di sebuah toko elektronik: **Laptop**, **Handphone**, dan **Tablet**. Proyek ini dibuat sebagai tugas mata kuliah **Pemrograman Berorientasi Objek (PBO/OBP)** dan menerapkan konsep enkapsulasi, inheritance, constructor overloading, polymorphism, serta penyimpanan data ke file teks.

## ✨ Fitur

- Menambahkan data Laptop, Handphone, dan Tablet melalui input pengguna
- Menyimpan data ke file `.txt` sehingga tetap tersedia saat program dijalankan ulang
- Membaca data yang sudah tersimpan dari file `.txt` saat program dimulai
- Mengisi data contoh secara otomatis jika file masih kosong
- Menampilkan seluruh data barang per kategori

## 🧱 Struktur Class

```
Elektronik                 (merk, tipe, warna, harga, storage, RAM, berat)
├── Laptop                 (prosesor, sistemOperasi, stok)
└── ukuranLayar            (ukuranLayar)
    ├── Handphone          (jaringan, kamera)
    └── Tablet             (tahunRilis)
```

Diagram class lengkap tersedia di file [`diagram OBP.drawio (3).pdf`](./diagram%20OBP.drawio%20(3).pdf).

## 📚 Konsep OOP yang Diterapkan

| Konsep | Penerapan |
|---|---|
| **Enkapsulasi** | Semua atribut bersifat `private` dan diakses lewat setter/getter |
| **Inheritance** | `Laptop` dan `ukuranLayar` mewarisi `Elektronik`; `Handphone` dan `Tablet` mewarisi `ukuranLayar` |
| **Constructor overloading** | Setiap class punya constructor berparameter (inisialisasi langsung) dan constructor tanpa parameter (input dari pengguna) |
| **Polymorphism** | Objek diproses sebagai tipe induk `Elektronik`, lalu dicek dengan `instanceof` dan di-*casting* ke class turunannya |
| **File I/O** | Membaca data dengan `Scanner` + `File`, menulis data dengan `FileWriter` |

## 📁 Struktur File

| File | Keterangan |
|---|---|
| `App_.java` | Program utama (method `main`) |
| `Elektronik.java` | Class induk untuk semua barang elektronik |
| `ukuranLayar.java` | Class perantara untuk perangkat berlayar |
| `Laptop.java` | Class Laptop |
| `Handphone.java` | Class Handphone |
| `Tablet.java` | Class Tablet |
| `Laptop.txt`, `Handphone.txt`, `Tablet.txt` | Penyimpanan data barang (format dipisah koma) |

## 🚀 Cara Menjalankan

### Prasyarat
- JDK 8 atau lebih baru
- (Opsional) Visual Studio Code dengan *Extension Pack for Java*

### Langkah-langkah

Program membaca dan menyimpan data di path `src/*.txt`, jadi semua file perlu berada di dalam folder `src`, dan program dijalankan dari folder induknya.

```bash
git clone https://github.com/Callysta27/Toko-Elektronik.git
cd Toko-Elektronik

# kompilasi
javac -d bin src/*.java

# jalankan
java -cp bin App_
```

Jika memakai VS Code, buka folder proyek lalu klik **Run** pada `App_.java`.

### Alur Program
1. Program memuat data dari `Laptop.txt`, `Handphone.txt`, dan `Tablet.txt`.
2. Pengguna diminta memasukkan jumlah data baru untuk Laptop, Handphone, lalu Tablet, kemudian mengisi detail tiap barang.
3. Semua data disimpan kembali ke file `.txt`.
4. Program menampilkan seluruh data barang per kategori.

## 👥 Anggota Kelompok

| Nama | NIM | Kontribusi |
|---|---|---|
| Jennifer Lolong | 825240003 | Diagram class Elektronik, class Handphone |
| Callysta Dethan | 825240012 | App, class Laptop, class Elektronik, inheritance, polymorphism |
| Keisha Lijaya | 825239203 | Class Tablet, output Tablet |
