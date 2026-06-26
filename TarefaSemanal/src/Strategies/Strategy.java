package Strategies;
public interface Strategy {
    void execute(String user, String info, String day);
    String getPriority();
}