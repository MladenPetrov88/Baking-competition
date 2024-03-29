import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bakers = Integer.parseInt(scan.nextLine());

        double totalSum = 0.0;
        int totalSweetsCnt = 0;

        for (int i = 0; i < bakers; i++) {
            String bakerName = scan.nextLine();

            int cookiesCnt = 0;
            int cakesCnt = 0;
            int wafflesCnt = 0;

            String sweetName = scan.nextLine();
            while (!"Stop baking!".equals(sweetName)) {
                int sweetsCnt = Integer.parseInt(scan.nextLine());
                switch (sweetName) {
                    case "cookies":
                        cookiesCnt += sweetsCnt;
                        break;
                    case "cakes":
                        cakesCnt += sweetsCnt;
                        break;
                    case "waffles":
                        wafflesCnt += sweetsCnt;
                        break;
                }
                sweetName = scan.nextLine();
            }
            totalSum += ((cookiesCnt * 1.5) + (cakesCnt * 7.8) + (wafflesCnt * 2.3));
            totalSweetsCnt += (cookiesCnt + cakesCnt + wafflesCnt);
            System.out.println(String.format("%s baked %d cookies, %d cakes and %d waffles.",
                    bakerName, cookiesCnt, cakesCnt, wafflesCnt));
        }
        System.out.println(String.format("All bakery sold: %d", totalSweetsCnt));
        System.out.println(String.format("Total sum for charity: %.2f lv.", totalSum));
    }
}
