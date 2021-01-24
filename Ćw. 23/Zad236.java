public class Zad236 {
    public static void main(String[] args) {
        Word w = new Word();
        w.dodajZnak('2');
        w.dodajZnak('0');
        w.dodajZnak('2');
        w.dodajZnak('1');
        w.wyswietl();
        System.out.println(w.len);
    }
}

class Word{
    char[] arr;
    int len;

    public Word(){
        this.arr = new char[100];
        this.len = 0;
    }

    public void dodajZnak(char c){
        int index = 0;
        while(arr[index] != '\u0000'){
            index++;
        }
        arr[index] = c;
        this.len = index+1;
    }

    public void wyswietl(){
        for (int i = 0; i < this.len; i++) {
            System.out.print(arr[i]);
        }
    }

    public int length(){
        return this.len;
    }
}
