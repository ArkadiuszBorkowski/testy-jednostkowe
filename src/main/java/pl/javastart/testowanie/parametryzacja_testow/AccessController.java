package pl.javastart.testowanie.parametryzacja_testow;

public class AccessController {
    public boolean checkAccessForSignupStatus(SignupStatus signupStatus) {
        return signupStatus == SignupStatus.PAID;
    }
}
