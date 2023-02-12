import java.util.Scanner;

public class electronic {
    public static void productlist(String prd[]) {
        System.out.println("list of products:\n");
        for (String x : prd) {
            System.out.println(x + "\n");
        }
    }

    public static void productquantity(String prd[], int pq[]) {
        System.out.println("quantity of products:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(prd[i] + ":" + pq[i] + "\n");
        }

    }

    public static void productdetails(String specifications[], int p[], int c[]) {
        System.out.println("product specifications : PRICE - count\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(specifications[i] + ":" + p[i] + "-" + c[i] + "\n");
        }

    }

    public static void editproducts(String specifications[], int p[], int c[]) {
        System.out.println("select product specifications to be edited");
        System.out.println("1.Air conditioner");
        System.out.println("2.Electric cooker");
        System.out.println("3.Washing Machine");
        System.out.println("4.Fridge");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("enter edit of specifications");
        sc.nextLine();
        String eds = sc.nextLine();
        System.out.println("Enter Price to be edited");
        int cst = sc.nextInt();
        if (b == 1) {

            specifications[0] = eds;
            p[0] = cst;

        }
        if (b == 2) {

            specifications[1] = eds;
            p[1] = cst;

        }
        if (b == 3) {

            specifications[2] = eds;
            p[2] = cst;

        }
        if (b == 4) {

            specifications[3] = eds;
            p[3] = cst;

        }
        for (int i = 0; i < 4; i++) {
            System.out.println(specifications[i] + ":" + p[i] + ":" + c[i]);
        }

    }

    public static void updinventary(String prd[], int pq[], String specifications[], int p[], int c[]) {
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("1. Product List");
        System.out.println("2. Product Count");
        System.out.println("3.View Product Details");
        System.out.println("4.Edit product");
        System.out.println("5.Upadate Inventary");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("enter the new quantity to update");
            pq[0] = sc.nextInt();
        }
        if (a == 2) {
            System.out.println("enter the new quantity to update");
            pq[1] = sc.nextInt();
        }
        if (a == 3) {
            System.out.println("enter the new quantity to update");
            pq[2] = sc.nextInt();
        }
        if (a == 4) {
            System.out.println("enter the new quantity to update");
            pq[3] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(prd[i] + ":" + specifications[i] + ":" + pq[i] + ":" + p[i] + ":" + c[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prd[] = { "Air conditioner", "Electric cooker", "Washing Machine", "Fridges" };
        int pq[] = { 30, 65, 50, 45 };
        String specifications[] = { "mitsubishi,1.5 ton,4 star", "prestage,5 litres,5 star", "samasung,6 kg,5 star",
                "panasonic,500 litres,5 star" };
        int p[] = { 55000, 5000, 18000, 12000 };
        int c[] = { 20, 40, 23, 20 };
        int choice;
        System.out.println("Select choice: \n");
        System.out.println("1. Product List");
        System.out.println("2. Product Count");
        System.out.println("3.View Product Details");
        System.out.println("4.Edit product");
        System.out.println("5.Upadate Inventary");
        choice = sc.nextInt();
        if (choice == 1)
            productlist(prd);
        if (choice == 2)
            productquantity(prd, pq);
        if (choice == 3)
            productdetails(specifications, p, c);
        if (choice == 4)
            editproducts(specifications, p, c);
        if (choice == 5)
            updinventary(prd, pq, specifications, p, c);

    }

}
