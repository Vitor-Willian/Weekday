import Strategies.*;
import java.util.HashMap;

public class FactoryStrat {
    private HashMap<String, Strategy> strategies;

    public FactoryStrat() {
        strategies = new HashMap<>();
        strategies.put("Monday", new StrategyMonday());
        strategies.put("Tuesday", new StrategyTuesday());
        strategies.put("Wednesday", new StrategyWednesday());
        strategies.put("Thursday", new StrategyThursday());
        strategies.put("Friday", new StrategyFriday());
        strategies.put("Saturday", new StrategySaturday());
        strategies.put("Sunday", new StrategySunday());
    }

    public Strategy getStrategy(String day) {
        Strategy s = strategies.get(day);
        
        if (s == null) {
            return new StrategyNeutral();
        }
        return s;
    }
    
}
