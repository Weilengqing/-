package com.zzl.JF;

import com.zzl.jdbc.myDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddHost extends Jcenter implements ActionListener {

        //增加
        JButton bOK;
        JTextField t1,t2,t3,t4,t5,t6,t7;
        Label l1,l2,l3,l4,l5,l6,l7;
        AddHost(){
            setSize(650,300);
            setBorder(BorderFactory.createTitledBorder("增加户头"));
            t1 = new JTextField(10);
            l1=new Label("请输入身份证号");
            t2 = new JTextField(10);
            l2=new Label("请输入姓名");
            t3 = new JTextField(10);
            l3=new Label("请输入性别");
            t4 = new JTextField(10);
            l4=new Label("请输入家庭住址");
            t5 = new JTextField(10);
            l5=new Label("请输入宅基地大小");
            t6 = new JTextField(10);
            l6=new Label("请输入手机号");
            t7 = new JTextField(10);
            l7=new Label("请输入贫困类");



            setLayout(new GridLayout(5,2));
            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();
            JPanel p4 = new JPanel();
            JPanel p5 = new JPanel();
            JPanel p6 = new JPanel();
            JPanel p7 = new JPanel();



            p1.add(l1);p2.add(l2);p3.add(l3);p4.add(l4);p5.add(l5);p6.add(l6);p7.add(l7);
            p1.add(t1);p2.add(t2);p3.add(t3);p4.add(t4);p5.add(t5);p6.add(t6);p7.add(t7);
            add(p1);add(p2);add(p3);add(p4);add(p5);add(p6);add(p7);

            JPanel p8 = new JPanel();
            bOK = new JButton("增加");
            bOK.addActionListener(this);
            p8.add(bOK); add(p8);
        }


    @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            if(obj == bOK) {
                String hid = this.t1.getText();
                String hname = this.t2.getText();
                String hsex = this.t3.getText();
                String h_haddress = this.t4.getText();
                String hraea = this.t5.getText();
                String h_phone = this.t6.getText();
                String hpleve = this.t7.getText();
                Connection connection=myDataBase.getConnection();
                String sql = "insert into t_host(hid,hname,hsex,h_haddress,harear,h_phone,hpleve) values("+hid+",'"+hname+"','"+hsex+"','"+h_haddress+"','"+hraea+"','"+h_phone+"','"+hpleve+"')";
                try {
                    PreparedStatement ps=connection.prepareStatement(sql);
                    System.out.println(sql);
                    ps.execute(sql);
                    boolean i=ps.execute("select * from t_host where hid=("+hid+")");
                    myDataBase.close(ps,connection);
                    if (i)
                        JOptionPane.showMessageDialog(null,"添加成功！","系统信息",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e1) {
                    System.err.println(e1.getMessage());
                    JOptionPane.showMessageDialog(null,"添加失败！","系统信息",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }


}
