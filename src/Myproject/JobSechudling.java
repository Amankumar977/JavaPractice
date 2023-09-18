package Myproject;

import java.util.*;

public class JobSechudling {
	char id;
	int deadline, profit;

	public JobSechudling() {
	}

	public JobSechudling(char id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline; 
		this.profit = profit;
	}

	public static void main(String[] args) {
		ArrayList<JobSechudling> arr = new ArrayList<>();
		arr.add(new JobSechudling('1', 5, 55));
		arr.add(new JobSechudling('2', 2, 65));
		arr.add(new JobSechudling('3', 7, 75));
		arr.add(new JobSechudling('4', 3, 60));
		arr.add(new JobSechudling('5', 2, 70));
		arr.add(new JobSechudling('6', 1, 50));
		arr.add(new JobSechudling('7', 4, 85));
		arr.add(new JobSechudling('8', 5, 68));
		arr.add(new JobSechudling('9', 3, 45));
		JobSechudling job = new JobSechudling();
		job.printJobSeq(arr, 7);
	}

	private void printJobSeq(ArrayList<JobSechudling> arr, int maxDeadLine) {
		int n = arr.size();
		Collections.sort(arr, (a,b)->b.profit-a.profit);
		boolean[] result = new boolean [maxDeadLine];
		char jobs[] = new char [maxDeadLine];
		for(int i=0; i<n; i++) {
			for(int j = Math.min(maxDeadLine-1, arr.get(i).deadline-1); j>=0; j--) {
				if(result[j] == false) {
					result[j] = true;
					jobs[j]= arr.get(i).id;
					break; 
				}
			}
		}
		for(char idss:jobs) {
			System.out.print(idss+" ");
		} 
	} 

}
