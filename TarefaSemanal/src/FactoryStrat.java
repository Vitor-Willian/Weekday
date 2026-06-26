import Strategies.*;
import java.util.HashMap;

public class FactoryStrat {
    private HashMap<String, Strategy> strategies;

    public FactoryStrat() {
        strategies = new HashMap<>();
        strategies.put("MONDAY", new StrategyMonday());
        strategies.put("TUESDAY", new StrategyTuesday());
        strategies.put("WEDNESDAY", new StrategyWednesday());
        strategies.put("THURSDAY", new StrategyThursday());
        strategies.put("FRIDAY", new StrategyFriday());
        strategies.put("SATURDAY", new StrategySaturday());
        strategies.put("SUNDAY", new StrategySunday());
    }

    public Strategy getStrategy(String day) {
        Strategy s = strategies.get(day);
        
        if (s == null) {
            return new StrategyNeutral();
        }
        return s;
    }
    
}
