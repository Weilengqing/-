package com.zzl.JF;

import com.zzl.jdbc.OperatorDao;

import javax.swing.*;
import java.awt.*;

public class DeleteHost extends Jcenter{
    DeleteHost(){
        setSize(650,300);
        setBorder(BorderFactory.createTitledBorder("删除户头"));
        Label la=new Label("温馨提示删除户头前，请先将该户头下的全部家庭成员修改或者移除");
        add(la);
        JPanel p1=new JPanel();
        Label ll=new Label("输入要删除的户主身份证号：");
        JTextField f1=new JTextField(4);
        p1.add(ll);
        p1.add(f1);
        add(p1);
        Button bOK=new Button("确认");
        add(bOK);
        bOK.addActionListener(e -> {
            String hid=f1.getText();
            OperatorDao.deleteById(hid);
        });
    }
}
