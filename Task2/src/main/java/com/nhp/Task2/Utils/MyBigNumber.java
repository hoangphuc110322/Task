package com.nhp.Task2.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyBigNumber {

        public static String sum(String stn1, String stn2) {
            String kq = "";
            int i = stn1.length() - 1;
            int j = stn2.length() - 1;

            int temp;
            for(temp = 0; i >= 0 || j >= 0; --j) {
                int a = 0;
                int b = 0;
                if (i >= 0) {
                    a = Integer.parseInt(String.valueOf(stn1.charAt(i)));
                }

                if (j >= 0) {
                    b = Integer.parseInt(String.valueOf(stn2.charAt(j)));
                }

                int value = a + b + temp;
                temp = value / 10;
                kq = kq.concat(String.valueOf(value % 10));
                --i;
            }

            if (temp != 0) {
                kq = kq.concat(String.valueOf(temp));
            }

            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("Lịch sử phép toán");
            System.out.println("Phép toán " + stn1 + " + " + stn2);
            System.out.println("Kết quả = " + kq);
            return (new StringBuilder(kq)).reverse().toString();
        }
}
