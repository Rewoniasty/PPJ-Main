public class Zad143 {
    public static void main(String[] args) {

        int a[] = new int [5];
        int b[] = new int [5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random()*100);
        }

        int c[] = new int [a.length+b.length];

        int aindex = 0;
        int bindex = 0;
        int cindex = 0;

        while (aindex != a.length-1 && bindex != b.length-1){
            if (a[aindex] < b[bindex]){
                c[cindex] = a[aindex];
                aindex++;
                cindex++;
            }
            else {
                c[cindex] = b[bindex];
                bindex++;
                cindex++;
            }
        } 
    }
}
