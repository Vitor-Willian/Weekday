package Strategies;
public class StrategySaturday implements Strategy {
    
    public void execute(String user, String info, String day){
        System.out.println("USER: " + user);
        System.out.println("DAY: " + day);
        System.out.println("MESSAGE: Realize estudo livre ou descanso {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "LOW";
    }
}
