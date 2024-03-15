package A08_MethodReference.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginJFrame extends MyJFrame {


    JButton go = new JButton("Go");
    JButton button1 = new JButton("Button 1");

    public LoginJFrame() {
        //设置图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("myfunction\\image\\logo.jpg"));

        //设置界面
        initJframe();

        //添加组件
        initView();

        //界面显示出来
        this.setVisible(true);

    }

    //添加组件
    public void initView() {
        JLabel image = new JLabel(new ImageIcon("src/image/kit.jpg"));
        image.setBounds(100,50,174,174);
        this.getContentPane().add(image);



        go.setFont(new Font(null,1,20));
        go.setBounds(120,274,150,50);
        go.setBackground(Color.WHITE);

        go.addActionListener(super::method1);

        this.getContentPane().add(go);

        button1.setFont(new Font(null, 1, 20));
        button1.setBounds(120, 374, 150, 50);
        button1.setBackground(Color.WHITE);
        button1.addActionListener(this::method2);

        this.getContentPane().add(button1);

    }

    //设置界面
    public void initJframe() {
        //设置标题
        this.setTitle("随机点名器");
        //设置大小
        this.setSize(400, 500);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消内部默认居中放置
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(Color.white);
        this.setAlwaysOnTop(true);//置顶
    }

    public void method2(ActionEvent e){
        System.out.println("method 2 clicked");
    }



}
