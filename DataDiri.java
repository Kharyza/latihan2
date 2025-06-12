package latihan2;  

public class DataDiri {
    // Atribut
    String nama;
    int usia;
    String hobi;
    String npm;
    String kelas;

    public static void main(String[] args) {
        // Membuat objek pertama
        DataDiri orang1 = new DataDiri();
        orang1.nama = "Azmi";
        orang1.npm = "2310010349";
        orang1.kelas = "4C";

        // Mencetak data diri objek pertama
        System.out.println("Nama  : " + orang1.nama);
        System.out.println("NPM   : " + orang1.npm);
        System.out.println("Kelas : " + orang1.kelas);
    }
}