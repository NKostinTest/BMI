public class BmiService {
    public int calculate(int weight, double heightInmeters) {
        double index;
        index = (weight / (heightInmeters * heightInmeters));
        return (int) index;
    }
}
