package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int size) {
        this.maxStation = size - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 99) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public int volumeUp() {
        if (currentVolume < 99) {
            currentVolume = currentVolume + 1;
        } else currentVolume = currentVolume;
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = currentVolume;
        return currentVolume;
    }
}


