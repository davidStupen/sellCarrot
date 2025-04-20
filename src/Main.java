import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
                Sellers seller1 = new Sellers("Vojta", LocalDate.of(1997,12,12), 210, 28.3, true, "Masarykova 18, 754 36 Praha");
                Sellers seller2 = new Sellers("David", LocalDate.of(1993,2,16), 180, 22.65, false, "Školní 25, 251 55 Plzeň");
                displey(seller1);
                displey(seller2);
            }
            static void displey(Sellers seller){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                String formatedBirth = seller.getDateBirth().format(formatter);
                System.out.printf("prodejce: %s \nnarozen: %s", seller.getName(), formatedBirth);
                System.out.println();
            }

}