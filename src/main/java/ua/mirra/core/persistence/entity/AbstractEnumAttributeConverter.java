package ua.mirra.core.persistence.entity;

import jakarta.persistence.AttributeConverter;
import ua.mirra.core.types.enums.BasicEnum;
import ua.mirra.core.types.enums.BasicEnumFunctions;

public class AbstractEnumAttributeConverter<E extends Enum<E> & BasicEnum>
	implements AttributeConverter<E, Integer> {

	private final Class<E> enumClass;

	protected AbstractEnumAttributeConverter(
		Class<E> enumClass
	) {
		this.enumClass = enumClass;
	}

	@Override
	public Integer convertToDatabaseColumn(E e) {
		return e.getId();
	}

	@Override
	public E convertToEntityAttribute(Integer id) {
		return
			BasicEnumFunctions.valueOf(
				enumClass,
				id
			);
	}
}
