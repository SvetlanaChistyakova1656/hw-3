// Класс BonusMilesService для рассчета бонусных миль
public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int mileRate = 20;
        int bonusMiles = ticketPrice / mileRate;
        return bonusMiles;
    }
}
