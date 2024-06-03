// package DigitalClock;

// import java.awt.*;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import javax.swing.*;

// public class Clock extends JFrame {

// SimpleDateFormat timeFormat;
// SimpleDateFormat dayFormat;
// SimpleDateFormat dateFormat;
// JLabel timeLabel;
// JLabel dayLabel;
// JLabel dateLabel;
// String time;
// String day;
// String date;

// Clock(){
//     this.setTitle("Digital-Life-Clock");
//     this.setSize(350,200);
//     super.setLocation(700,10);
//     this.setLayout(new FlowLayout());
//     this.setResizable(false);

//     timeFormat = new SimpleDateFormat("hh:mm:ss a");
//     timeLabel = new JLabel();
//     timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
//     timeLabel.setForeground(new Color(0x00FF00));
//     timeLabel.setOpaque(true);

//     dayFormat = new SimpleDateFormat("EEEE");
//     dayLabel = new JLabel();
//     dayLabel.setFont(new Font("Ink Free", Font.PLAIN,35));

//     dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
//     dateLabel = new JLabel();
//     dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));


//     this.add(timeLabel);
//     this.add(dayLabel);
//     this.add(dateLabel);

//     this.setVisible(true);
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     setTime();
// }

// public void setTime(){
//     while(true){
//         time = timeFormat.format(Calendar.getInstance().getTime());
//         timeLabel.setText(time);

//         day = dayFormat.format(Calendar.getInstance().getTime());
//         dayLabel.setText(day);

//         date = dateFormat.format(Calendar.getInstance().getTime());
//         dateLabel.setText(date);

//         try{
//             Thread.sleep(1000);
//         }
//           catch(InterruptedException e){
//             e.printStackTrace();
//          }
//       }
//   }
//   public static void main(String[] args) {
//     new Clock();
// }
// }



import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class Clock extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    Clock() {
        this.setTitle("Digital-Life-Clock");
        this.setSize(350, 200);
        super.setLocation(700, 10);
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setOpaque(true);

        dayFormat = new SimpleDateFormat("EEEE");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        dateFormat = new SimpleDateFormat("dd, MMMM, yyyy");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
