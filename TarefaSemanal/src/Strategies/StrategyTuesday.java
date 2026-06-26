package Strategies;
public class StrategyTuesday implements Strategy {
    
    public void execute(String user, String info){

        System.out.println("USER: " + user);
        System.out.println("MESSAGE: Avance nas tarefas pendentes {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "MEDIUM";
    }
}
