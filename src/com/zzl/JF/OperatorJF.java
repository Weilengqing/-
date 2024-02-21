package com.zzl.JF;

import com.zzl.jdbc.OperatorDao;

import javax.swing.*;
import java.awt.*;


public class OperatorJF  extends Frame {
    public static void firtPage() {
        //1.设置窗体大小和标题
        JFrame jf = new JFrame("人口统计系统");
        jf.setPreferredSize(new Dimension(700, 700));
        //2.设置关闭窗口就是关闭程序
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //最精准的布局模式空布局
        jf.setLayout(null);
        //设置定位
        JLabel jl = new JLabel("欢迎操作员登录", JLabel.CENTER);
        jl.setPreferredSize(new Dimension(680, 30));
        jf.add(jl);
        jl.setBounds(0, 0, 690, 30);
        jl.setFont(new Font("宋体", Font.BOLD, 24));
        jl.setForeground(Color.decode("#375a7f"));

        // 新建一个菜单条
        JMenuBar jb = new JMenuBar();
        jf.add(jb);
        jb.setBounds(0, 40, 690, 30);
        jb.setBackground(Color.decode("#65991a"));

        //户头操作菜单
        JMenu jmenu1 = new JMenu("户头操作");
        jmenu1.setPreferredSize(new Dimension(100, 30));
        jmenu1.setForeground(Color.white);
        jb.add(jmenu1);
        // 新建一个菜单条目
        JMenuItem jm1 = new JMenuItem("增加户头");
        JMenuItem jm2 = new JMenuItem("显示户头");
        JMenuItem jm3 = new JMenuItem("删除户头");
        JMenuItem jm4 = new JMenuItem("修改户头");
        jmenu1.add(jm1);
        jmenu1.add(jm2);
        jmenu1.add(jm3);
        jmenu1.add(jm4);

        // 家庭成员操作菜单
        JMenu jmenu2 = new JMenu("家庭成员操作");
        jmenu2.setForeground(Color.white);
        jmenu2.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu2);
        // 新建一个菜单条目
        JMenuItem jm5 = new JMenuItem("增加家庭成员");
        JMenuItem jm6 = new JMenuItem("显示家庭成员");
        JMenuItem jm7 = new JMenuItem("删除家庭成员");
        JMenuItem jm8 = new JMenuItem("修改家庭成员");
        jmenu2.add(jm5);
        jmenu2.add(jm6);
        jmenu2.add(jm7);
        jmenu2.add(jm8);

        //设置中间部分
        Jcenter jc=new Jcenter();
        jf.add(jc);

        //户头添加操作面板
        jm1.addActionListener(e -> {
            jc.removeAll();//移除旧板块
            jc.repaint();//重新绘制
            jc.revalidate();//重新布局
            jc.add(new AddHost());//添加新面板

        });
       //显示户头操作面板

        jm2.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();//重新绘制
            jc.add(new ShowHost(OperatorDao.getData()));//添加新面板
            jc.revalidate();//重新布局
        });
        //删除户头
        jm3.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();
            jc.add(new DeleteHost());
            jc.revalidate();
        });
        //修改户头
        jm4.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();
            jc.add(new UpdateHost());
            jc.revalidate();
        });
        //退出按钮
        JButton b1 = new JButton("确认退出");
        jb.add(b1);
        b1.addActionListener(e -> {
            int i = JOptionPane.showConfirmDialog(null, "是否退出系统", "退出", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                jf.setVisible(false);
                HomePage.firtPage();
            }
        });
        //3.设置窗体可见
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        firtPage();
    }
}



