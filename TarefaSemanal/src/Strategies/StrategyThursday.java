package Strategies;
public class StrategyThursday implements Strategy {
    
    public void execute(String user, String info){
        System.out.println("USER: " + user);
        System.out.println("MESSAGE: Colabore com alguém da equipe {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "HIGH";
    }
}
