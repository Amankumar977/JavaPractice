package Greedy;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5};
		int end[] = { 2, 4, 6, 7, 9, 9 };
		selectActivities(start, end);
	}  

	private static void selectActivities(int[] start, int[] end) {
		int n = start.length;
		ArrayList<Integer> selectedActivities = new ArrayList<>();
		int i = 0;
		selectedActivities.add(i);
		for (int j = 1; j < n; j++) {
			if (start[j] >= end[i]) {
				selectedActivities.add(j);
				i = j;
			}
		}
		System.out.println("Maximum set of activities that can be executed:");
		for (int activityIndex : selectedActivities) {
			System.out.print(activityIndex + " ");
		}
	}
}
