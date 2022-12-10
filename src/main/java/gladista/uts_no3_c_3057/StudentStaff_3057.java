/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gladista.uts_no3_c_3057;

/**
 *
 * gladista poskomalasari dwi rifan (21103057)
 */
public class StudentStaff_3057 extends Mahasiswa_3057{
    int jamKerja;
    String unitKerja;
    
    public double totalPendapatan(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja                     : " + unitKerja);
        System.out.println(" Jam Kerja                      : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
    }
}