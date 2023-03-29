package sound;

public class BandpassFilter {
    public int[] filterSoundwaves(int[] soundwaves) {
        if (soundwaves[0] < 40) {
            int[] soundwave = { 40 };
            return soundwave;
        } else if (soundwaves[0] > 1000) {
            int[] soundwave = { 1000 };
            return soundwave;
        } else {       
            return soundwaves;
        }
    }
}
