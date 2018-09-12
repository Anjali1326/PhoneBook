//Raymond Adams
//Lab 13
import java.util.Scanner;
public class Matrix {
	double[][] mat;

	
	
	public String toString(){
		String matrix = " ";
		matrix += mat [3][6];
		return matrix;
		
	}
	
	public double getSum(){
		double sum = 0;
		for(int i = 0; i < this.mat.length; i++){
			for(int j = 0; j < this.mat[i].length; j++){
				sum += this.mat[i][j];
			}
			
		}
		return sum;
	}
	
	public double getMean(){
		 double mean;
	
		return mean = getSum() / 18;
	}
	
	public double getMax(){
		double max = 0;
		
		for(int i = 0; i < this.mat.length; i++){
			for(int j = 0; j < this.mat[i].length; j++){
				if (this.mat[i][j] > max){
					max = this.mat[i][j];
				}
				
			}
			}
			
		return max;
	}
	
	public double getRowSum(int i){
	
		double rowSum = 0;
		for( i = 0; i < this.mat.length; i++){
			rowSum += this.mat[1][0];
			
			
		}
		System.out.println("Row 1 sum = " + rowSum);
		return rowSum ;
	}
	
	public double getRowMean(int i){
		double rowMean = 0;
		return rowMean;
	}
	
	public double getRowMax(int i){
		double rowMax = 0;
		return rowMax;
	}
	
	
	
	public static void main (String [] args){
		
		double[][] array1 = {{1.0, 2.0, 3.0, 4.0, 5.0, 6.0}, {2.0, 4.0, 6.0, 8.0, 10.0, 12.0}, {6.0, 7.0, 4.0, 9.0, 8.0, 5.0}};
		
		Scanner keyboard = new Scanner(System.in);
		Matrix object = new Matrix();
		object.mat = array1;
		
		System.out.println("Sum = " + object.getSum());
		System.out.println("Mean = " + object.getMean());
		System.out.println("Max = " + object.getMax());
		System.out.println(object.getRowSum(0));
		//System.out.println("Row 2 Mean = " + object.getRowMean());
		//System.out.println("Row 3 Max = " + object.getRowMax());
		
		
		
		
	}
	
	
	
	
	
	
}
