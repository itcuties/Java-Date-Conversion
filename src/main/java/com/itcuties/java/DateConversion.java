package com.itcuties.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Converting Date from and to String type.
 * 
 * @author itcuties
 *
 */
public class DateConversion {

	public static void main(String[] args) {
		try {
			// EXAMPLE 1: from String to Date
			System.out.println("EXAMPLE 1: from String to Date"+"\n");
			
			// English language date
			String stringDateEN = "10:00 April 1, 2013";
			String stringDatePL = "10:00 Kwiecieñ 1, 2013";	// Change this to your language and see how it works :)
		
			// Parse the English date
			Date dateEN = new SimpleDateFormat("HH:mm MMMM d, yyyy", Locale.ENGLISH).parse(stringDateEN);
			System.out.println("\t"+"dateEN: " + dateEN);
			
			// Parse your date, system default (in our case PL - polish) - no Locale is provided
			Date datePL = new SimpleDateFormat("HH:mm MMMM d, yyyy").parse(stringDatePL);
			System.out.println("\t"+"datePL: " + datePL);
			
			// Are they the same?
			System.out.println("\t"+"dateEN == datePL " + dateEN.equals(datePL));
			
			
			System.out.println("\n------------------------------------------------------------------------------------------------------\n");
			
			
			// EXAMPLE 2: from Date to String
			System.out.println("EXAMPLE 2: from Date to String"+"\n");
			// Now!
			Date currentDate = new Date();
			
			System.out.println("\t"+"currentDate: " + currentDate);
			System.out.println("\t"+"currentDate: " + new SimpleDateFormat("HH:mm:ss MMMM d, yyyy").format(currentDate));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
	}
	
}
