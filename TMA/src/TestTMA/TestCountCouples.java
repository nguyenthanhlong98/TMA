package TestTMA;

import java.util.HashSet;
import java.util.Set;

public class TestCountCouples {

	public static void main(String[] args) {
		int  arr[] = {1, 2, 1, 2, 3, 2, 2, 4, 5, 1, 3};
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();	
		
		for(int i = 0; i < arr.length; i ++) {
			if(set.contains(arr[i])) {
				count ++;
				set.remove(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}
			System.out.println(count);
	}
}
