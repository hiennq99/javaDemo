/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author quang
 */
public class PhongThi {
    private String maPhong, diaChiPhong;
    private int luongTS;

    public PhongThi(String maPhong, String diaChiPhong, int luongTS) {
        this.maPhong = maPhong;
        this.diaChiPhong = diaChiPhong;
        this.luongTS = luongTS;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDiaChiPhong() {
        return diaChiPhong;
    }

    public void setDiaChiPhong(String diaChiPhong) {
        this.diaChiPhong = diaChiPhong;
    }

    public int getLuongTS() {
        return luongTS;
    }

    public void setLuongTS(int luongTS) {
        this.luongTS = luongTS;
    }
    
}
