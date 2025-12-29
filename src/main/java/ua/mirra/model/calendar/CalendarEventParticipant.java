package ua.mirra.model.calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mirra.core.persistence.entity.PersistenceEntity;
import ua.mirra.core.types.CalendarEventParticipantRole;

import java.util.UUID;

@Entity
@Table(name = "calendar_event_participants")

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class CalendarEventParticipant
	extends PersistenceEntity {

	private UUID calendarEventId;
	// user id
	private UUID participantId;

	private CalendarEventParticipantRole role;
}
