package praktikum2.soal3;

public class Pegawai {
	public String nama; 
    //public char asal; 
	//baris 5 menggunakan String karena berupa kalimat
	public String asal;
    public String jabatan; 
    public int umur; 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getAsal() { 
    	return asal;
    } 
 
    public void setJabatan(String j) { 
        //this.jabatan = j; 
    	// variable j belum dideklarasi
    	this.jabatan = j; 
    } 
    
    public void setUmur(int u) { 
    	this.umur = u; 
    } 
}