package sound;

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
    }
}
