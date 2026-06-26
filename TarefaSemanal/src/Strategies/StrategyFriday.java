package Strategies;
public class StrategyFriday implements Strategy {
    
    public void execute(String user, String info, String day) {
        System.out.println("USER: " + user);
        System.out.println("DAY: " + day);
        System.out.println("MESSAGE: Registre o que foi concluído {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "MEDIUM";
    }
}
