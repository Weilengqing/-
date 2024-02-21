package com.zzl.JF;

import javax.swing.*;
import java.awt.*;

public class HomePage {

        static JFrame jf = new JFrame("人口统计系统");
        public static void firtPage() {
            // 设置窗体大小和标题
            jf.setPreferredSize(new Dimension(700, 700));
            // 设置关闭窗口就是关闭程序
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // 最精准的布局模式空布局
            jf.setLayout(null);
            // 设置定位
            JLabel jl = new JLabel("欢迎使用农村人口统计系统", JLabel.CENTER);
            jl.setPreferredSize(new Dimension(680, 30));
            jf.add(jl);
            jl.setBounds(0, 0, 690, 30);
            jl.setFont(new Font("宋体", Font.BOLD, 24));
            jl.setForeground(Color.decode("#375a7f"));
            //设置背景图片
            JLabel jl3=new JLabel(new ImageIcon("./images/img.png"));
            jf.add(jl3);
            jl3.setBounds(0, 20, 700, 500);
            //设置按钮
            JButton b1=new JButton("前往操作员界面");
            b1.setBounds(40,550,130,30);
            jf.add(b1);
            //设置点击监听
            b1.addActionListener(e -> {
                //销毁当前页面
                jf.dispose();
                //打开一个新的页面
                OperatorJF.firtPage();
            });
            JButton b2=new JButton("前往管理员界面");
            b2.setBounds(390,550,130,30);
            jf.add(b2);
            b2.addActionListener(e -> {
                jf.dispose();
                AdminJF.firtPage();
            });
            //设置窗体可见
            jf.pack();
            jf.setVisible(true);
        }
        public static void main(String[] args) {
            firtPage();
        }
}
