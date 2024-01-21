package pl.javastart.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class SmartHomeControllerTest2 {
    //inna opcja tworzenia mocków
    @Mock HumiditySensor humiditySensor;
    @Mock WateringController wateringController;

    private SmartHomeController smartHomeController;

    @BeforeEach
    public void init() {
       // MockitoAnnotations.openMocks(this);          //<<== dodano @ExtendWith() więc można usunąć
        smartHomeController = new SmartHomeController(humiditySensor, wateringController);
    }

    @Test
    public void shouldDisableWatering() {

        //given
        //MockitoAnnotations.openMocks(this);
        Mockito.when(humiditySensor.getHumidity()).thenReturn(50);

        //SmartHomeController smartHomeController = new SmartHomeController(humiditySensor, wateringController);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringController).disableWatering();

    }

    @Test
    public void shouldEnableWatering() {

        //given
        //MockitoAnnotations.openMocks(this);
        Mockito.when(humiditySensor.getHumidity()).thenReturn(40);

        //SmartHomeController smartHomeController = new SmartHomeController(humiditySensor, wateringController);

        //when
        smartHomeController.enableWateringIfNeeded();

        //then
        Mockito.verify(wateringController).enableWatering();

    }

}