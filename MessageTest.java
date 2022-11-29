import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageTest {

	@Test
	void testGetters() {
		Message message = new Message("login", "logged in", "Logging in");
		assertTrue(message.getType() != null);
		assertTrue(message.getStatus() != "logged out");
		assertTrue(message.getText() != null);
	}

}
