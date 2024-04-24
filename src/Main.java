public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double heightInmeters = 1.87;
        int weight = 98;
        double index = service.calculate(weight, heightInmeters);
        System.out.println ((int) index);
    }
}
