public class App {
    public static void main(String[] args) throws Exception {
        Fresco f1 = new Fresco("18 Noviembre", 1, "10 Enero", "Spain");
        Fresco f2 = new Fresco("1 Enero", 2, "5 Marzo", "France");
        Refigerado r1 = new Refigerado("14 Febrero", 3, "10 Julio", "Mexico", 10);
        Refigerado r2 = new Refigerado("20 Marzo", 4, "15 Enero", "Italy", 5);
        Refigerado r3 = new Refigerado("25 Abril", 5, "20 Febrero", "Germany", 8);
        Agua c2 = new Agua("30 Mayo", 6, "10 Marzo", "Norway", -18, 2.5);
        Agua c3 = new Agua("15 Junio", 7, "5 Abril", "Iceland", -20, 3.2);
        Aire c4 = new Aire("10 Julio", 8, "1 Mayo", "Netherlands", -22, 78.0, 21.0, 0.04, 0.96);
        Aire c5 = new Aire("5 Agosto", 9, "15 Mayo", "Belgium", -25, 80.0, 20.0, 0.03, 0.97);
        Nitrogeno c1 = new Nitrogeno("20 Septiembre", 10, "1 Junio", "Denmark", -196, "Inmersión directa", 45.5);

        System.out.println("*** Empresa Agroalimenticia ***");
        System.out.println(f1);
        System.out.println("");
        System.out.println(f2);
        System.out.println("-----------------------------------");
        System.out.println(r1);
        System.out.println("");
        System.out.println(r2);
        System.out.println("");
        System.out.println(r3);
        System.out.println("-----------------------------------");
        System.out.println(c1);
        System.out.println("");
        System.out.println(c2);
        System.out.println("");
        System.out.println(c3);
        System.out.println("");
        System.out.println(c4);
        System.out.println(c5);
        System.out.println("-----------------------------------");

    }
}
