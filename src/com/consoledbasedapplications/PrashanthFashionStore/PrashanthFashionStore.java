package com.consoledbasedapplications;

import java.util.Scanner;

public class PrashanthFashionStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		String myn = "";

		double sprice = 0;
		double tsprice = 0;
		double pprice = 0;
		double womenDressPrice = 0;
		double womenTopPrice = 0;
		double womenJeansPrice = 0;
		double kidsShirtPrice = 0;
		double kidsTshirtPrice = 0;
		double kidsPantPrice = 0;

		System.out.println("===============================");
		System.out.println("     PrashanthFashionHub      ");
		System.out.println("===============================");
		System.out.println("   Your Style, Your Choice");
		System.out.println("================================");

		do {
			System.out.println("choose category");

			System.out.println("men");
			System.out.println("women");
			System.out.println("kid");
			String catg = sc.next();
			switch (catg) {
			case "men" -> {
				System.out.println("====== Mens Wear =======");
				do {
					System.out.println("Select your product");

					System.out.println("shirt");
					System.out.println("tshirt");
					System.out.println("pant");
					String men = sc.next();
					switch (men) {
					case "shirt" -> {

						System.out.println("Select your shirt size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();
						switch (size) {
						case "s" -> {
							System.out.println("Shirt size is small & Price-599 rs");
							double ssmall = 599;
							sprice += ssmall;
						}
						case "m" -> {
							System.out.println("Shirt size is medium & Price-899 rs");
							double smedium = 899;
							sprice += smedium;
						}
						case "l" -> {
							System.out.println("Shirt size is large & Price-999 rs");
							double slarge = 999;
							sprice += slarge;
						}
						case "xl" -> {
							System.out.println("Shirt size is extra large & Price-1599 rs");
							double sxl = 1599;
							sprice += sxl;
						}
						default -> System.out.println("Enter size is not available");
						}

					}
					case "tshirt" -> {
						System.out.println("Select your T-Shirt size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();

						switch (size) {

						case "s" -> {
							System.out.println("T-Shirt size is Small & Price - 399 rs");
							tsprice += 399;
						}

						case "m" -> {
							System.out.println("T-Shirt size is Medium & Price - 499 rs");
							tsprice += 499;
						}

						case "l" -> {
							System.out.println("T-Shirt size is Large & Price - 599 rs");
							tsprice += 599;
						}

						case "xl" -> {
							System.out.println("T-Shirt size is Extra Large & Price - 699 rs");
							tsprice += 699;
						}

						default -> System.out.println("Entered size is not available");
						}
					}
					case "pant" -> {
						System.out.println("Select your Pant size:");
						System.out.println("28");
						System.out.println("30");
						System.out.println("32");
						System.out.println("34");

						int size = sc.nextInt();

						switch (size) {

						case 28 -> {
							System.out.println("Pant size is 28 & Price - 799 rs");
							pprice += 799;
						}

						case 30 -> {
							System.out.println("Pant size is 30 & Price - 799 rs");
							pprice += 799;
						}

						case 32 -> {
							System.out.println("Pant size is 32 & Price - 799 rs");
							pprice += 799;
						}

						case 34 -> {
							System.out.println("Pant size is 34 & Price - 799 rs");
							pprice += 799;
						}

						default -> System.out.println("Entered size is not available");
						}

					}
					default -> System.out.println("Enter product is not availble");
					}
					System.out.println("Do you want to continue with mens wear if Yes click Y or no click N");
					myn = sc.next();
				} while (myn.equalsIgnoreCase("y"));

			}
			case "women" -> {

				System.out.println("========== WOMENS WEAR ==========");

				String womenContinue = "";

				do {
					System.out.println("Select Product:");
					System.out.println("1. Dress");
					System.out.println("2. Top");
					System.out.println("3. Jeans");

					String product = sc.next();

					switch (product) {

					case "dress" -> {

						System.out.println("Select Dress Size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();

						switch (size) {

						case "s" -> {
							System.out.println("Dress Size Small & Price - 799 rs");
							womenDressPrice += 799;
						}

						case "m" -> {
							System.out.println("Dress Size Medium & Price - 899 rs");
							womenDressPrice += 899;
						}

						case "l" -> {
							System.out.println("Dress Size Large & Price - 999 rs");
							womenDressPrice += 999;
						}

						case "xl" -> {
							System.out.println("Dress Size Extra Large & Price - 1099 rs");
							womenDressPrice += 1099;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					case "top" -> {

						System.out.println("Select Top Size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();

						switch (size) {

						case "s" -> {
							System.out.println("Top Size Small & Price - 499 rs");
							womenTopPrice += 499;
						}

						case "m" -> {
							System.out.println("Top Size Medium & Price - 599 rs");
							womenTopPrice += 599;
						}

						case "l" -> {
							System.out.println("Top Size Large & Price - 699 rs");
							womenTopPrice += 699;
						}

						case "xl" -> {
							System.out.println("Top Size Extra Large & Price - 799 rs");
							womenTopPrice += 799;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					case "jeans" -> {

						System.out.println("Select Jeans Size:");
						System.out.println("28");
						System.out.println("30");
						System.out.println("32");
						System.out.println("34");

						int size = sc.nextInt();

						switch (size) {

						case 28 -> {
							System.out.println("Jeans Size 28 & Price - 899 rs");
							womenJeansPrice += 899;
						}

						case 30 -> {
							System.out.println("Jeans Size 30 & Price - 999 rs");
							womenJeansPrice += 999;
						}

						case 32 -> {
							System.out.println("Jeans Size 32 & Price - 1099 rs");
							womenJeansPrice += 1099;
						}

						case 34 -> {
							System.out.println("Jeans Size 34 & Price - 1199 rs");
							womenJeansPrice += 1199;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					default -> System.out.println("Entered Product is not available");
					}

					System.out.println("Do you want to continue with womens wear if Yes click Y or no click N");

					womenContinue = sc.next();

				} while (womenContinue.equalsIgnoreCase("y"));

				System.out.println("Exit From Women's Wear");
			}
			case "kid" -> {

				System.out.println("========== KIDS WEAR ==========");

				String kidsContinue = "";

				do {
					System.out.println("Select Product:");
					System.out.println("Shirt");
					System.out.println("T-Shirt");
					System.out.println("Pant");

					String product = sc.next();

					switch (product) {

					case "shirt" -> {

						System.out.println("Select Kids Shirt Size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();

						switch (size) {

						case "s" -> {
							System.out.println("Kids Shirt Small & Price - 399 rs");
							kidsShirtPrice += 399;
						}

						case "m" -> {
							System.out.println("Kids Shirt Medium & Price - 449 rs");
							kidsShirtPrice += 449;
						}

						case "l" -> {
							System.out.println("Kids Shirt Large & Price - 499 rs");
							kidsShirtPrice += 499;
						}

						case "xl" -> {
							System.out.println("Kids Shirt Extra Large & Price - 549 rs");
							kidsShirtPrice += 549;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					case "tshirt" -> {

						System.out.println("Select Kids T-Shirt Size:");
						System.out.println("s - Small");
						System.out.println("m - Medium");
						System.out.println("l - Large");
						System.out.println("xl - Extra Large");

						String size = sc.next();

						switch (size) {

						case "s" -> {
							System.out.println("Kids T-Shirt Small & Price - 299 rs");
							kidsTshirtPrice += 299;
						}

						case "m" -> {
							System.out.println("Kids T-Shirt Medium & Price - 349 rs");
							kidsTshirtPrice += 349;
						}

						case "l" -> {
							System.out.println("Kids T-Shirt Large & Price - 399 rs");
							kidsTshirtPrice += 399;
						}

						case "xl" -> {
							System.out.println("Kids T-Shirt Extra Large & Price - 449 rs");
							kidsTshirtPrice += 449;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					case "pant" -> {

						System.out.println("Select Kids Pant Size:");
						System.out.println("28");
						System.out.println("30");
						System.out.println("32");
						System.out.println("34");

						int size = sc.nextInt();

						switch (size) {

						case 28 -> {
							System.out.println("Kids Pant Size 28 & Price - 499 rs");
							kidsPantPrice += 499;
						}

						case 30 -> {
							System.out.println("Kids Pant Size 30 & Price - 549 rs");
							kidsPantPrice += 549;
						}

						case 32 -> {
							System.out.println("Kids Pant Size 32 & Price - 599 rs");
							kidsPantPrice += 599;
						}

						case 34 -> {
							System.out.println("Kids Pant Size 34 & Price - 649 rs");
							kidsPantPrice += 649;
						}

						default -> System.out.println("Entered Size is not available");
						}
					}

					default -> System.out.println("Entered Product is not available");
					}

					System.out.println("Do you want to continue with kids wear if Yes click Y or no click N");

					kidsContinue = sc.next();

				} while (kidsContinue.equalsIgnoreCase("y"));

				System.out.println("Exit From Kids Wear");
			}

			default -> {
				System.out.println("Enter category is not Available");
			}
			}

			System.out.println("Do you want to continue with category if Yes click Y or no click N");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("==============================");
		System.out.println("     Prashanth Fashion Hub     ");
		System.out.println("==============================");
		if (sprice > 0) {
			System.out.println("Men's Shirt     : " + sprice + " rs");
		}
		if (tsprice > 0) {
			System.out.println("Men's T-Shirt   : " + tsprice + " rs");
		}

		if (pprice > 0) {
			System.out.println("Men's Pant      : " + pprice + " rs");
		}

		System.out.println("------------------------------");

		if (womenDressPrice > 0) {
			System.out.println("Women's Dress   : " + womenDressPrice + " rs");
		}
		if (womenTopPrice > 0) {
			System.out.println("Women's Top     : " + womenTopPrice + " rs");
		}
		if (womenJeansPrice > 0) {
			System.out.println("Women's Jeans   : " + womenJeansPrice + " rs");
		}

		System.out.println("------------------------------");

		if (kidsShirtPrice > 0) {
			System.out.println("Kids Shirt      : " + kidsShirtPrice + " rs");
		}
		if (kidsTshirtPrice > 0) {
			System.out.println("Kids T-Shirt    : " + kidsTshirtPrice + " rs");
		}
		if (kidsPantPrice > 0) {
			System.out.println("Kids Pant       : " + kidsPantPrice + " rs");
		}

		double totalPrice = sprice + tsprice + pprice + womenDressPrice + womenTopPrice + womenJeansPrice
				+ kidsShirtPrice + kidsTshirtPrice + kidsPantPrice;

		double gst = totalPrice * 18 / 100;

		double finalAmount = totalPrice + gst;

		System.out.println("------------------------------");
		System.out.println("Subtotal        : " + totalPrice + " rs");
		System.out.println("GST (18%)       : " + gst + " rs");
		System.out.println("Final Amount    : " + finalAmount + " rs");
		System.out.println("==============================");
		System.out.println("     Thank You For Shopping");
		System.out.println("==============================");
	}

}
