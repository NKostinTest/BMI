public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double h = 1.87;
        int m = 98;
        double index = service.calculate(m, h);
        System.out.println ((int) index);
    }
}
