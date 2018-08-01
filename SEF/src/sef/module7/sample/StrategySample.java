package sef.module7.sample;

public class StrategySample {

	public static void main(String arg[]){
		
		//Use interfaces when declaring identifiers instead of the actual classes
		
		Strategy s1 = new StrategyImplOne(); //interfeiss
		Strategy s2 = new StrategyImplTwo(); //interfeiss
		
		General g = new General("John Doe");
		
		//Instead of creating subclasses of 'General' with different strategies
		//We instead assign different 'strategies' to the General
		g.setStragey(s1); //padod general klasei doto interfeisu ar stratēģiju
		g.executeStrategy(); //
		g.setStragey(s2);
		g.executeStrategy();
		
	}
}
