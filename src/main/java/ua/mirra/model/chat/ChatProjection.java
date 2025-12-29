package ua.mirra.model.chat;

import ua.mirra.core.types.ChatType;

import java.time.LocalDateTime;
import java.util.UUID;

public record ChatProjection(
	UUID id,
	ChatType type,
	String lastMessageText,
	LocalDateTime lastMessageDate
) {
}
