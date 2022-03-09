package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio station = new Radio();
    Radio station1 = new Radio(5, 4);
    Radio station2 = new Radio(5, 0);
    Radio volume = new Radio();
    Radio volume1 = new Radio(100);
    Radio volume2 = new Radio(0);

    @Test
    void nextRadioNumber() {

        station.nextRadioNumber();
        int actual2 = station.getCurrentRadioNumber();
        assertEquals(6, actual2);

        station1.nextRadioNumber();
        int actual3 = station1.getCurrentRadioNumber();
        assertEquals(0, actual3);
    }

    @Test
    void prevRadioNumber() {
        station.prevRadioNumber();
        int actual2 = station.getCurrentRadioNumber();
        assertEquals(4, actual2);

        station2.prevRadioNumber();
        int actual4 = station2.getCurrentRadioNumber();
        assertEquals(4, actual4);
    }

    @Test
    void increaseVolume() {
        volume.increaseVolume();
        int actual5 = volume.getCurrentVolume();
        assertEquals(78, actual5);

        volume1.increaseVolume();
        int actual7 = volume1.getCurrentVolume();
        assertEquals(100, actual7);
    }

    @Test
    void decreaseVolume() {
        volume.decreaseVolume();
        int actual6 = volume.getCurrentVolume();
        assertEquals(76, actual6);

        volume2.decreaseVolume();
        int actual8 = volume2.getCurrentVolume();
        assertEquals(0, actual8);
    }
}