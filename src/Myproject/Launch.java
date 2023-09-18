package Myproject;

import java.util.ArrayList;
import java.util.List;

public class Launch {
    public void backtrack(List<List<Integer>> result, List<Integer> perm, int nums[]) {
        if (perm.size() == nums.length) {
            result.add(new ArrayList<>(perm));
        }
        for (int i = 0; i < nums.length; i++) {
            if (perm.contains(nums[i])) {
                continue;
            }
            perm.add(nums[i]);
            backtrack(result, perm, nums);
            perm.remove(perm.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    public static void main(String[] args) {
    	Launch solution = new Launch();
        int[] nums = {1, 2, 3}; // Change this array as needed
        List<List<Integer>> permutations = solution.permute(nums);
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
