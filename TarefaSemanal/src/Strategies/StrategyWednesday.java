package Strategies;
public class StrategyWednesday implements Strategy {
    
    public void execute(String user, String info, String day){
        System.out.println("USER: " + user);
        System.out.println("DAY: " + day);
        System.out.println("Revise o andamento das atividades {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "LOW";
    }
}
