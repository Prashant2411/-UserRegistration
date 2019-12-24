import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_ifOnlyFirstLetterCapital_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Bruce");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void whenGivenFirstName_ifFirstLetterSmall_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("bruce");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void whenGivenFirstName_ifMoreThen3Character_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Bruce");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void whenGivenFirstName_ifLessThen3Character_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Br");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void whenGivenLastName_ifFirstLetterCapital_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Wayne");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void whenGivenLastName_ifFirstLetterSmall_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("wayne");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void whenGivenLastName_ifMoreThen3Character_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Wayne");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void whenGivenLastName_ifLessThen3Character_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean valid = userRegistration.isValidName("Wa");
        Assert.assertEquals(false, valid);
    }
}
