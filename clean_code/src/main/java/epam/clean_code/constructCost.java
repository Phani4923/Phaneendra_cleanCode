package epam.clean_code;

public class constructCost {

		double calculateCost(int standard,double areaOfHouse,boolean automated)
		{
			double cost=0;
			if(standard==1)
			{
				cost+=(1200*areaOfHouse);
			}
			else if(standard==2)
			{
				cost+=(1500*areaOfHouse);
			}
			else if(standard==3 && !automated)
			{
				cost+=(1800*areaOfHouse);
			}
			else if(standard==3 && automated)
			{
				cost+=(2500*areaOfHouse);
			}		
			return(cost);	
		}
}
