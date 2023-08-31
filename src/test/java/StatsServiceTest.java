import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSumSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.findAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMaxSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMinSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMinAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.findMinAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.findMaxAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }
}


