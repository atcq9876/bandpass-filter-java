package sound;

public class BandpassFilter {
    public int[] filterSoundwaves(int[] soundwaves) {
        if (soundwaves[0] < 40) {
            int[] soundwave = { 40 };
            return soundwave;
        }
        
        return soundwaves;
    }
}
