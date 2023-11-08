package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setCurrentStationRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfterNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);
        int actual = radio.getCurrentVolume();
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOverOneHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 89;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVoluneOverOneHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(88);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 87;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}