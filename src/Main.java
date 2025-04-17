public class Main {
    public static void main(String[] args) {
        Sellers seller1 = new Sellers("Vojta", 12, 210, 28.3, true, "Masarykova 18, 754 36 Praha");
        Sellers seller2 = new Sellers("David", 9, 180, 22.65, false, "Školní 25, 251 55 Plzeň");
        displey(seller1);
        displey(seller2);
    }
    static void displey(Sellers seller){
        System.out.println(seller.getName());
    }
}