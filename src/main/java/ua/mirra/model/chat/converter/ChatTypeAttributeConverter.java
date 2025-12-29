package ua.mirra.model.chat.converter;

import jakarta.persistence.Converter;
import ua.mirra.core.persistence.entity.AbstractEnumAttributeConverter;
import ua.mirra.core.types.ChatType;

@Converter(autoApply = true)
public class ChatTypeAttributeConverter
	extends AbstractEnumAttributeConverter<ChatType> {

	public ChatTypeAttributeConverter() {
		super(ChatType.class);
	}
}
