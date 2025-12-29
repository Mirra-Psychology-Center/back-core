package ua.mirra.core.types.enums;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BasicEnumFunctions {

	private static final Map<Class<?>, Map<Object, Enum<?>>> CACHE = new ConcurrentHashMap<>();

	@SuppressWarnings("unchecked")
	public static <E extends Enum<E> & BasicEnum>
	E valueOf(
		Class<E> enumClass,
		Integer id
	) {

		Map<Object, Enum<?>> map = CACHE.computeIfAbsent(enumClass, ignored -> buildMap(enumClass));

		E result = (E) map.get(id);
		if (result == null) {
			throw new IllegalArgumentException(
				"Unknown id " + id + " for enum " + enumClass.getSimpleName()
			);
		}
		return result;
	}

	private static <E extends Enum<E> & BasicEnum> Map<Object, Enum<?>> buildMap(Class<E> enumClass) {
		Map<Object, Enum<?>> map = new HashMap<>();
		for (E e : enumClass.getEnumConstants()) {
			map.put(e.getId(), e);
		}
		return Map.copyOf(map);
	}

}
