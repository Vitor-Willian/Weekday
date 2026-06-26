import Strategies.*;
import java.time.*;

public class DailyAssigment {

    FactoryStrat factory = new FactoryStrat();

    public void DailyExecute(String user, String info){
        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();
        factory.getStrategy(day.toString()).execute(user, info);
    }

    public void ManualExecute(String user, String info, String day){
        factory.getStrategy(day.toUpperCase()).execute(user, info);
    }

}
