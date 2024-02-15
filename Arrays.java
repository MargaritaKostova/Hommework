public class Arrays {
    public static void main(String[] args) {
        double[] temperatures = {20, 30, 16, 18};
        double average = averageTemperature(temperatures);
        System.out.println(average);
    }

    public static double averageTemperature(double[] temperature) {
        int size = temperature.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total = total + temperature[i];
        }
        return total / size;

    }
}