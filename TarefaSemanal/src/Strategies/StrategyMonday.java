package Strategies;
public class StrategyMonday implements Strategy {

    public void execute(String user, String info, String day){

        System.out.println("USER: " + user);
        System.out.println("DAY: " + day);
        System.out.println("MESSAGE: Organize suas prioridades para {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "LOW";
    }
}
