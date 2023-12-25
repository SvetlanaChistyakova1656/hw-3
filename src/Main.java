// Класс Main с использованием сервиса для расчета бонусных миль
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Количество начисленных миль: " + miles);
    }
}
