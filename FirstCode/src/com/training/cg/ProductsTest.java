package com.training.cg;

public class ProductsTest {
	public static void main(String[] args) {
		Products prd1 = new Products();
		Products prd2 = new Products();
		Products prd3 = new Products();
		Products prd4 = new Products();
		Products prd5 = new Products();
		prd1.setProdId("65784AQWS");
		prd1.setProdName("Sun drop Oil");
		prd1.setProdDesc("High quality Sun Drop Oil! 15 Litres..");
		prd1.setPrice(2800);
		
		prd2.setProdId("25784AMIX");
		prd2.setProdName("Prestige Mixi");
		prd2.setProdDesc("A High quality and efficient mixi.");
		prd2.setPrice(9000);
		
		prd3.setProdId("89784TV");
		prd3.setProdName("Mi Tv");
		prd3.setProdDesc("A Best quality 42 iches");
		prd3.setPrice(26000);
		
		prd4.setProdId("40884AWASMH");
		prd4.setProdName("Washing Machine");
		prd4.setProdDesc("A Good  quality Washing machine with Power saving .");
		prd4.setPrice(42000);
		
		prd5.setProdId("25784AC");
		prd5.setProdName("Air Conditioner");
		prd5.setProdDesc("A High quality Air Conditioner -O General_Japan.");
		prd5.setPrice(68000);
		
		//System.out.println("Enter product name...");
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		if (prd1.getPrice()>65000) {
			System.out.println("Costly Product details are...");
			System.out.println("prdID"+prd1.getProdId());
			System.out.println("prdPrice"+prd1.getPrice());
			System.out.println("prdName"+prd1.getProdName());
			System.out.println("prdDes"+prd1.getProdDesc());	
		}
		else if(prd2.getPrice()>65000) {
			System.out.println("Costly Product details are...");
			System.out.println("prdID"+prd2.getProdId());
			System.out.println("prdPrice"+prd2.getPrice());
			System.out.println("prdName"+prd2.getProdName());
			System.out.println("prdDes"+prd2.getProdDesc());
		}
		else if(prd3.getPrice()>65000) {
			System.out.println("Costly Product details are...");
			System.out.println("prdID"+prd3.getProdId());
			System.out.println("prdPrice"+prd3.getPrice());
			System.out.println("prdName"+prd3.getProdName());
			System.out.println("prdDes"+prd3.getProdDesc());
		}
		else if(prd4.getPrice()>65000) {
			System.out.println("Costly Product details are...");
			System.out.println("prdID"+prd4.getProdId());
			System.out.println("prdPrice"+prd4.getPrice());
			System.out.println("prdName"+prd4.getProdName());
			System.out.println("prdDes"+prd4.getProdDesc());
		}
		else{
			System.out.println("Costly Product details are...");
			System.out.println("prdID   "+prd5.getProdId());
			System.out.println("prdPrice   "+prd5.getPrice());
			System.out.println("prdName   "+prd5.getProdName());
			System.out.println("prdDes   "+prd5.getProdDesc());	
		}
		}
	    
	}

