package com.zzl.JF;

import javax.swing.*;
import java.awt.*;

public class AdminJF {
    public static void firtPage(){
        //1.���ô����С�ͱ���
        JFrame jf=new JFrame("�˿�ͳ��ϵͳ");
        jf.setPreferredSize(new Dimension(700, 700));
        //2.���ùرմ��ھ��ǹرճ���
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�׼�Ĳ���ģʽ�ղ���
        jf.setLayout(null);
        //���ö�λ
        JLabel jl=new JLabel("��ӭ����Ա��¼",JLabel.CENTER);
        jl.setPreferredSize(new Dimension(680, 30));
        jf.add(jl);
        jl.setBounds(0,0,690, 30);
        jl.setFont(new Font("����", Font.BOLD, 24));
        jl.setForeground(Color.decode("#375a7f"));
        // �˵���
        // �½�һ���˵���
        JMenuBar jb = new JMenuBar();
        jf.add(jb);
        jb.setBounds(0, 40, 690, 30);
        jb.setBackground(Color.decode("#65991a"));

        // �½�һ���˵���
        JMenu jmenu1 = new JMenu("����ƶ������");
        jmenu1.setPreferredSize(new Dimension(100, 30));
        jmenu1.setForeground(Color.white);
        jb.add(jmenu1);
        // �½�һ���˵���
        JMenuItem jm1 = new JMenuItem("���ƶ������");
        JMenuItem jm2= new JMenuItem("ɾ��ƶ������");
        JMenuItem jm3= new JMenuItem("��ʾƶ������");
        JMenuItem jm4= new JMenuItem("�޸�ƶ������");

        jmenu1.add(jm1);
        jmenu1.add(jm2);
        jmenu1.add(jm3);
        jmenu1.add(jm4);


        // �½�һ���˵�ѡ��
        JMenu jmenu2 = new JMenu("�����ַ");
        jmenu2.setForeground(Color.white);
        jmenu2.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu2);
        // �½�һ���˵���
        JMenuItem jm5 = new JMenuItem("�޸�ʡ");
        JMenuItem jm6 = new JMenuItem("�޸���");
        JMenuItem jm7 = new JMenuItem("�޸����磩");
        JMenuItem jm8 = new JMenuItem("�޸Ĵ�");
        jmenu2.add(jm5);
        jmenu2.add(jm6);
        jmenu2.add(jm7);
        jmenu2.add(jm8);

        // �½�һ���˵�ѡ��
        JMenu jmenu3 = new JMenu("�������Ա");
        jmenu3.setForeground(Color.white);
        jmenu3.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu3);
        // �½�һ���˵���
        JMenuItem jm9= new JMenuItem("���Ӳ���Ա");
        JMenuItem jm10= new JMenuItem("ɾ������Ա");
        JMenuItem jm11= new JMenuItem("��ʾ����Ա");
        JMenuItem jm12= new JMenuItem("�޸Ĳ���Ա");
        jmenu3.add(jm9);
        jmenu3.add(jm10);
        jmenu3.add(jm11);
        jmenu3.add(jm12);
        //��������ʾλ�Ƶĵط�

        JPanel jp2=new JPanel();//����һ��������������л�
        jp2.setBounds(0,100,690,500);
        jf.add(jp2,BorderLayout.CENTER);

        //3.���ô���ɼ�
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        firtPage();
    }

}
