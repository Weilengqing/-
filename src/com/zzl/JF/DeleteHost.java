package com.zzl.JF;

import com.zzl.jdbc.OperatorDao;

import javax.swing.*;
import java.awt.*;

public class DeleteHost extends Jcenter{
    DeleteHost(){
        setSize(650,300);
        setBorder(BorderFactory.createTitledBorder("ɾ����ͷ"));
        Label la=new Label("��ܰ��ʾɾ����ͷǰ�����Ƚ��û�ͷ�µ�ȫ����ͥ��Ա�޸Ļ����Ƴ�");
        add(la);
        JPanel p1=new JPanel();
        Label ll=new Label("����Ҫɾ���Ļ������֤�ţ�");
        JTextField f1=new JTextField(4);
        p1.add(ll);
        p1.add(f1);
        add(p1);
        Button bOK=new Button("ȷ��");
        add(bOK);
        bOK.addActionListener(e -> {
            String hid=f1.getText();
            OperatorDao.deleteById(hid);
        });
    }
}
