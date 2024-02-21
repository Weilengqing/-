package com.zzl.JF;

import com.zzl.pojo.Host;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ShowHost  extends Jcenter {

    ShowHost(List<Host> list) {
        setSize(650, 600);
        setBorder(BorderFactory.createTitledBorder("��ʾ��ͷ"));

        String[] index = {"���֤��", "����", "�Ա�", "��ͥסַ", "�ڻ��ش�С", "�绰", "��ͥ�˿�", "ƶ��ȼ�"};
        Object[][] data = new Object[list.size()][index.length];
        //��data�������
        for (int i = 0; i < list.size(); i++) {
            Host host = list.get(i);
            data[i][0] = host.getHid();
            data[i][1] = host.getHname();
            data[i][2] = host.getHsex();
            data[i][3] = host.getH_haddress();
            data[i][4] = host.getHarear();
            data[i][5] = host.getH_phone();
            data[i][6] = host.getHnumber();
            data[i][7] = host.getHpleve();
        }
        //���һ�����
        DefaultTableModel dtm = new DefaultTableModel(data, index);
        JTable table = new JTable(dtm);
        table.setBackground(Color.PINK);
        //����table�ĸ߶ȺͿ��
        table.setPreferredScrollableViewportSize(new Dimension(650, 500));
        table.setFillsViewportHeight(true);
        //5����������ù�����
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(table);
        //��ӹ���
        add(jScrollPane, BorderLayout.SOUTH);
    }


}
