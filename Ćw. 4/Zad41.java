public class Zad41{
    public static void main(String[] args){
        int a = 23594 % 8000;

        System.out.println(016652);

        System.out.println(((a & 1) == 1)?'2':'H');
        System.out.println(((a & 2) == 2)?'E':'0');
        System.out.println(((a & 4) == 4)?'2':'L');
        System.out.println(((a & 8) == 8)?'L':'0');
        System.out.println(((a & 16) == 16)?'2':'O');
        System.out.println(((a & 32) == 32)?'P':'0');
        System.out.println(((a & 64) == 64)?'2':'P');
        System.out.println(((a & 128) == 128)?'J':'2');

        System.out.println(((a & 512) == 512)?'A':((a & 256) == 256)?'2':'@');
        System.out.println(((a & 2048) == 2048)?'0':((a & 1024) == 1024)?'E':'T');
        System.out.println(((a & 8192) == 8192)?'T':((a & 4096) == 4096)?'2':'L');
        System.out.println(((a & 32768) == 32768)?'5':((a & 16384) == 16384)?'L':'1');
    }
}