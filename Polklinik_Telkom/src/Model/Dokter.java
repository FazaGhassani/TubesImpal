package Model;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dhino
 */
public class Dokter {

    private String namaDokter;
    private String kodeDokter;
    private String password;
    private String alamat;
    private ArrayList<Pasien> pasien;
    private Database db;

    public Dokter(String namaDokter, String kodeDokter, String password, String alamat) {
        this.db = new Database();
        this.namaDokter = namaDokter;
        this.kodeDokter = kodeDokter;
        this.password = password;
        this.alamat = alamat;
        this.pasien = new ArrayList<>();
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<Pasien> getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien.add(pasien);
    }

    public void viewDataPasien(){
        for (Pasien p : pasien) {
            System.out.print("Nama  : "+p.getNamaPasien());
            for (Jadwal j : p.getJadwal()){
                System.out.println("Shift: "+j.getShift());
            }
        }
    }
    
    public void viewPasien(){
        for (Pasien p : pasien) {
            System.out.println("Nama  : "+p.getNamaPasien());
            System.out.println("Umur  : "+p.getUmur());
            System.out.println("Kode Pasien : "+p.getKodePasien());
            System.out.println("Keluhan : "+p.getKeluhan());
            System.out.println("Diagnosa : "+p.getDiagnosa());
            System.out.println("Obat : "+p.getObat());
            for (Jadwal j : p.getJadwal()){
                System.out.println("Shift: "+j.getShift());
            }
        }
    }
    
    public void inputDiagnosa(Pasien pasien, String diagnosa) {
        pasien.setDiagnosa(diagnosa);
        db.saveDiagnosa(pasien);
    }
    
    public void inputKeluhan(Pasien pasien, String keluhan) {
        pasien.setKeluhan(keluhan);
        db.saveKeluhan(pasien);
    }
    
    public void viewJadwalPeriksa() {
       for (Pasien p : pasien){
           System.out.println("Nama Pasien: "+p.getNamaPasien());
           for (Jadwal j : p.getJadwal()){
                System.out.println("Nama Dokter: "+j.getDokter());
                System.out.println("Shift: "+j.getShift());
                System.out.println("Tanggal: "+j.getTanggal());
                System.out.println("Hari: "+j.getHari());
           }
       }
    }
}
