package pl.javastart.argumentmatcher;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;


class PasswordCheckerTest {

    @Test
    void shouldRunNotificationService() {
        //given
        InvalidPasswordService invalidPasswordService = Mockito.mock(InvalidPasswordService.class);
        PasswordChecker passwordChecker = new PasswordChecker(invalidPasswordService);

        //when
        passwordChecker.checkPassword("abc");

        //then
        Mockito.verify(invalidPasswordService).notifyAboutInvalidPassword();
    }

    @Test
    void shouldNotRunNotificationService() {
        // given
        InvalidPasswordService invalidPasswordService = Mockito.mock(InvalidPasswordService.class);
        PasswordChecker mockitoVerifyExample = new PasswordChecker(invalidPasswordService);

        // when
        mockitoVerifyExample.checkPassword("A123B32");

        // then
        verify(invalidPasswordService, never()).notifyAboutInvalidPassword();
    }

}