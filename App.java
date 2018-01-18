import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hi and Welcom to age informatica!\nEnter your date of birth in format dd/mm/yy including the /s");
		Scanner a = new Scanner(System.in);
		String birthDay = a.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		Date now = Calendar.getInstance().getTime();
		try {
			Date bd = format.parse(birthDay);
			long diff = now.getTime() - bd.getTime();
			long diffSeconds = diff / 1000 % 60;  
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff/(60 * 60 * 1000) % 24;
			long diffDays = diff / (24*60*60*1000L) % 365;
			long diffYears = diff / (365L*24*60*60*1000) ;
			System.out.println(bd.getDate() +"\n"+now.getDate());
			System.out.println("You are:\n"+ diffSeconds + "seconds, "+
			diffMinutes + "minutes, "+ diffHours + "hours, "+ diffDays + "days and "+
					diffYears + "years old! ");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
