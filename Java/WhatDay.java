import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

    

    public static String run(String birthday_date) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
        */
        String future_dates = "";
        
        for (int i = 2016; i < 2066; i++) {
            boolean isLeapYear = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0));
            boolean skip = false;
            Calendar c = Calendar.getInstance();
            String dateCheck = birthday_date.substring(0, 2) + "/" + birthday_date.substring(3, 5) + "/" + Integer.toString(i); 
            if (birthday_date == "29-02" && !isLeapYear) {
                skip = true;
            }
            String dateToAdd = birthday_date.substring(0, 2) + "-" + birthday_date.substring(3, 5) + "-" + Integer.toString(i); 
            try {
                c.setTime(new SimpleDateFormat("dd/M/yyyy").parse(dateCheck));
            } catch (Exception e) {
                
            }  
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == 1 && !skip) {
                dateToAdd = "Sun" + "-" + Integer.toString(i); 
                future_dates = future_dates + dateToAdd + " ";
            }
            else if(dayOfWeek == 6 && !skip) {
                dateToAdd = "Fri" + "-" + Integer.toString(i); 
                future_dates = future_dates + dateToAdd + " ";
            }
            else if(dayOfWeek == 7 && !skip) {
                dateToAdd = "Sat" + "-" + Integer.toString(i); 
                future_dates = future_dates + dateToAdd + " ";
            }
        }
		
		
		return future_dates;
	}

}
