package com.zzl.JF;

import javax.swing.*;
import java.awt.*;

public class HomePage {

        static JFrame jf = new JFrame("�˿�ͳ��ϵͳ");
        public static void firtPage() {
            // ���ô����С�ͱ���
            jf.setPreferredSize(new Dimension(700, 700));
            // ���ùرմ��ھ��ǹرճ���
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // �׼�Ĳ���ģʽ�ղ���
            jf.setLayout(null);
            // ���ö�λ
            JLabel jl = new JLabel("��ӭʹ��ũ���˿�ͳ��ϵͳ", JLabel.CENTER);
            jl.setPreferredSize(new Dimension(680, 30));
            jf.add(jl);
            jl.setBounds(0, 0, 690, 30);
            jl.setFont(new Font("����", Font.BOLD, 24));
            jl.setForeground(Color.decode("#375a7f"));
            //���ñ���ͼƬ
            JLabel jl3=new JLabel(new ImageIcon("./images/img.png"));
            jf.add(jl3);
            jl3.setBounds(0, 20, 700, 500);
            //���ð�ť
            JButton b1=new JButton("ǰ������Ա����");
            b1.setBounds(40,550,130,30);
            jf.add(b1);
            //���õ������
            b1.addActionListener(e -> {
                //���ٵ�ǰҳ��
                jf.dispose();
                //��һ���µ�ҳ��
                OperatorJF.firtPage();
            });
            JButton b2=new JButton("ǰ������Ա����");
            b2.setBounds(390,550,130,30);
            jf.add(b2);
            b2.addActionListener(e -> {
                jf.dispose();
                AdminJF.firtPage();
            });
            //���ô���ɼ�
            jf.pack();
            jf.setVisible(true);
        }
        public static void main(String[] args) {
            firtPage();
        }
}
