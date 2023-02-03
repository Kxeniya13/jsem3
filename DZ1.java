import java.util.ArrayList;
import java.util.Random;

public class DZ1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            lst.add(val);
        }
        System.out.printf("Первоначальный список %s\n", lst);
        int i = 0;
        while (i < lst.size()) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел %s\n", lst);
    }
}