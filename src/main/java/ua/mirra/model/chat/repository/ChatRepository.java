package ua.mirra.model.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.mirra.model.chat.Chat;

import java.util.UUID;

@Repository
public interface ChatRepository
	extends JpaRepository<Chat, UUID> {

}
