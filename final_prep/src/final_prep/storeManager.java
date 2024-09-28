package final_prep;
import java.util.ArrayList;
import java.util.Scanner;

public class storeManager {
	public static void main(String[] args) {
		ArrayList<product> pList = new ArrayList<product>();
		pList.add(new product("apple",10.5,1));

		System.out.println(pList.get(0).getName());
	while(true) {
		Scanner scn = new Scanner(System.in);
		System.out.println("input: ");
		String input = scn.nextLine();
		switch (input) {
		case "1":
			System.out.println("name: ");
			String name = scn.nextLine();
			System.out.println("price: ");
			Double price= scn.nextDouble();
			System.out.println("quant: ");
			int quant = scn.nextInt();
			scn.nextLine();
			pList.add(new product(name,price,quant));
			System.out.println("Your new item: \n" + pList.get(pList.size()-1).getName() + pList.get(pList.size()-1).getPrice() + pList.get(pList.size()-1).getQuantity());
			break;
		case"2":
			System.out.println("item index: ");
			int index = scn.nextInt();
			scn.nextLine();
			System.out.println("What would you like to edit?");
			String choice = scn.nextLine();
			switch(choice) {
			case"name":
				String oldName = pList.get(index).getName();
				System.out.println("New Name: ");
				String name1 = scn.nextLine();
				pList.get(index).setName(name1);
				System.out.println("changed from " + oldName+ " to "+pList.get(index).getName());
				break;
			}
		}
	}
	}
	public product[] ViewAll(int quantity) {
		product[] ans;
		for
	}
}

