package Greedy;

public class Q3 {
	public static void main(String[] args) {
        int gas[]= {2,3,4};
        int cost []= {3,4,3};
        int result = isPossible(gas, cost);
        System.out.println(result);
	}

	private static int isPossible(int[] gas, int[] cost) {
		int n = gas.length;
		int totalGas=0;
		int totalCost=0;
		int start=0;
		int tank =0;
		for(int i=0; i<n; i++) {
			totalGas += gas[i];
			totalCost += cost[i];
			tank += gas[i]-cost[i];
			if(tank <0) {
				start = i+1;
				tank =0;
			}
		}
		if(totalGas < totalCost) {
			return -1;
		}
		return start; 
	}
}
