import java.time.LocalDate;

public class Sellers {
    private String name;
    private LocalDate dateBirth;
    private int numOfDeal;
    private double totalSellTon;
    private boolean seniorSell;
    String address;
    Sellers(String name, LocalDate dateBirth, int numOfDeal, double totalSellTon, boolean seniorSell, String address){
        this.name = name;
        this.dateBirth = dateBirth;
        this.numOfDeal = numOfDeal;
        this.totalSellTon = totalSellTon;
        this.seniorSell = seniorSell;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }
}