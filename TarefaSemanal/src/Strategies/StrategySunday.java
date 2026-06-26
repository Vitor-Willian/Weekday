package Strategies;
public class StrategySunday implements Strategy {
    
    public void execute(String user, String info, String day){
        System.out.println("USER: " + user);
        System.out.println("DAY: " + day);
        System.out.println("MESSAGE: Planeje-se para a semana que vem {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "LOW";
    }
}
