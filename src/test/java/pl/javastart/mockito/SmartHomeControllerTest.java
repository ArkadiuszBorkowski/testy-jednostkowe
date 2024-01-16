package pl.javastart.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SmartHomeControllerTest {

    @Test
    public void shouldDisableWatering() {

        //given
        HumiditySensor humiditySensor = Mockito.mock(HumiditySensor.class);
        WateringController wateringController = Mockito.mock(WateringController.class);

        Mockito.when(humiditySensor.getHumidity()).thenReturn(50);

        SmartHomeController smartHomeController = new SmartHomeController(humiditySensor, wateringController);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringController).disableWatering();

    }

}