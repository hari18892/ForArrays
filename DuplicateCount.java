package com.CollectionsPack;

public class DuplicateCount {

	    public static void main(String[] args) {
	        int[][] array = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}, {7, 8, 9}};
	        int[][] value = {{2,4,1},{3,2,3},{4,2,1}};
	      // countDuplicates(array);
	        System.out.println("second value");
	        countDuplicates(value);
	    }

	    public static void countDuplicates(int[][] array) {
	        int rows = array.length;
	        int cols = array[0].length;
	        int[] counts = new int[rows * cols]; // Array to store the counts
	        int position = 0; // Variable to store counts position 
	      

	        // Iterate over each element in the array
	        for (int i = 0; i < rows; i++) {
	        	boolean flag = false;
	            for (int j = 0; j < cols; j++) {
	                int currentElement = array[i][j];
	             
	                //Iterate over each element to know in 2D element is repeat or not
	                for(int a=0;a<counts.length;a++) {
	                	if(counts[a]==currentElement) {
	                		flag = true;
	                		break;
	                		}
	                	}
	                	if(flag) 
	                	break;
	                	
	                // Compare current element with the remaining elements
	                for (int x = i; x < rows; x++) {
	                    int start = (x == i) ? j + 1 : 0;

	                    for (int y = start; y < cols; y++) {
	                        if (array[x][y] == currentElement) {
	                            counts[position] = currentElement;
	                            if(position <= rows * cols && position >= 0)
	                            position++;
	                            
	                        }
	                    }
	                }
	            }
	        }

	        int count = 0;
	        
	        // Iterate over each element in the array
	        for (int i = 0; i < position; i++) {
	            // Check if the element is already counted
	            boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (counts[i] == counts[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            // If it's not a duplicate, count its occurrences
	            if (!isDuplicate) {
	                for (int j = i + 1; j < position; j++) {
	                    if (counts[i] == counts[j]) {
	                        count++;
	                    }
	                }
	                System.out.println("Element " + counts[i] + " appears " + (count + 2) + " times.");
	            }
	            count = 0;
	        }
	    }
	}

