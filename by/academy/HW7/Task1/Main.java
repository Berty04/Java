package by.academy.HW7.Task1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Long> listLongInitial = Stream.generate(() -> Long.valueOf(new Random().nextInt(101))).limit(100)
				.collect(Collectors.toList());
		System.out.println(listLongInitial);

		List<Double> listDouble = listLongInitial.stream().map(e -> e * Math.PI - 20).collect(Collectors.toList());
		List<Long> listLong = listDouble.stream().map(Double::longValue).collect(Collectors.toList());
		System.out.println(listLong);

		listLong.removeIf(e -> e >= 100);
		System.out.println(listLong);

		Collections.sort(listLong);
		System.out.println(listLong);

		Map<Object, Object> mapFromList = listLong.stream().skip(3).distinct()
				.collect(Collectors.toMap(e -> "Number: " + e, e -> e));
		System.out.println(mapFromList);

		List<Object> listFromMap = mapFromList.keySet().stream().collect(Collectors.toList());
		System.out.println(listFromMap);
	}
}
