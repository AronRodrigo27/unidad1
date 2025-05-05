public class ejercicio15 {
    public static void thirtyLeapYears(int startYear) {
        int count = 0;
        while (count < 30) {
            if ((startYear % 4 == 0 && startYear % 100 != 0) || startYear % 400 == 0) {
                System.out.print(startYear + " ");
                count++;
            }
            startYear++;
        }
    }
}
