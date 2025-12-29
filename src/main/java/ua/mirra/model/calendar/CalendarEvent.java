package ua.mirra.model.calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mirra.core.persistence.entity.PersistenceEntity;

import java.util.UUID;

@Entity
@Table(name = "calendar_events")

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public final class CalendarEvent
	extends PersistenceEntity {

	// user id
	private UUID ownerId;
	private String title;
	private String description;

}
