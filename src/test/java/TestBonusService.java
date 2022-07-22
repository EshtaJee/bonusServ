import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.eshtajee.bonus.service.BonusService;

public class TestBonusService {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void testBonusAccrualIsRegistered(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();

        int actual = (int) service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}