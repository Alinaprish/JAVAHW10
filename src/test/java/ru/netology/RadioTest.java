package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationAboveTheBorder() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationToTheBorder() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationFirstValue() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationLastValue() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBorderValue() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBorderValueEnd() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = station.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(8);

        int expected = 9;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationIfNine() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(9);

        int expected = 0;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationIfZero() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(0);

        int expected = 1;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrev() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(0);

        int expected = 9;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentNine() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(9);

        int expected = 8;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentSix() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(6);

        int expected = 5;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentOne() {
        Radio station = new Radio();

        station.setCurrentRadioStationNumber(1);

        int expected = 0;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeBorderEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeAboveBorderEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeBelowBorderLimit() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeBorderValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(6);

        int expected = 7;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFirstBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 1;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 2;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLastBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderValueEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(9);

        int expected = 10;
        int actual = volume.volumeUp();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDown() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 6;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownFirstBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownBorderValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 0;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownLastBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 9;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownBorderValueEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(9);

        int expected = 8;
        int actual = volume.volumeDown();

        Assertions.assertEquals(expected, actual);
    }


}
