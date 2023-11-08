package sampleException;
import java.util.date;
class FridayNotWorking extends Exception{
	public FridayNotWorking(String msg){
		super(msg);
	}
}
public class SampleCustomException{
	
	public static void main(String[] args){
	try{
	Date obj=new Date();
	String str = obj.toString().substring(0,3);
	if(str.equalsIgnoreCase("fri")){
	throw new FridayNotWorkingException("Today is friday system cant be logged in");

	}
	   }
	catch (FridayNotWorkingException e){
	System.out.println(e.getMessage());
	}
		}
	}