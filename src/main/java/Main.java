import ru.eshtajee.bonus.service.BonusService;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount = 250;
        boolean registered = false;

        int bonus = (int) service.calculate(amount, registered);
        System.out.println();
        System.out.println("Вам начислено "+bonus +" бонусов");



    }
}

