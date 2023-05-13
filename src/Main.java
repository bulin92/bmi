public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMetres = 1.87;
        int weightInKg = 98;
        int bmi = service.calculate(heightInMetres, weightInKg);
        System.out.println(bmi);
    }
}