package ua.mirra.model.chat;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.mirra.core.persistence.entity.PersistenceEntity;
import ua.mirra.core.types.ChatType;
import ua.mirra.model.chat.converter.ChatTypeAttributeConverter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chats")

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public final class Chat
	extends PersistenceEntity {

	@Convert(converter = ChatTypeAttributeConverter.class)
	private ChatType type;

	private UUID lastMessageId;
	private LocalDateTime lastMessageTime;

}
