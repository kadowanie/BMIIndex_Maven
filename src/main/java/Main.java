public class Main {
    public static void main(String[] args) {
        BMIIndexService service = new BMIIndexService();
        float weightKg = 105;
        float heightCm = 172;
        float bmi = service.calculate(weightKg, heightCm);
        System.out.println(bmi);
    }
}