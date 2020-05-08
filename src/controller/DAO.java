/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author quang
 */
public class DAO {
    private Connection conn;
    public ArrayList<SinhVien> getlistSv()
    {
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql = "select * from SinhVien";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs=  ps.executeQuery();
            while(rs.next())
            {
                SinhVien s = new SinhVien();
                s.setSBD(rs.getString("SBD"));
                s.setSBD(rs.getString("Ho Ten"));
                s.setSBD(rs.getString("Diem Toan"));
                s.setSBD(rs.getString("Diem Ly"));
                s.setSBD(rs.getString("Diem Hoa"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public DAO(){
       
    };
    
}
