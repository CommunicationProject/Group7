import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAccountTest {

	@Test
	void testLoginLogout() {
		UserAccount account = new UserAccount();
		account.login("ethan", "NB1020", null);
		account.logout();
	}

}
