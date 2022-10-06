package com.mapsa.exercise.seriesa.l;

import java.util.Arrays;

public class MaximumPossibleTotalJafarian {
	public static int maxTotal(int[] nums) {
		Arrays.sort(nums);
		int sum =0;

		for (int i = nums.length-1; i >=5 ; i--) {
			sum+=nums[i];

		}

		return sum;
		
	}
}