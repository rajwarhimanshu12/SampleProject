import java.util.Scanner;

public class Sumfirst100prime {
	
	
	 private static boolean isPrimeNumber(int number){
         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	
	
	
	 public static void main(String args[]){
         
	        int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < 100){
	            if(isPrimeNumber(number)){
	                sum += number;
	                count++;
	            }
	            number++;
	        }
	        System.out.println(sum);
	    }
	     
}	   
		