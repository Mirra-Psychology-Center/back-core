package ua.mirra.model.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mirra.core.persistence.entity.PersistenceEntity;

import java.util.UUID;

@Entity
@Table(name = "chat_participants")

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public final class ChatMessage
	extends PersistenceEntity {

	private UUID chatId;
	private UUID senderId;

	private String content;
	// TBD: message type: SYSTEM, TEXT, ATTACHMENT
	// TBD: attachments

}
