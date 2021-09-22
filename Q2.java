import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        Node root = new Node('\0');
        for (int i = 0; i < n; i++) {
            Node p = root;
            int freq = scanner.nextInt();
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                while (s.charAt(j) != p.info && p.right != null){
                    p = p.right;
                }
                if (p.right != null){
                    p.right = new Node(s.charAt(j));
                    p = p.right;
                }else {
                    if (p.next != null){
                        p = p.next;
                    }else {
                        
                    }
                }

            }
            if (p.flag == 0){
                p.flag = 1;
                p.frequency = freq;
            }else {
                p.frequency = Math.max(p.frequency,freq);
            }
        }
        String s = scanner.next();

    }
}
class Node{
    int frequency;
    int flag;
    char info;
    Node next;
    Node right;
    Node(char info){
        this.info = info;
    }
}
