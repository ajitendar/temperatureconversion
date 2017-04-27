package com.niit.temperatureconversion;

public class TempConversion {
	public static double farenheitTocelsius(double farenheit)
	{
		return(farenheit-32)*5/9;
	}
	public static double CelsiusTofarenheit(double celsius)
	{
		return(celsius*9/5)+32;
	}

}
