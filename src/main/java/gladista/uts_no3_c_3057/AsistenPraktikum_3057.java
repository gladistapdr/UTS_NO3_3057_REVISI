/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gladista.uts_no3_c_3057;

/**
 *
 * Gladista poskomalasari dwi rifan (21103057)
 */
public class AsistenPraktikum_3057 extends Mahasiswa_3057 {
    String mkAsisten;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
        super.tampilDataMhs();
        System.out.println(" Mata Kuliah        : " + mkAsisten);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan);
        System.out.println(" Total Pendapatan   : " + totalPendapatan());
        
        
    }
    
}