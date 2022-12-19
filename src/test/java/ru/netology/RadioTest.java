package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationAboveTheBorder() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationToTheBorder() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationFirstValue() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationLastValue() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBorderValue() {
        Radio station = new Radio();

        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBorderValueEnd() {
        Radio station = new Radio();

        station.setCurrentStation(8);

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);

        station.nextStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationIfNine() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationIfZero() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrev() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentNine() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentSix() {
        Radio station = new Radio();

        station.setCurrentStation(6);

        station.prevStation();

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrevIfCurrentOne() {
        Radio station = new Radio();

        station.setCurrentStation(1);

        station.prevStation();

        int expected = 0;
        int actual = station.getCurrentStation();

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

        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeAboveBorderEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(110);

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

        volume.volumeUp();

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFirstBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.volumeUp();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        volume.volumeUp();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeLastBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        volume.volumeUp();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderValueEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(98);

        volume.volumeUp();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDown() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        volume.volumeDown();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownFirstBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownBorderValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownLastBorder() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        volume.volumeDown();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeDownBorderValueEnd() {
        Radio volume = new Radio();

        volume.setCurrentVolume(98);

        volume.volumeDown();

        int expected = 97;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testConstructor() {
        Radio station = new Radio(6);

        station.setCurrentStation(4);

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(4, station.getCurrentStation());
    }

    @Test
    public void testConstructorOne() {
        Radio station = new Radio(1);

        station.setCurrentStation(0);

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void testConstructorMaxStation() {
        Radio station = new Radio(20);

        station.setCurrentStation(15);

        Assertions.assertEquals(15, station.getCurrentStation());
    }


}
