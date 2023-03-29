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

    @Test public void testInputBelowValidRange() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = { 10 };
        int[] expectedValues = { 40 };
        assertArrayEquals(bandpassFilter.filterSoundwaves(soundwaves), expectedValues);
    }

    @Test public void testInputAboveValidRange() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = { 1100 };
        int[] expectedValues = { 1000 };
        assertArrayEquals(bandpassFilter.filterSoundwaves(soundwaves), expectedValues);
    }

    @Test public void testOneValidAndOneLowNumber() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = { 10, 100 };
        int[] expectedValues = { 40, 100 };
        assertArrayEquals(bandpassFilter.filterSoundwaves(soundwaves), expectedValues);
    }

    @Test public void testOneValidAndOneHighNumber() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = { 1100, 100 };
        int[] expectedValues = { 1000, 100 };
        assertArrayEquals(bandpassFilter.filterSoundwaves(soundwaves), expectedValues);
    }

    @Test public void testThrowsErrorWhenGivenEmptyArray() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = {};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bandpassFilter.filterSoundwaves(soundwaves);
          });
      
          String expectedMessage = "No frequencies have been supplied";
          String actualMessage = exception.getMessage();
      
          assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test public void testThrowsErrorWhenGivenNullData() {
        BandpassFilter bandpassFilter = new BandpassFilter();
        int[] soundwaves = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bandpassFilter.filterSoundwaves(soundwaves);
          });
      
          String expectedMessage = "Input must be an array of integers";
          String actualMessage = exception.getMessage();
      
          assertTrue(actualMessage.contains(expectedMessage));
    }
}
