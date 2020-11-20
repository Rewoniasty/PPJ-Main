public class Zad114 {
    public static void main(String[] args) {
        char[] cArr = new char[5];
        int j = 0;

        for (int i=0; i<cArr.length; i++){
            cArr[i] = (char)((int)(Math.random()*26)+ 'A');
            System.out.print(cArr[i] + " ");
        }
        
        while (j !=5){
            java.util.Scanner in=new java.util.Scanner(System.in);
            char c=in.next().charAt(0);
            for (int i=0; i<cArr.length; i++){
                if (cArr[i] == c){
                    cArr[i] = '0';
                    j++;
                }
            }
        }
    }
}
