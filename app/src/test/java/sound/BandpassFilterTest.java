package sound;

import org.junit.Test;
import static org.junit.Assert.*;

public class BandpassFilterTest {
    @Test public void testInputWithinTheRange() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = { 100 };
        int[] expectedValues = { 100 };
        assertArrayEquals(bandpassFilter.filterSoundwaves(soundwaves), expectedValues);
    }    
}
