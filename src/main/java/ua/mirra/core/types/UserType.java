package ua.mirra.core.types;

import lombok.Getter;
import ua.mirra.core.types.enums.BasicEnum;
import ua.mirra.core.types.enums.BasicEnumFunctions;

public enum UserType
	implements BasicEnum {

	CLIENT(1), PSYCHOLOGIST(2);

	@Getter
	private final Integer id;

	UserType(Integer id) {
		this.id = id;
	}

	public static UserType valueOf(Integer id) {
		return
			BasicEnumFunctions.valueOf(UserType.class, id);
	}
}
