package Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeCalculate {
	private static Scanner in;

	public static void main(String args[]) {

		System.out.println(" Enter Period : ");
		in = new Scanner(System.in);
		String period = in.nextLine().trim();
		String[] splitPeriod = period.split(" ");

		System.out.println(" Enter Time  : ");
		String time = in.nextLine().trim();
		String[] trainComTime = new String[Integer.valueOf(time)];
		for (int i = 0; i < trainComTime.length; i++) {
			trainComTime[i] = in.nextLine().trim();
		}

		int totalTimFromBToW = (Integer.parseInt(splitPeriod[1])) + (Integer.parseInt(splitPeriod[2]));
		int totalHourFromBToW = totalTimFromBToW / 60;
		int totalMinuteFromBToW = totalTimFromBToW % 60;
		String tolTime = String.valueOf(totalHourFromBToW) + ":" + String.valueOf(totalMinuteFromBToW);

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

		for (int i = Integer.valueOf(time) - 1; i > 0; i--) {
			String trainCmTime = trainComTime[i].replace(" ", ":");
			Date trainTime = null, bc = null;

			try {
				trainTime = sdf.parse(trainCmTime);
				bc = sdf.parse(tolTime);
				long timeFromBToW = trainTime.getTime() + bc.getTime();
				String arrTime = sdf.format(new Date(timeFromBToW));

				Date startTime = sdf.parse("8:59");
				Date arriveTime = sdf.parse(arrTime);
				long inTime = startTime.getTime() - arriveTime.getTime();
				if (inTime >= 0) {
					Date timeHtoa = sdf.parse("00:" + splitPeriod[0]);
					long timeFormHtoa = trainTime.getTime() - timeHtoa.getTime();
					System.out.println("Earliest Time : " + sdf.format(new Date(timeFormHtoa)));
					break;
				}

			} catch (ParseException e) {
				e.printStackTrace();
			}

		}

	}
}
