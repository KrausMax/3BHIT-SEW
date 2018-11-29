import Zug.Train;

public class Test {
    public static void main(String[] args) {
        Timetable Zugfahrplan = new Timetable();

        Train zug1 = new Train("Westbahn");
        zug1.addStop("Wien", 8, 50, 3);
        zug1.addStop("Linz", 10, 30, 2);
        zug1.addStop("Wels", 10, 45, 3);
        zug1.addStop("Salzburg", 12, 00, 5);

        Train zug2 = new Train("Railjet");
        zug2.addStop("Wien", 15, 30, 7);
        zug2.addStop("Linz", 16, 50, 4);
        zug2.addStop("Attnang", 17, 20, 1);
        zug2.addStop("Gmunden", 18, 00, 3);

        Train zug3 = new Train("Transalpin");
        zug3.addStop("Wien", 9, 10, 8);
        zug3.addStop("St. Pölten", 10, 10, 2);
        zug3.addStop("Amstetten", 10, 45, 3);
        zug3.addStop("Leoben", 11, 25, 5);


        Zugfahrplan.getZugfahrplan().add(0, zug1);
        Zugfahrplan.getZugfahrplan().add(1, zug2);
        Zugfahrplan.getZugfahrplan().add(2, zug3);

        System.out.println(Zugfahrplan);
    }
}
