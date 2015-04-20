package Tut;

public class Tut4 {
	private int [] array;
	private int size;
	class Java{//hw 1
		public void main(String args[]){
			TextIO.putln("Enter array size");
			size = TextIO.getlnInt();
			array = new int [size];
			for (int i = 0;i<size;i++){
				TextIO.putln("Enter array number "+i+1);
				array[i] = TextIO.getlnInt();
			}
			countNegative(array);
		}
		/**
		 * count the number of negative integer in an array
		 * @requires
		 * @modifies 
		 * @effects for each array position i in an array
		 * if array[i]<0
		 * count++
		 * print out total count
		 */
		
		public void countNegative(int[] array){//hw1.a
			int count = 0;
			for(int i=0;i<size;i++){
				if (array[i]<0) count++;
			}
			TextIO.putln("Number or intergers that is negative is"+count);
		}
		
		/**
		 * @requires
		 * @modifies
		 * @effects
		 * min = array[0]
		 * for each array position i(i=1) in an array
		 *	 if array[i]<min 
		 *	 min = array[i]
		 * print min
		 */
		public void min(int []array){//hw1.b
			int min=array[0];
			for (int i=1;i<size;i++){
				if (array[i]<min) min = array[i];
			}
			TextIO.putln("The minimum number in the array is: "+min);
		}
		/**
		 * @requires
		 * @modifies
		 * @effects
		 * for each array position i(i<size) in an array
		 * 		for each array position j(j<i) in an array
		 * 			if a[j]>a[i]
		 * 				return false
		 * 			if a[j]<a[i]
		 * 				return true;
		 * if true 
		 * 		print statement true
		 * else
		 * 		print statement false
		 */
		public void isAscSorted(){//hw1.c
			boolean isTrue;
			for (int i=0;i<size;i++){
				if (array[i]<array[i+1]){
					isTrue = true;
				}else{
					isTrue = false;
					break;
				}
			}
			if (isTrue = true){
				TextIO.putln("The array is in ascending order");
			}else {
				TextIO.putln("The array is not in ascending order");
			}
		}		
		/**
		 * @effects
		 * 		Count the char in a given string
		 * 		count = countChar = 0
		 * 		for each array in the String
		 * 			if array == null
		 * 				break;
		 * 			count++;
		 * 			if array is letter
		 * 				countChar++
		 * 		print count
		 * 		print countChar
		 */
		public void length(){//hw1.d
			TextIO.putln("Enter a string of character");
			String a = TextIO.getln();
			int count=0;
			int countChar=0;
			for(int i=0;i<a.length();i++){
				if (a.charAt(i) == '\u0000'){
					break;
				}
				count++;
				if(Character.isLetter(a.charAt(i))==true){
					countChar++;
				}
			}
			TextIO.putln("The length of array is: "+count);
			TextIO.putln("The length of character is: "+countChar);
		}
		
		public void median(){//hw1.e
			TextIO.putln("Enter array size");
			int size = TextIO.getlnInt();
			double [] array = new double [size];
			double total = 0;
			double min = array[0];
			double x = 0;
			for (int i = 0;i<size;i++){
				TextIO.putln("Enter array number "+i+1);
				array[i] = TextIO.getlnDouble();
				total += array[i];
			}
			double mid = total/size;
			for(int i = 1;i<size;i++){
				if (array[i]<min){
					min = array[i];
				}
			}
			for (int i =0;i<size;i++){
				if (array[i]<mid){
					if(array[i] > min){
						x = array[i];
						min = array[i];
					}
				}
			}
			TextIO.putln("The median is: "+x);
		}
		
		public void compare(){//hw1.f
			
		}
		// 1 12 32 12 1 32 33 43 12
		// 1 1  1  2  2 2  1  1  3
		// 
		public void freg(int []array){//hw1.g - not finnish
			int countDif=0;
			int [] difArray = null;
			for (int i =0;i<array.length;i++){
				boolean loop = false;
				difArray=new int[countDif+1];
				for(int j=0;j<(countDif+1);j++){
					if (array[i]==difArray[j]){
						loop = true;
						break;
					}
				}
				if(loop==false){
				difArray[countDif]=array[i];
				countDif++;
				}
			}
			for (int i=0;i<(countDif+1);i++){
				TextIO.putln(difArray[countDif]);
			}
		}
	}
	
	class Math{//Hw2
	/**
	 * 
	 * @author hai
	 *@effects
	 *divide the array integer with the given divisor using only subtraction
	 *for each array
	 *		remain = array
	 *		result = array/divisor
	 *		for int j = 1  to result
	 *			remain = array - divisor
	 *return remain; 
	 */
		public int[] remainder(int []array, int divisor){//hw2.a
			int []remain= new int[array.length];
			int result;
			for (int i =0;i<array.length;i++){
				remain[i] = array[i];
				result = array[i]/divisor;
				for (int j=1;j<=result;j++){
					remain[i] -= divisor; 
				}
			}
			return remain;
		}
		/**
		 * @effects
		 * divide the array integer with the given divisor using only subtraction 
		 * and addition
		 * for each array
		 * 		division = 0
		 * 		remain = array
		 * 		while (remain > divisor)
		 * 			remain = array - divisor
		 * 			division ++
		 * return division
		 */
		public int[] div(int []array,int divisor){//hw2.b
			int division[] = new int[array.length];
			int remain;
			for (int i =0;i<array.length;i++){
				division[i] = 0;
				remain = array[i];
				while(remain>=divisor){
					remain -= divisor;
					division[i]++;
				}
			}
			return division;
		}
		/**
		 * @effects
		 * determine the middle one of three number
		 * size = array.length
		 * if (size >= 3)
		 * 		block = size/3
		 * 		i =0;
		 * 		for each block
		 * 			sort each 3 array 
		 * 		return mid
		 * else 
		 * 		return mid = null
		 */
		public int[] middle(int[]array){//hw2.c
			int size = array.length;
			int big = size/3;
			int []block = new int[big];
			block = null;
			int mid;
			if(size>=3){
				int i = 0;
				for (int j=0;j<big;i++){
					while (i<i+3){
						int max = array[i];
						for(int q=i;j<i+3;j++){
							if (array[q]>array[i]){
								max = array[q];
							}
						}
						i++;
					}
					mid = array[i];
				}
				return block;
			}
			else{
				return block;
			}
		}		

		public void isPalindrome(String string){//hw2.d
	
		}
		
		public void isPrime(int[] array){//hw2.e
	
		}
	}
	
	public static int menu(){//menu homework
		TextIO.putln("Enter homework number");
		int choice = TextIO.getInt();
		switch(choice){
			case 1:
				return 0;
			case 2:
				return 0;
			case 3:
				return 0;
			case 4:
				return 0;
			default:
				return -1;
		}
	}
	public static void main(String args[]){
		TextIO.putln("Tutorial 4");
		while(menu() != 0){
			menu();
		}
	}
	
}
