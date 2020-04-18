package yksikkotestaus;
import java.util.*; 
import java.time.*; 
/**
 * Smelly Example #1
 * 
 * https://web.mit.edu/6.005/www/fa16/classes/04-code-review/
 * 
 * Collaboratively authored with contributions from: Saman Amarasinghe, Adam
 * Chlipala, Srini Devadas, Michael Ernst, Max Goldman, John Guttag, Daniel
 * Jackson, Rob Miller, Martin Rinard, and Armando Solar-Lezama.
 * 
 * This work is licensed under CC BY-SA 4.0.
 */
public class DayOfYear {
	
	
    /**
     * Tämä konstruktori on merkitty yksityiseksi, koska luokka on "utility class",
     * eli se sisältää ainoastaan staattisia metodeja. Tästä luokasta ei ole
     * sallittua luoda olioita, vaan metodeja tulee kutsua luokan kautta.
     * 
     * Katso esim:
     * 
     * @see http://www.javapractices.com/topic/TopicAction.do?Id=40
     * @see https://rules.sonarsource.com/java/tag/design/RSPEC-1118
     */
    private DayOfYear() {
    }
    //private IsLeapYear(Year)
    public static int dayOfYear(int month, int dayOfMonth, int year) {
    	if ((month < 0 || month > 12) || (year < 1901 || year > 2099)) {
    		return -1; //If input value is out of range, -1 will be returned. WARNING!!! does not check day of month
    		//throw new IllegalArgumentException("One or more of values are out of range");
    	} 
    	int Jan,Mar,May,Jul,Aug,Oct,Dec ;//initialize number of days in month 
    		Jan=Mar=May=Jul=Aug=Oct=Dec = 31;
    	int Apr,Jun,Sep,Nov;
    		Apr=Jun=Sep=Nov= 30;
    	int Feb = 28;
    	//checking if it's leap year. WARNING!!! his is accurate only between years 1901-2099 
    	Year leap = Year.of(year);
    	if (leap.isLeap() == true) {
    		Feb += 1;//adding leap day to total number of days if it's leap year
    	}
    	int Zero = 0;//Just to make list easier to understand. First value of list will be zero so that months[1] will be Jan. 
    	int[] months = {Zero,Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec};//Make list of months 
    	int days = dayOfMonth;//Separate number of day from input number for calculating purpose 
    	/*if month is something else than January, adding number of days of each month one by one
    	to total number of days until number of months is reached*/
    	if (month > 1) { 
    		int i = 0;  
    		while (i < month) {
    			days += months[i];
				i++;
			}
    	}
    	return days;
    }
}