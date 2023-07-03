package discount;

import java.util.Calendar;

public class BlackFridayStrategy implements IDiscountStrategy {

    public double execute(int quantity) {
        Calendar calendar = Calendar.getInstance();
        boolean isFriday = calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
        return isFriday ? 0.8 : 1;
    }
}
