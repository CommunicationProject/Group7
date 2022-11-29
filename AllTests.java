import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AddUserTest.class, ContactListTest.class, MessageTest.class, GroupChatTest.class, UserAccountTest.class, IndividualChatTest.class, ChatHistoryTest.class
})
public class AllTests {
}
