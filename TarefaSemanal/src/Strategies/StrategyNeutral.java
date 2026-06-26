package Strategies;
public class StrategyNeutral implements Strategy {
    
    public void execute(String user, String info){
        System.out.println("USER: " + user);
        System.out.println("Nenhuma tarefa disponível.");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "NONE";
    }
}
