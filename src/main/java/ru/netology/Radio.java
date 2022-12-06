package ru.netology;

public class Radio {

    public int currentRadioStationNumber;
    public int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int nextStation() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else currentRadioStationNumber = 0;
        return currentRadioStationNumber;
    }

    public int prevStation() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else currentRadioStationNumber = 9;
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int volumeUp() {
        if (currentVolume < 10) {
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


