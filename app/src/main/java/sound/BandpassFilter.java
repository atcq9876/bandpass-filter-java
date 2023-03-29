package sound;

import java.util.ArrayList;

public class BandpassFilter {
    public int[] filterSoundwaves(int[] soundwaves) {
        int[] filteredSoundwaves = new int[soundwaves.length];
        for (int i = 0; i < soundwaves.length; i++) {
            if (soundwaves[i] < 40) {
                filteredSoundwaves[i] = 40;
            } else if (soundwaves[i] > 1000) {
                filteredSoundwaves[i] = 1000;
            } else {
                filteredSoundwaves[i] = soundwaves[i];
            }
        }
        return filteredSoundwaves;
        
        // if (soundwaves[0] < 40) {
        //     int[] soundwave = { 40 };
        //     return soundwave;
        // } else if (soundwaves[0] > 1000) {
        //     int[] soundwave = { 1000 };
        //     return soundwave;
        // } else {       
        //     return soundwaves;
        // }
    }
}
