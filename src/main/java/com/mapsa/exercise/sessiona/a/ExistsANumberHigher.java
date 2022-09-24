package com.mapsa.exercise.sessiona.a;

import java.util.stream.*;

public class ExistsANumberHigher {
	public static boolean existsHigher(int[] arr, int n) {
		return IntStream.range(0, arr.length - 1).mapToObj(i -> arr[i]).filter(a -> a >= n).count() > 0 ? true : false;
	}
}