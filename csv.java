import java.io.*;
import java.util.Scanner;

public class csv {
    public static void main(String[] args) {
        String l = null;
        int TL = 0;
        float tbill = 0;
        float maximum = 0;
        float minimum = 9999;
        try {
            BufferedReader bufferread = new BufferedReader(new FileReader("kiran.csv"));
            while ((l = bufferread.readLine()) != null) {
                String[] transaction = l.split(",");
                tbill += Float.parseFloat(transaction[3]);
                TL++;
                if (Float.parseFloat(transaction[3]) > maximum) {
                    maximum = Float.parseFloat(transaction[3]);
                }
                if (Float.parseFloat(transaction[3]) < minimum) {
                    minimum = Float.parseFloat(transaction[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice:\n");
        System.out.println("1.Total number of Transactionds");
        System.out.println("2.Total bill");
        System.out.println("3.Minimum bill amount");
        System.out.println("4.Minimum bill amount");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("total no of transactions:" + TL);
        }
        if (n == 2) {
            System.out.println("total bill:" + tbill);
        }
        if (n == 3) {
            System.out.println("Maximum Bill:" + maximum);
        }
        if (n == 3) {
            System.out.println("Minimum Bill:" + minimum);
        }

    }

}
