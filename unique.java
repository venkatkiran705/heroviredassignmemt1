import java.util.*;

public class unique {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            a.add(b);
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if ((a.get(i) == a.get(j)) && (i != j)) {
                    a.remove(j);
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

    }
}
