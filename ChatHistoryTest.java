import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChatHistoryTest {

	@Test
	void testGetMessageList() {
		ChatHistory archive = new ChatHistory();
		assertTrue(archive.getMessageList() != null);
	}
	
	@Test
	void clearChat() {
		ChatHistory archive = new ChatHistory();
		archive.clearChat();
		assertTrue(archive.messageList[0] == null);
	}

}
