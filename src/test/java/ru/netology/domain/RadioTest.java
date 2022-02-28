package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioNumber.csv")
    public void nextRadioNumber(int current, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(current);

        radio.nextRadioNumber();

        int actual = radio.getCurrentRadioNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioNumber.csv")
    public void prevRadioNumber(int current, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(current);

        radio.prevRadioNumber();

        int actual = radio.getCurrentRadioNumber();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolume.csv")
    public void increaseVolume(int current, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(current);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolume.csv")
    public void decreaseVolume(int current, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(current);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}