class cafe2{
public static void main(String args[])
{
System.out.println("List of different types of Tea Names are :");
		
	String blackTea="BlackTea";
	String MasalaTea="MasalaTea";
	String amruthTea="AmruthTea";
	String greenTea="GreenTea";
	String lemonTea="LemonTea";
	String gingerTea="GingerTea";
	
	String teaNames[] = {"BlackTea","MasalaTea","AmruthTea","GreenTea","LemonTea","GingerTea"};
	
	
	for(String teaName : teaNames)
		{
			System.out.println(teaName);
		}
	
	System.out.println("List of different types of Coffee Names are :");	
	
	String coldCoffee="ColdCoffee";
	String cappuccinoCoffee="CappuccinoCoffee";
	String latteCoffee="LatteCoffee";
	String espressoCoffee="EspressoCoffee";
	String americanoCoffee="AmericanoCoffee";
	String vCoffee="VCoffee";
	
	String coffeeNames[] = {"ColdCoffee","EspressoCoffee","CappuccinoCoffee","LatteCoffee","AmericanoCoffee","VCoffee"};
	
	
	for(String coffeeName : coffeeNames)
		{
			System.out.println(coffeeName);
			
		}
	System.out.println("List of different types of snaks Names are :");
			
	String samosa="Samosa";
	String pakoda="Pakoda";
	String sandwich="Sandwich";
	String frenchFries="FrenchFries";
	String burger="Burger";
	
	String snaksNames[] ={"Samosa","Pakoda","Sandwich","FrenchFries","Burger"};
	
	
	for(String snaksName : snaksNames )
		{
			System.out.println(snaksName);
		}
	}
}