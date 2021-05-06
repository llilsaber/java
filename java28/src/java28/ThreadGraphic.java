package java28;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ThreadGraphic extends JFrame{
   JLabel count, image, day;
   
   public ThreadGraphic() { //생성자 메서드
      getContentPane().setBackground(Color.GREEN);
      setSize(800, 300);
      
      count = new JLabel("count: 500");
      count.setFont(new Font("Dialog", Font.BOLD, 55));
      getContentPane().add(count, BorderLayout.WEST);
      
      image = new JLabel();
      getContentPane().add(image, BorderLayout.CENTER);
      ImageIcon icon = new ImageIcon("1.png");
      image.setIcon(icon);
      
      
      day = new JLabel("day");
      day.setFont(new Font("Dialog", Font.BOLD, 40));
      getContentPane().add(day, BorderLayout.SOUTH);
      Date date = new Date();
      day.setText(date + "");
      
      //Count thread
      Count2 c = new Count2();
      c.start();
      
      setVisible(true);
   }
   public static void main(String[] args) {
      ThreadGraphic t = new ThreadGraphic();
   } //main

   //변수를 공유해야하는 2클래스가 있다면, 클래스안에 클래스를 낄 수 있다.
   //inner class, 내부클래스
   //내부클래스는 독립적으로 쓸 수 없다.
   public class Count2 extends Thread {
      @Override
      public void run(){
         for (int i = 500; i >= 0; i--) {
            count.setText("count : " + i);
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               //인터럽트(방해, 중단) : esc, ctrl+c, power-off
            }//catch
         }//for
      }//run
   } //inner class
} //class