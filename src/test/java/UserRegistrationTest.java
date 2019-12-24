import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_ifOnlyFirstLetterCapital_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidName("Bruce"));
    }

    @Test
    public void whenGivenFirstName_ifFirstLetterSmall_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidName("bruce"));
    }

    @Test
    public void whenGivenFirstName_ifMoreThen3Character_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidName("Bruce"));
    }

    @Test
    public void whenGivenFirstName_ifLessThen3Character_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidName("Br"));
    }

    @Test
    public void whenGivenLastName_ifFirstLetterCapital_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidName("Wayne"));
    }

    @Test
    public void whenGivenLastName_ifFirstLetterSmall_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidName("wayne"));
    }

    @Test
    public void whenGivenLastName_ifMoreThen3Character_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidName("Wayne"));
    }

    @Test
    public void whenGivenLastName_ifLessThen3Character_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidName("Wa"));
    }

    @Test
    public void whenGivenEmail_ifValid_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidEmail("abc-abc@gmail.com.com"));
    }

    @Test
    public void whenGivenEmail_ifInvalid_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidEmail("abc-abc.@gmail.com.com"));
    }

    @Test
    public void whenGivenMobileNumber_ifStartWithCountryCodeAnd10InLength_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.isValidMobile("+121 7283940583"));
    }
    @Test
    public void whenGivenMobileNumber_ifNotStartWithCountryCodeOrNot10InLength_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.isValidMobile("7283940583"));
    }
}
