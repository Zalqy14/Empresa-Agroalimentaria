public class App {
    public static void main(String[] args) throws Exception {
        Fresco f1 = new Fresco("18 Noviembre", 1, "10 Enero", "Spain");
        Fresco f2 = new Fresco(null, 0, null, null);
        Refigerado r1 = new Refigerado(null, 0, null, null, 0);
        Refigerado r2 = new Refigerado(null, 0, null, null, 0);
        Refigerado r3 = new Refigerado(null, 0, null, null, 0);
        Agua c2 = new Agua(null, 0, null, null, 0, 0);
        Agua c3 = new Agua(null, 0, null, null, 0, 0);
        Aire c4 = new Aire(null, 0, null, null, 0, 0, 0, 0, 0);
        Aire c5 = new Aire(null, 0, null, null, 0, 0, 0, 0, 0);
        Nitrogeno c1 = new Nitrogeno(null, 0, null, null, 0, null, 0);

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
