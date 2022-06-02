package FileAccess;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileIO {
	
	private int count;
	
	public String[][] getItemTransactions() throws IOException{
		
		String[][] TransactionsTwoDimensionalArray = null;
		String line;
		int countColumn;
		
		
		try {
			TransactionsTwoDimensionalArray = new String[4][32];
			for(int store = 1; store < 5; store++) {
				count = 0;
				BufferedReader store_br = new BufferedReader(new FileReader(String.format("HW1_Transactions_Store%d.csv", store)));
				
				while(store_br.readLine() != null) {
					count++;
				}
				store_br.close();
				
				if(count > 0) {
					BufferedReader store_br2 = new BufferedReader(new FileReader(String.format("HW1_Transactions_Store%d.csv", store)));
					countColumn=0;
					while ((line = store_br2.readLine()) != null) {
					    System.out.println(line);
						TransactionsTwoDimensionalArray[store-1][countColumn++] = line;
						System.out.println("bur");
					}
					
				}	
			}		
			
		} catch(FileNotFoundException exception) {
			System.out.println("file not found"); 
		} catch(IOException exception) {
			System.out.println(exception);
		}
			
		return TransactionsTwoDimensionalArray;
	}
	
	public String[] getItems() {
		String[] items = null;
		String line;
		int countColumn;
		count = 0;
		
		try {
			BufferedReader items_br = new BufferedReader(new FileReader("HW1_Items.csv"));
			while(items_br.readLine() != null) {
				count++;
			}
			items_br.close();
			
			if(count > 0) {
				BufferedReader items_br2 = new BufferedReader(new FileReader("HW1_Items.csv"));
				while((line = items_br2.readLine()) != null) {
					countColumn=0;
				    System.out.println(line);
					TransactionsTwoDimensionalArray[store-1][countColumn++] = line;
				}
			}
			
			
		} catch(FileNotFoundException exception) {
			System.out.println("file not found"); 
		} catch(IOException exception) {
			System.out.println(exception);
		}
		return items; 
	}
	

}
