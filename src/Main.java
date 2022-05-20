public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 10000;
        int miles = service.calculate(ticketCost);
        System.out.println("Количество бонусных Миль: " + miles);
    }
}