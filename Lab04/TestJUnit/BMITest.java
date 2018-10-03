import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {

    @Test
    public void findBMI() {
        //BMI option = new BMI();
        assertEquals("Thieu can", BMI.findBMI(12, 13));
        assertEquals("Binh thuong", BMI.findBMI(12, 13));
        assertEquals("Thua can", BMI.findBMI(12, 13));
        assertEquals("beo phi", BMI.findBMI(12, 13));
        assertEquals("Beo phi", BMI.findBMI(12, 13));
    }
}