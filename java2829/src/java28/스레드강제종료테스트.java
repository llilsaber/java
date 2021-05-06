package java28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드강제종료테스트 extends JFrame {
   JLabel count, image, day;
   Day2 day2;
   Image2 image2;

   public 스레드강제종료테스트() {
      getContentPane().setBackground(Color.WHITE);
      setSize(800, 300);
      count = new JLabel();
      image = new JLabel();
      day = new JLabel();
      getContentPane().add(count, BorderLayout.WEST);
      getContentPane().add(image, BorderLayout.EAST);
      getContentPane().add(day, BorderLayout.SOUTH);

      Font font = new Font("나눔고딕", Font.BOLD, 50);
      count.setFont(font);
      day.setFont(font);
      // count 와 day 에 폰트 지정해줌.

      // 이너클래스 Count2 로부터 객체를 생성
      Count2 count2 = new Count2();
      count2.start();

      day2 = new Day2();
      day2.start();

      image2 = new Image2();
      image2.start();

      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   // method
   // 파라메터 생성자, 생성자 오버로딩

   public static void main(String[] args) {
      // 메인메소드를 준비
      스레드강제종료테스트 t = new 스레드강제종료테스트();
   }

   // 아래로 이너클래스 정리.
   // 멤버
   public class Count2 extends Thread {

      @Override

      public void run() {

            for (int i = 50; i >= 0; i--) { // 500 부터 1씩 감소하며 0까지 총 500번 실행
               count.setText("Count : " + i); // 499, 498, 497 ...
               try {
                  Thread.sleep(50);
                  // 단위는 밀리세컨즈 (0.001초)
                  // 500 = 0.5초
                  // 0.5초(정해준 시간)마다 수행을 멈춰라! 라는 기능<
               } catch (InterruptedException e) {
                  // 인터럽트(방해, 중단) : esc, ctrl+c, power-off
               }
               if (i == 0) {
                  JOptionPane.showMessageDialog(count, "카운트가 종료되었습니다");
                  image2.stop();
                  day2.stop();
               }
         }
         System.out.println("스레드를 종료합니다."); //stop이 true가 될때 출력
      }
   }

   public class Day2 extends Thread {
      @Override
      public void run() {

            for (int i = 0; i < 1000; i++) {
               Date date = new Date();
               day.setText(date + " ");
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // 인터럽트(방해, 중단) : esc, ctrl+c, power-off
               }
            }
         }
   }

   public class Image2 extends Thread {
      @Override
      public void run() {
         String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
         for (int i = 0; i < list.length; i++) {
            ImageIcon icon = new ImageIcon(list[i]);
            // list 에 담긴 "숫자.png" 파일들을 ImageIcon 유틸을 사용하여 이미지화.
            image.setIcon(icon);
            // setIcon을 통해 list icon list에 있는 이미지들을 icon으로 설정해줌.
            try {
               // 초를 설정할 때는 밀리세컨즈, 1/1000설정.
               Thread.sleep(5000);
            } catch (InterruptedException e) {
               // 인터럽트(방해, 중단) : esc, ctrl+c, power-off
            }
         }
      }
   }
}