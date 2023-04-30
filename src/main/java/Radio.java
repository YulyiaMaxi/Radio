public class Radio {
    private int currentVolume;
    private int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > 9) {
            return;

        }
        this.currentWave = currentWave;
    }


    public int nextWave() {
        if (currentWave != 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
return currentWave;
    }

    public int prevWave() {
        if (currentWave != 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;

        }
return currentWave;
    }

    public int increaseVolume() {
        if (currentVolume != 100) {
            currentVolume ++;
        } else {
            currentVolume = 100;
        }
return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;

    }
return currentVolume;
    }


}

    
    

  