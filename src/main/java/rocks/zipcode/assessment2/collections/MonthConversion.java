package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Map<Integer, String> calendar = new HashMap<Integer, String>();


    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        calendar.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return calendar.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Set<Map.Entry<Integer, String>> entries = calendar.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            if (entry.getValue().equals(monthName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return calendar.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return calendar.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calendar.put(monthNumber, monthName);

    }
}
