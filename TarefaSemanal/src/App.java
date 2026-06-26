public class App {
    public static void main(String[] args) throws Exception {
        DailyAssigment daily = new DailyAssigment();

        daily.DailyExecute("Marcos", "Projeto de POO");

        String scan = "monday";
        scan = scan.toUpperCase();

        daily.ManualExecute("Marcos", "Atividades Curriculares", scan);

        scan = "TESTE";
        scan = scan.toUpperCase();

        daily.ManualExecute("Marcos", "", scan);
        
    }
}
