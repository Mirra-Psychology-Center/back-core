package ua.mirra.model.calendar.converter;

import jakarta.persistence.Converter;
import ua.mirra.core.persistence.entity.AbstractEnumAttributeConverter;
import ua.mirra.core.types.CalendarEventParticipantRole;

@Converter(autoApply = true)
public class CalendarEventParticipantRoleAttributeConverter
	extends AbstractEnumAttributeConverter<CalendarEventParticipantRole> {

	public CalendarEventParticipantRoleAttributeConverter() {
		super(CalendarEventParticipantRole.class);
	}
}
