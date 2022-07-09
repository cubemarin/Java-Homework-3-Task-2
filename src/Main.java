public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60; // вес в кг
        double height = 1.7; // рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);

        System.out.println();
        System.out.println("Индекс массы тела человека с весом 73 кг и ростом 1,9 м:");
        System.out.println(service.calculate(73, 1.9));

        System.out.println();
        System.out.println("Индекс массы тела человека с весом 120,3 кг и ростом 1,78 м:");
        System.out.println(service.calculate(120.3, 1.78));
    }
}
