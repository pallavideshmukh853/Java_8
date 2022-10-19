package lambdaquestion7;
//WAP to calculate EMI and print the total number of EMIs for given 
//amount, rate of interest and time duration. (Time can also be like this 12 
//months, 18 months, 24 months etc).
public interface Calculate {
	 public double calculate(double principalamount, 
			 double rate, double time, double emi);
}
