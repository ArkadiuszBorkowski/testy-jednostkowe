package pl.javastart.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


class SmartHomeControllerTest {

    @Test
    public void shouldDisableWatering() {

        //given

        HumiditySensor humiditySensor = mock(HumiditySensor.class);
        WateringController wateringController = mock(WateringController.class);

        Mockito.when(humiditySensor.getHumidity()).thenReturn(50);

        SmartHomeController smartHomeController = new SmartHomeController(humiditySensor, wateringController);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringController).disableWatering();

    }

}