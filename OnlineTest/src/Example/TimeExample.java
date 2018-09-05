package Example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TimeExample {
	public static void main(String[] args) throws Exception {
		ArrayList<String> timestampsList = new ArrayList<String>();
		timestampsList.add("01:00:00");
		timestampsList.add("02:00:00");
		timestampsList.add("03:00:00");
		timestampsList.add("04:00:00");
		timestampsList.add("02:00:00");
		timestampsList.add("04:00:00");

		Date dt0 = new SimpleDateFormat("yyyy-MM-dd").parse("1970-01-01");

		final DateFormat dt = new SimpleDateFormat("HH:mm:ss");
		final Calendar c = Calendar.getInstance();
		c.setTimeInMillis(0);
		for (final String t : timestampsList) {
			c.add(Calendar.MILLISECOND, (int) dt.parse(t).getTime());
			c.add(Calendar.MILLISECOND, (int) -dt0.getTime());
		}

		c.add(Calendar.MILLISECOND, (int) dt0.getTime());

		System.out.println("Test4 : " + new SimpleDateFormat("HH:mm:ss").format(c.getTime()));
	}
}
