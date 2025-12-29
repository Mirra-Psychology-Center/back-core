package ua.mirra.model.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import ua.mirra.core.persistence.entity.PersistenceEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_participants")

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public final class ChatParticipant
	extends PersistenceEntity {

	// TBD: use composite key?

	private UUID chatId;
	private UUID userId;

	@CreatedDate
	private LocalDateTime createdAt;
	@CreatedBy
	private UUID createdBy;
	@LastModifiedDate
	private LocalDateTime updatedAt;
	@LastModifiedBy
	private UUID updatedBy;
}
