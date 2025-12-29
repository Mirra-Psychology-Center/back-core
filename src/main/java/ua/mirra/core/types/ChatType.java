package ua.mirra.core.types;

import lombok.Getter;
import ua.mirra.core.types.enums.BasicEnum;
import ua.mirra.core.types.enums.BasicEnumFunctions;

import java.util.Arrays;

public enum ChatType
	implements BasicEnum {
	DIRECT(1),
	GROUP(2);

	@Getter
	private final Integer id;

	ChatType(
		Integer id
	) {
		this.id = id;
	}

	public static ChatType valueOf(Integer id) {
		return
			BasicEnumFunctions.valueOf(ChatType.class, id);
	}
}
