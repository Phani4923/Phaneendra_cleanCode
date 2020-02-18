package epam.clean_code;
public class calculate_SI_CI {
	public double simpleIntrest(double principle,double time,double annualRate)
	{
		double amount=(double)((principle*time*annualRate)/100);
		return amount+principle;
	}
	public double compoundIntrest(double principle,double time,double annualRate)
	{
		double amount=(double)(principle*(Math.pow((1+(annualRate/100)), time)));
		amount=amount-principle;
		return amount;
	}
}
