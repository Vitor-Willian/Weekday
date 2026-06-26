public class App {
    public static void main(String[] args) throws Exception {
        DailyAssigment daily = new DailyAssigment();

        daily.DailyExecute("Marcos", "Finalizar o projeto de POO");

        String scan = "monday";
        scan = scan.toUpperCase();

        daily.ManualExecute("Marcos", "info", scan);
        
    }
}
