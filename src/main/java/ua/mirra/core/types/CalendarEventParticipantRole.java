package ua.mirra.core.types;

import lombok.Getter;
import ua.mirra.core.types.enums.BasicEnum;
import ua.mirra.core.types.enums.BasicEnumFunctions;

public enum CalendarEventParticipantRole
	implements BasicEnum {

	INVITED(1),
	OWNER(2);

	@Getter
	private final Integer id;

	CalendarEventParticipantRole(Integer id) {
		this.id = id;
	}

	public static CalendarEventParticipantRole valueOf(Integer id) {
		return
			BasicEnumFunctions.valueOf(
				CalendarEventParticipantRole.class,
				id
			);
	}
}
