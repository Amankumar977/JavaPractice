package Myproject;

import java.util.ArrayList;
import java.util.List;

public class GuesserGamePro {
	
	public static void backtrack(List <List <Integer>> result, List<Integer> perm, int nums[]) {
		if(perm.size()== nums.length-1) {
			result.add(new ArrayList<>(perm));
		}
		for(int i=0; i<nums.length; i++) {
			if(perm.contains(nums[i]))
				continue;
			perm.add(nums[i]);
			backtrack(result, perm, nums);
			perm.remove(nums[i]);
		}
	}

	public static void main(String[] args) {
		int nums[]= {1,2,3};
		List <List <Integer>> result = new ArrayList<>();
		backtrack (result, new ArrayList<>(),nums);
		
	}

}
