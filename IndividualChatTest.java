import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndividualChatTest {

	@Test
	void testSetMessage() {
		IndividualChat chat = new IndividualChat();
		chat.setMessage();
		chat.getNotification();
		chat.getMessage();
	}

}
