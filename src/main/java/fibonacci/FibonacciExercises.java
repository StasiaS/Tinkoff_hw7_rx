package fibonacci;

import java.util.ArrayList;

import io.reactivex.Observable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FibonacciExercises {

	//TODO: Нужно что-то придумать с if'ами
	public Observable<Integer> fibonacci(int n) {
		if (n == 1) {
			return Observable.just(0);
		} else if (n < 1) {
			Observable.error(new NotImplementedException());
		}
		Integer[] is = new Integer[n];
		is[0] = 0;
		is[1] = 1;
		for (int i = 2; i < n; i++) {
			is[i] = is[i-1] + is[i-2];
		}
		return Observable.fromArray(is);
	}
}
