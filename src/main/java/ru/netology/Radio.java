package ru.netology;

public class Radio {

    public int firstStation = 0;
    public int lastStation = 9;
    public int numberOfStations = 10;

    public int currentRadioStationNumber = firstStation;

    public int firstVolume = 0;
    public int lastVolume = 99;
    public int currentVolume;

    public int getNumberOfStations() {
        return numberOfStations;
    }


    public Radio() {
        this.numberOfStations = getNumberOfStations();

    }

    public Radio(int size) {
        this.numberOfStations = size;
    }


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < firstStation) {
            return;
        }
        if (newCurrentRadioStationNumber > lastStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int nextStation() {
        if (currentRadioStationNumber < lastStation) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else currentRadioStationNumber = firstStation;
        return currentRadioStationNumber;
    }

    public int prevStation() {
        if (currentRadioStationNumber > firstStation) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else currentRadioStationNumber = lastStation;
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < firstVolume) {
            return;
        }
        if (newCurrentVolume > lastVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int volumeUp() {
        if (currentVolume < lastVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = currentVolume;
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > firstVolume) {
            currentVolume = currentVolume - 1;
        } else currentVolume = currentVolume;
        return currentVolume;
    }
}


