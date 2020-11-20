public class Zad113{
    public static void main(String[] args) {

        char[] cArr = new char[3];
        char min = Character.MAX_VALUE;
        int index_min  = 0;

        for (int i=0; i<cArr.length; i++){
            cArr[i] = (char)((int)(Math.random()*26)+ 'A');
            if (cArr[i] < min){
                min = cArr[i];
                index_min = i;
            }
        }
        
        System.out.println(index_min);
    }
}