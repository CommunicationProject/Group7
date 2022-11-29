import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupChatTest {

	@Test
	void testSetMessage() {
		GroupChat group = new GroupChat();
		group.setMessage();
		group.getMessage();
		assertTrue(group.login() == true);
	}

}
