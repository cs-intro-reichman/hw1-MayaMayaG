// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        double precentage = (double)rate/100;
        System.out.println(precentage);
        int years = Integer.parseInt(args[2]);
        double ratePrecentage = Math.pow(1+precentage,years);
        double futureValue = currentValue*ratePrecentage;
        System.out.println("After " + years + " years, a $"
		 + currentValue + " saved at " + (double)rate +"%" + " will yield $" + (int)futureValue);	
		}
}