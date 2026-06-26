package Strategies;
public class StrategySaturday implements Strategy {
    
    public void execute(String user, String info){
        System.out.println("USER: " + user);
        System.out.println("MESSAGE: Realize estudo livre ou descanso {" + info + "}");
        System.out.println("PRIORITY: " + getPriority() + "\n");
    }

    public String getPriority() {
        return "LOW";
    }
}
