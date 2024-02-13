import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {
    @Test
    public void testCalculateVacationMonths() {
        VacationService vacationService = new VacationService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expectedVacationMonths = 3;

        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void testCalculateVacationMonthsone() {
        VacationService vacationService = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedVacationMonths = 2;

        int actualVacationMonths = vacationService.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}