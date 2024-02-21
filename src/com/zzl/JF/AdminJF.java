package com.zzl.JF;

import javax.swing.*;
import java.awt.*;

public class AdminJF {
    public static void firtPage(){
        //1.设置窗体大小和标题
        JFrame jf=new JFrame("人口统计系统");
        jf.setPreferredSize(new Dimension(700, 700));
        //2.设置关闭窗口就是关闭程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //最精准的布局模式空布局
        jf.setLayout(null);
        //设置定位
        JLabel jl=new JLabel("欢迎管理员登录",JLabel.CENTER);
        jl.setPreferredSize(new Dimension(680, 30));
        jf.add(jl);
        jl.setBounds(0,0,690, 30);
        jl.setFont(new Font("宋体", Font.BOLD, 24));
        jl.setForeground(Color.decode("#375a7f"));
        // 菜单栏
        // 新建一个菜单条
        JMenuBar jb = new JMenuBar();
        jf.add(jb);
        jb.setBounds(0, 40, 690, 30);
        jb.setBackground(Color.decode("#65991a"));

        // 新建一个菜单项
        JMenu jmenu1 = new JMenu("管理贫困种类");
        jmenu1.setPreferredSize(new Dimension(100, 30));
        jmenu1.setForeground(Color.white);
        jb.add(jmenu1);
        // 新建一个菜单项
        JMenuItem jm1 = new JMenuItem("添加贫困种类");
        JMenuItem jm2= new JMenuItem("删除贫困种类");
        JMenuItem jm3= new JMenuItem("显示贫困种类");
        JMenuItem jm4= new JMenuItem("修改贫困种类");

        jmenu1.add(jm1);
        jmenu1.add(jm2);
        jmenu1.add(jm3);
        jmenu1.add(jm4);


        // 新建一个菜单选项
        JMenu jmenu2 = new JMenu("管理地址");
        jmenu2.setForeground(Color.white);
        jmenu2.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu2);
        // 新建一个菜单项
        JMenuItem jm5 = new JMenuItem("修改省");
        JMenuItem jm6 = new JMenuItem("修改市");
        JMenuItem jm7 = new JMenuItem("修改镇（乡）");
        JMenuItem jm8 = new JMenuItem("修改村");
        jmenu2.add(jm5);
        jmenu2.add(jm6);
        jmenu2.add(jm7);
        jmenu2.add(jm8);

        // 新建一个菜单选项
        JMenu jmenu3 = new JMenu("管理操作员");
        jmenu3.setForeground(Color.white);
        jmenu3.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu3);
        // 新建一个菜单项
        JMenuItem jm9= new JMenuItem("增加操作员");
        JMenuItem jm10= new JMenuItem("删除操作员");
        JMenuItem jm11= new JMenuItem("显示操作员");
        JMenuItem jm12= new JMenuItem("修改操作员");
        jmenu3.add(jm9);
        jmenu3.add(jm10);
        jmenu3.add(jm11);
        jmenu3.add(jm12);
        //以下是显示位移的地方

        JPanel jp2=new JPanel();//设置一个面板容器方便切换
        jp2.setBounds(0,100,690,500);
        jf.add(jp2,BorderLayout.CENTER);

        //3.设置窗体可见
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        firtPage();
    }

}
