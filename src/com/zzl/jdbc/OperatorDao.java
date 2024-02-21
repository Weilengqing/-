package com.zzl.jdbc;

import com.zzl.pojo.Host;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class OperatorDao {
    //获取数据以结果集返回,查找户头数据，
    public static List<Host> getData() {
        String sql = "select * from t_host";
        PreparedStatement ps;
        LinkedList<Host> list = null;
        try {
            Connection connection = myDataBase.getConnection();
            ps = connection.prepareStatement(sql);
            ResultSet result = ps.executeQuery();//获得结果集
            list = new LinkedList<>();
            while (result.next()) {
                Host host = new Host();
                host.setHid(result.getString("hid"));
                host.setHname(result.getString("hname"));
                host.setHsex(result.getString("hsex"));
                host.setH_haddress(result.getString("h_haddress"));
                host.setHarear(result.getDouble("harear"));
                host.setH_phone(result.getInt("h_phone"));
                host.setHnumber(result.getInt("hnumber"));
                host.setHpleve(result.getString("hpleve"));
                list.add(host);
            }
            myDataBase.close(ps, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
   //通过Id删除数据
    public static void deleteById(String hid) {
        String sql = "delete from t_host where hid=?";//类似于一个占位符
        PreparedStatement ps;
        try {
            Connection connection = myDataBase.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, hid);//参数标记从 1 开始编号, 通常指的是第一个“？”
            ps.executeUpdate();
            int f = ps.executeUpdate();
            if (f > 0) {
                JOptionPane.showMessageDialog(null, "没有删除数据");
            } else {
                JOptionPane.showMessageDialog(null, "成功删除数据");
            }
            ps.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   //通过Id更新数据
    public static void updateAll(Host h, String jt) throws SQLException {
        Connection connection = myDataBase.getConnection();
        PreparedStatement ps = connection.prepareStatement("update t_host set hid=?,hname=?,hsex=?,h_haddress=?,harear=?,h_phone=?,hnumber=?,hpleve=? where hid=?");
        ps.setString(1, h.getHid());
        ps.setString(2, h.getHname());
        ps.setString(3, h.getHsex());
        ps.setString(4, h.getH_haddress());
        ps.setDouble(5, h.getHarear());
        ps.setInt(6, h.getH_phone());
        ps.setInt(7, h.getHnumber());
        ps.setString(8, h.getHpleve());
        ps.setString(9,jt);
        int f = ps.executeUpdate();
        System.out.println(f);
        if (f > 0) {
            JOptionPane.showMessageDialog(null, "成功更新数据");
        } else {
            JOptionPane.showMessageDialog(null, "更新数据失败");
        }
    }
}
