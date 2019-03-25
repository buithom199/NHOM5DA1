/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbchelp.JdbcHelper;

/**
 *
 * @author My PC
 */
public class PhieumuonDao {

    public static List<Phieumuon> laydulieuPhieumuon(String ma) throws SQLException {
        List<Phieumuon> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEUMUON";
        if(ma.length()>0){
        sql+= " " + ma;
        }
        ResultSet rs = JdbcHelper.executeQuery(sql);
        while (rs.next()) {
            String maphieumuon = rs.getString(1);
            String madg = rs.getString(2);
            String manv = rs.getString(3);
            String ngaymuon = rs.getString(4);
            String ngaytra = rs.getString(5);
            String trangthai = rs.getString(6);
            int tt = Integer.parseInt(trangthai);
            Phieumuon pm = new Phieumuon(maphieumuon, madg, manv, ngaymuon, ngaytra, tt);
            list.add(pm);
        }
        return list;
    }

    public static void themPhieumuon(Phieumuon object) {
        Phieumuon pm = object;
        String sql = "INSERT INTO PHIEUMUON VALUES ('" + pm.getMaphieumuon() + "','" + pm.getMadg() + "','" + pm.getManv() + "','" + pm.getNgaymuon() + "','" + pm.getNgaytra() + "','" + pm.getTrangthai() + "')";
        JdbcHelper.executeUpdate(sql);
    }

    public static void capnhatPhieumuon(Phieumuon object) {
        Phieumuon pm = object;
        String sql = "UPDATE PHIEUMUON SET madg = ?,manv = ?,ngaymuon = ?,ngaytra = ?,trangthai = ? WHERE maphieumuon = ?";
        JdbcHelper.executeUpdate(sql, pm.getMadg(), pm.getManv(), pm.getNgaymuon(), pm.getNgaytra(), pm.getTrangthai(), pm.getMaphieumuon());
    }

    public static void xoaPhieumuon(String maphieumuon) {
        String sql = "DELETE FROM PHIEUMUON WHERE maphieumuon = ?";
        JdbcHelper.executeUpdate(sql, maphieumuon);
    }
}
