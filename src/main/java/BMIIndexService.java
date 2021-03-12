public class BMIIndexService {
    float calculate(float weightKg, float heightCm) {
        float bmi = weightKg / ((heightCm * heightCm) / 10000);
        return bmi;
    }
}
