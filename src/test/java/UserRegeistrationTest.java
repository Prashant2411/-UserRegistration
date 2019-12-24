import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegeistrationTest {
    @Test
    public void whenGivenFirstName_ifFirstLetterCapital_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValid("Bruce");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void whenGivenFirstName_ifFirstLetterSmall_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValid("bruce");
        Assert.assertEquals(false, valid);
    }
}
