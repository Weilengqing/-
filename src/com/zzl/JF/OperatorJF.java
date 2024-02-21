package com.zzl.JF;

import com.zzl.jdbc.OperatorDao;

import javax.swing.*;
import java.awt.*;


public class OperatorJF  extends Frame {
    public static void firtPage() {
        //1.���ô����С�ͱ���
        JFrame jf = new JFrame("�˿�ͳ��ϵͳ");
        jf.setPreferredSize(new Dimension(700, 700));
        //2.���ùرմ��ھ��ǹرճ���
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�׼�Ĳ���ģʽ�ղ���
        jf.setLayout(null);
        //���ö�λ
        JLabel jl = new JLabel("��ӭ����Ա��¼", JLabel.CENTER);
        jl.setPreferredSize(new Dimension(680, 30));
        jf.add(jl);
        jl.setBounds(0, 0, 690, 30);
        jl.setFont(new Font("����", Font.BOLD, 24));
        jl.setForeground(Color.decode("#375a7f"));

        // �½�һ���˵���
        JMenuBar jb = new JMenuBar();
        jf.add(jb);
        jb.setBounds(0, 40, 690, 30);
        jb.setBackground(Color.decode("#65991a"));

        //��ͷ�����˵�
        JMenu jmenu1 = new JMenu("��ͷ����");
        jmenu1.setPreferredSize(new Dimension(100, 30));
        jmenu1.setForeground(Color.white);
        jb.add(jmenu1);
        // �½�һ���˵���Ŀ
        JMenuItem jm1 = new JMenuItem("���ӻ�ͷ");
        JMenuItem jm2 = new JMenuItem("��ʾ��ͷ");
        JMenuItem jm3 = new JMenuItem("ɾ����ͷ");
        JMenuItem jm4 = new JMenuItem("�޸Ļ�ͷ");
        jmenu1.add(jm1);
        jmenu1.add(jm2);
        jmenu1.add(jm3);
        jmenu1.add(jm4);

        // ��ͥ��Ա�����˵�
        JMenu jmenu2 = new JMenu("��ͥ��Ա����");
        jmenu2.setForeground(Color.white);
        jmenu2.setPreferredSize(new Dimension(100, 30));
        jb.add(jmenu2);
        // �½�һ���˵���Ŀ
        JMenuItem jm5 = new JMenuItem("���Ӽ�ͥ��Ա");
        JMenuItem jm6 = new JMenuItem("��ʾ��ͥ��Ա");
        JMenuItem jm7 = new JMenuItem("ɾ����ͥ��Ա");
        JMenuItem jm8 = new JMenuItem("�޸ļ�ͥ��Ա");
        jmenu2.add(jm5);
        jmenu2.add(jm6);
        jmenu2.add(jm7);
        jmenu2.add(jm8);

        //�����м䲿��
        Jcenter jc=new Jcenter();
        jf.add(jc);

        //��ͷ��Ӳ������
        jm1.addActionListener(e -> {
            jc.removeAll();//�Ƴ��ɰ��
            jc.repaint();//���»���
            jc.revalidate();//���²���
            jc.add(new AddHost());//��������

        });
       //��ʾ��ͷ�������

        jm2.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();//���»���
            jc.add(new ShowHost(OperatorDao.getData()));//��������
            jc.revalidate();//���²���
        });
        //ɾ����ͷ
        jm3.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();
            jc.add(new DeleteHost());
            jc.revalidate();
        });
        //�޸Ļ�ͷ
        jm4.addActionListener(e -> {
            jc.removeAll();
            jc.repaint();
            jc.add(new UpdateHost());
            jc.revalidate();
        });
        //�˳���ť
        JButton b1 = new JButton("ȷ���˳�");
        jb.add(b1);
        b1.addActionListener(e -> {
            int i = JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ", "�˳�", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {
                jf.setVisible(false);
                HomePage.firtPage();
            }
        });
        //3.���ô���ɼ�
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        firtPage();
    }
}



