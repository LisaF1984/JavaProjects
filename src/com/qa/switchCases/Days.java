package com.qa.switchCases;

public class Days {

	public static String daysOfWeek(String today) {
		switch (today) {
		case "monday":
			System.out.println("mondays suck");
		case "tuesday":
			System.out.println("tuesday is meh");
		case "wednesday":
			System.out.println("wednesday is hump day");
		case "thursday":
			System.out.println("thursday is wine day");
		case "friday":
			System.out.println("friday is end of the week");
		case "saturday":
			System.out.println("saturday is busy day");
		case "sunday":
			System.out.println("sunday is back to work");

		default:
			System.out.println("invalid day");
			break;

		}

		return null;

	}

}
