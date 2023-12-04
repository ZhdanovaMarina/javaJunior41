package lesson6;

public class ToursUtils {

    // Создадим метод, который будет сохранять один тур в двухмерный массив
    public static void addTour(String country, String city, String transport, String day,
                               String cost, String stars, String food, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] == null) {
                tours[i][0] = (i + 1) + "";
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = day;
                tours[i][5] = cost;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }
        }
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                        tours[i][6], tours[i][7], tours[i][5]);
            }
        }
    }

    public static void printToursByBudget(String[][] tours, int budget) {
        for (int i = 0; i < tours.length; i++) { // проход по каждому туру
            //"210000 руб." - 5я колонка (стринг)
            // int бюджет = 120000; (инт)

            if (tours[i][0] != null) {
                int spaceIndex = tours[i][5].indexOf(" "); // узнали позицию пробела (под каким номером)
                String priceStr = tours[i][5].substring(0, spaceIndex); // вырезали только цену, без руб.
                int priceCurrentTour = Integer.parseInt(priceStr); // преобразовали текстовую цену в числоif

                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;
                if (priceCurrentTour >= minBudget && priceCurrentTour <= maxBudget) { // если вошли в бюджет
                    System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][6], tours[i][7], tours[i][5]);
                }
            }

        }
    }

    public static void printToursByDay(String[][] tours, int day) {
        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] != null) {
                int spaceIndex = tours[i][4].indexOf(" ");
                String priceStr = tours[i][4].substring(0, spaceIndex);
                int priceCurrentTour = Integer.parseInt(priceStr);

                int maxDay = day + 1;
                int minDay = day - 1;
                if (priceCurrentTour >= minDay && priceCurrentTour <= maxDay) {
                    System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][6], tours[i][7], tours[i][5]);

                }
            }
        }
    }
    public static void printToursByCountryAndPrice(String[][] tours, String country, int price) {
        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                int spaceIndex = tours[i][5].indexOf(" ");
                String priceStr = tours[i][5].substring(0, spaceIndex);
                int priceCurrentTour = Integer.parseInt(priceStr);

                int maxPrice = price + 20000;
                int minPrice = price - 20000;
                if (priceCurrentTour >= minPrice && priceCurrentTour <= maxPrice) {
                    System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][6], tours[i][7], tours[i][5]);
                }
            }

        }
    }
    public static void printToursByStarsAndTransport(String[][] tours, String transport, int stars) {
        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] != null && tours[i][3].equalsIgnoreCase(transport)) {
                int spaceIndex = tours[i][6].indexOf(" ");
                String priceStr = tours[i][6].substring(0, spaceIndex);
                int priceCurrentTour = Integer.parseInt(priceStr);

                int maxStars = stars + 1;
                int minStars = stars - 1;
                if (priceCurrentTour >= minStars && priceCurrentTour <= maxStars) {
                    System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][6], tours[i][7], tours[i][5]);
                }
            }

        }
    }


}