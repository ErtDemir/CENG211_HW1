package ChainStoreApp;

import java.io.IOException;

import FileAccess.FileIO;

public class ChainStoreApp {
	
	public static void main(String[] args) throws IOException {
		
		FileIO file = new FileIO();
		
		System.out.println(file.getItemTransactions()[0]);
		
	}

}
