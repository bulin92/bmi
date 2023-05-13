public class BmiService {
    public int calculate(double heightInMetres, int weightInKg) {
        int bmi = (int) (weightInKg / (heightInMetres * heightInMetres));
        Math.round(bmi);
        return bmi;
    }
}
