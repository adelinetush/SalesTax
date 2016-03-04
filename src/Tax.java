import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Vector;
public class Tax {
	public static boolean endFlag;
	
	public enum Products {
		Exempted,
		Taxable

	}
	
	public enum Origin {
		Local,
		Imported
	}
	
	public static void main (String[] args) {
		endFlag = true;
		int quantity = 0;
		String name = null;
		BigDecimal price = new BigDecimal(20.0);
		boolean imported = false;
		boolean taxable = false;
		
		BigDecimal sellingTax = new BigDecimal(0.1);
		BigDecimal importTax = new BigDecimal(0.05);
		
		System.out.println("Enter Your Items:(Type N to Continue...)");
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			while(endFlag){
				String item= buffer.readLine();	
			
				
				
				
				
				
				
				
				if(item.equals("N")){
					endFlag = false;
				}
			}
			System.out.println("Complete");

			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Tax Taxes = new Tax();
		
	}
	class saleItem{
		public double price;
		public int quantity;
		public String item_name;
		
		public saleItem(double price, int quantity, String name){
			
		}
		
	}
	

}

	
