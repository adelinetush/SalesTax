import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Tax {
	public static boolean endFlag;

	public static ArrayList<saleItem> list = new ArrayList<saleItem>();
	static String[] type = { "Book", "Food", "Medical Product" };

	public static void main(String[] args) {
		endFlag = true;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			while (endFlag) {
				System.out.println("Enter Your Items:(Type N to Continue...)");
				String item = buffer.readLine();
				saleItem sale = new saleItem(Double.parseDouble(item
						.split(" at")[1]),
						Integer.parseInt(item.split(" ")[0]),
						item.split(" at")[0].replace("1 ", ""));
				for (String s : type) {
					System.out.println("Is this Item a " + s + "(Y/N)");
					String response = buffer.readLine();
					if (response.equals("Y")) {
						sale.type = s;
						break;
					}

				}
				list.add(sale);
				System.out.println("Are There More Items[Y/N]");
				item = buffer.readLine();
				if (item.equals("N")) {
					endFlag = false;
				}
			}
			double salesTaxes = 0F;
			double total = 0F;
			for (saleItem l : list) {
				l.TaxItem();
				System.out.println(l.quantity + " " + l.item_name + " "
						+ round(l.total,2));
				salesTaxes += round(l.taxValue,2);
				total += round(l.total,2);
			}
			System.out.println("Sales Taxes:" + salesTaxes);
			System.out.println("Total: :" + total);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Tax Taxes = new Tax();

	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

}
