import java.util.*;
import java.util.Arrays;
import java.util.*;
public class Qu2{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int u, v;
        for (int i = 0; i < n; i++) {
            minHeap.add(scan.nextInt());
        }

        for (int i = 0; i <n ; i++) {
            u = minHeap.peek();
            minHeap.poll();
            v = minHeap.peek();
            minHeap.poll();
            minHeap.add(v + (2 * u));
            if (k >= minHeap.peek())
            System.out.println(i);
        }
        if (n == 1) {
            System.out.println(-1);
        }

    }
}