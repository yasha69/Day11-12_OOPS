package Day11_12Oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);  //create scanner class
        StockPortfo pf = new StockPortfo();// create object for stockportfolio class
        while (flag == 0) {
            System.out.println("Enter the details of Stock ");
            StockPortfo.Stock st = new StockPortfo.Stock();
            System.out.println("Enter Company Name:");
            st.company = sc.nextLine();
            System.out.println("Enter number of share:");
            st.NoOfShare = sc.nextInt();
            System.out.println("Enter Price of share:");
            st.price = sc.nextDouble();

            pf.portf.add(st);
            System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
            flag = sc.nextInt();
        }
        for (int i = 0; i < pf.portf.size(); i++) {
            System.out.println(pf.totalValue());

        }
    }
}

class StockPortfo {
    ArrayList<Stock> portf = new ArrayList<>();
    double totalValue = 0;

    static class Stock {
        int NoOfShare;
        String company;
        double price;
    }

    public double totalValue() {
        for (Stock stock : portf) {
            totalValue += stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}
