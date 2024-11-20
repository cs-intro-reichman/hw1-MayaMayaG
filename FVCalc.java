// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        double precentage = (double)rate/100;
        int years = Integer.parseInt(args[2]);
        double ratePrecentage = Math.pow(1+precentage,years);
        double futureValue = currentValue*ratePrecentage;
        System.out.println("After " + years + " years, a $"
		 + currentValue + " saved at " + rate +"%" + " will yield $" + (int)futureValue);	
		}
}