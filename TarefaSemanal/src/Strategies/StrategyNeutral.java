package Strategies;
public class StrategyNeutral implements Strategy {
    
    public void execute(String user, String info, String day){
        System.out.println("DIA DA SEMANA INVÁLIDO: ");
    }

    public String getPriority() {
        return "NONE";
    }
}
