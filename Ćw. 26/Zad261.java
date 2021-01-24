public class Zad261 {
    public static void main(String[] args) {
        DrzewoIglaste modrzew = new DrzewoIglaste(true, 432, "abc", 364, 534);
        DrzewoIglaste sosna = new DrzewoIglaste(true, 432, "abc", 364, 534);
        DrzewoLisciaste dab = new DrzewoLisciaste(true, 432, "abc", 23);
        DrzewoLisciaste topola = new DrzewoLisciaste(true, 432, "abc", 23);
        DrzewoOwocowe morelowiec = new DrzewoOwocowe(false, 21552, "yyy", "morela");
        DrzewoOwocowe sliwa = new DrzewoOwocowe(false, 21552, "yyy", "morela");
        Drzewo[] las = {sosna, dab, morelowiec, modrzew, sliwa, topola };

        for (int i = 0; i < las.length; i++) {
            try {
                las[i].zerwijOwoc();
            } catch (DrzewoBezOwocoweExeption e) {
                System.out.println("Błąd");
            }
        }
    }
}