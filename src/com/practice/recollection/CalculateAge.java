package com.practice.recollection;
import java.time.*;
public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LocalDate dob = LocalDate.of(1999, 03, 04);
	LocalDate curDate =LocalDate.now();
	Period period = Period.between(dob, curDate);
	System.out.printf("Your age is :"+ period.getYears(),period.getMonths());

	}
	
}
