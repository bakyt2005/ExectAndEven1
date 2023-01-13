import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1, 100);
            arrayList.add(a);
        }
        System.out.println(arrayList);
        for (int a : arrayList) {
            if (a % 2 == 0) {
                arrayList1.add(a);
            } else arrayList2.add(a);
        }
        System.out.println("An exact number!" + arrayList1);
        System.out.println("An exen number!" + arrayList2);
    }
}