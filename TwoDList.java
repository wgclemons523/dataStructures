import java.util.*;
public class TwoDList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<>();
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		LinkedHashSet<LinkedHashSet<String>> hs = new LinkedHashSet<LinkedHashSet<String>>();
		
		cars.add("TRX");
		cars.add("Demon");
		cars.add("Hell Cat");
		
		Collections.sort(cars);
		
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		//One space allocated for R0
		a.add(new ArrayList<Integer>());
		a.get(0).add(0, 3);
		a.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
		//Adding 366 to a(R1, C0)
		a.get(1).add(0, 366);
		//Adding 576 to a(R1, C4)
		a.get(1).add(4, 576);
		a.add(2, new ArrayList<>(Arrays.asList(20, 7, 188)));
		a.add(new ArrayList<>(Arrays.asList(299, 455, 1)));
		a.add(new ArrayList<>(Arrays.asList(25)));
		System.out.println(a);
		
		hs.add(new LinkedHashSet<String>(Arrays.asList("Ford", "F150", "F250", "F350")));
		hs.add(new LinkedHashSet<String>(Arrays.asList("Chevy", "1500", "2500", "3500")));
		hs.add(new LinkedHashSet<String>(Arrays.asList("Ram", "1500", "2500", "3500")));
		System.out.println(hs);
	}

}
