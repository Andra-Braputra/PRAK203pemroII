package praktikum2.soal3;

public class Soal3Main {
	public static void main(String[] args) { 
        Pegawai p1 = new Pegawai(); 
        //p1.nama = "Roi"
        //baris 6 kurang titik koma(;)
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; 
        //baris 9 salah tipe data pada Pegawai.java
        p1.setJabatan("Assasin"); 
        p1.setUmur(17);
        
 
        System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Asal: " + p1.getAsal()); 
        System.out.println("Jabatan: " + p1.jabatan); 
        System.out.println("Umur: " + p1.umur); 
} 
} 

