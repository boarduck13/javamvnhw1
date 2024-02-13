public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            if (savings >= threshold) {
                vacationMonths++;
                savings = savings - expenses;
                savings = savings /3;
            } else {
                savings += income - expenses;
            }
        }

        return vacationMonths;
    }
}