package com.zzl.JF;

import com.zzl.jdbc.OperatorDao;
import com.zzl.jdbc.myDataBase;
import com.zzl.pojo.Host;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateHost extends Jcenter  {
    JButton bOK;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    UpdateHost(){
        setSize(650,300);
        setBorder(BorderFactory.createTitledBorder("修改户头"));

        Label ll=new Label("请输入要修改的户主身份证号：");
        JTextField jt=new JTextField(10);
        Button bc=new Button("查找");
        JPanel jp=new JPanel();
        jp.add(ll);jp.add(jt);jp.add(bc);
        add(jp);

        t1 = new JTextField(10);
        l1=new Label("身份证号");
        t2 = new JTextField(10);
        l2=new Label("姓名");
        t3 = new JTextField(10);
        l3=new Label("性别");
        t4 = new JTextField(10);
        l4=new Label("家庭住址");
        t5 = new JTextField(10);
        l5=new Label("宅基地大小");
        t6 = new JTextField(10);
        l6=new Label("手机号");
        t7=new JTextField(10);
        l7=new Label("家庭人口");
        t8 = new JTextField(10);
        l8=new Label("贫困等级" );

        setLayout(new GridLayout(5,2));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();

        p1.add(l1);p2.add(l2);p3.add(l3);p4.add(l4);p5.add(l5);p6.add(l6);p7.add(l7);p8.add(l8);
        p1.add(t1);p2.add(t2);p3.add(t3);p4.add(t4);p5.add(t5);p6.add(t6);p7.add(t7);p8.add(t8);
        add(p1);add(p2);add(p3);add(p4);add(p5);add(p6);add(p7);add(p8);

        JPanel p9 = new JPanel();
        bOK = new JButton("确认");
        p9.add(bOK); add(p9);

        bc.addActionListener(e->{
            Connection connection = myDataBase.getConnection();
            PreparedStatement ps;
            try {
                ps = connection.prepareStatement("select * from t_host where hid=?");
                ps.setString(1, jt.getText());
                ResultSet result = ps.executeQuery();
                while (result.next()) {
                t1.setText(result.getString("hid"));
                t2.setText(result.getString("hname"));
                t3.setText(result.getString("hsex"));
                t4.setText(result.getString("h_haddress"));
                t5.setText(String.valueOf(result.getDouble("harear")));
                t6.setText(String.valueOf(result.getInt("h_phone")));
                t7.setText(String.valueOf(result.getInt("hnumber")));
                t8.setText(result.getString("hpleve"));
                }
                myDataBase.close(ps, connection);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        bOK.addActionListener(e -> {
            String hid=t1.getText();
            String hname=t2.getText();
            String hsex=t3.getText();
            String h_haddress=t4.getText();
            Double harear= Double.valueOf(t5.getText());
            Integer h_hpone= Integer.valueOf(t6.getText());
            Integer hnumber=Integer.valueOf(t7.getText());
            String hpleve=t8.getText();
            String hidd=jt.getText();
            Host host=new Host();
            host.setHid(hid);
            host.setHname(hname);
            host.setHsex(hsex);
            host.setH_haddress(h_haddress);
            host.setHarear(harear);
            host.setH_phone(h_hpone);
            host.setHnumber(hnumber);
            host.setHpleve(hpleve);
            try {
                OperatorDao.updateAll(host,hidd);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }
}
