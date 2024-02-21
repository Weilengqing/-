package com.zzl.JF;

import com.zzl.pojo.Host;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ShowHost  extends Jcenter {

    ShowHost(List<Host> list) {
        setSize(650, 600);
        setBorder(BorderFactory.createTitledBorder("显示户头"));

        String[] index = {"身份证号", "姓名", "性别", "家庭住址", "在基地大小", "电话", "家庭人口", "贫苦等级"};
        Object[][] data = new Object[list.size()][index.length];
        //向data添加数据
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
        //添加一个表格
        DefaultTableModel dtm = new DefaultTableModel(data, index);
        JTable table = new JTable(dtm);
        table.setBackground(Color.PINK);
        //设置table的高度和宽度
        table.setPreferredScrollableViewportSize(new Dimension(650, 500));
        table.setFillsViewportHeight(true);
        //5，给表格设置滚动条
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(table);
        //添加滚条
        add(jScrollPane, BorderLayout.SOUTH);
    }


}
