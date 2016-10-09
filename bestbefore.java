import java.util.Arrays;
import java.util.Scanner;
public class bestbefore {

public static String earliestValidDate(int[] nums) {
	if (isValidDate(nums[0] , nums[1] , nums[2]))
		return convertYear(nums[0]) + "-" + nums[1] + "-" + nums[2];
	
	if (isValidDate(nums[0] , nums[2] , nums[1]))
		return convertYear(nums[0]) + "-" + nums[2] + "-" + nums[1];
	
	if (isValidDate(nums[1] , nums[0] , nums[2]))
		return convertYear(nums[1]) + "-" + nums[0] + "-" + nums[2];
	
	if (isValidDate(nums[1] , nums[2] , nums[0]))
		return convertYear(nums[1]) + "-" + nums[2] + "-" + nums[0];
	
	if (isValidDate(nums[2] , nums[0] , nums[1]))
		return convertYear(nums[2]) + "-" + nums[0] + "-" + nums[1];
	
	if (isValidDate(nums[2] , nums[1] , nums[0]))
		return convertYear(nums[2]) + "-" + nums[1] + "-" + nums[0];
	
	return "";
}

public static String zeroPadding(String date) {
	if (date.isEmpty())
		return date;
	
	if (date.charAt(6) == '-')
		date = date.substring(0 , 5) + "0" + date.substring(5);
	
	if (date.length() < 10)
		date = date.substring(0 , 8) + "0" + date.substring(8);
	
	return date;
}

public static boolean isLeapYear(int year) {
	if (year % 400 == 0)
		return true;
	if (year % 100 == 0)
		return false;
	if (year % 4 == 0)
		return true;
	
	return false;
}

public static int convertYear(int num) {
	if (num / 100 == 0)
		return 2000 + num;
	
	return num;
}

public static boolean isValidDate(int year , int month , int day) {
	year = convertYear(year);
	
	if (year < 2000 || year > 2999 || month < 1 || month > 12 || day < 1 || day > 31)
		return false;
	
	if (month == 2)
		{
		if (isLeapYear(year))
			return day <= 29;
		else
			return day <= 28;
		}
	
	if (month < 8)
		{
		if (month % 2 == 1)
			return day <= 31;
		else
			return day <= 30;
		}
	
	if (month % 2 == 1)
		return day <= 30;
	else
		return day <= 31;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String date = scan.next();
String[] dates = date.split("/");

int[] nums = new int[3];

for (int i = 0; i < 3; i++)
	nums[i] = Integer.parseInt(dates[i]);

Arrays.sort(nums);

String str = zeroPadding(earliestValidDate(nums));

System.out.println(str.isEmpty() ? date + " is illegal" : str);
scan.close();
	}
}