package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentRadioNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        this.currentRadioNumber = currentRadioNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextRadioNumber() {
        if (currentRadioNumber >= 0 & currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
            return;
        }
        if (currentRadioNumber == 9) {
            currentRadioNumber = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 0 & currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevRadioNumber() {
        if (currentRadioNumber > 0 & currentRadioNumber <= 9) {
            currentRadioNumber = currentRadioNumber - 1;
            return;
        }
        if (currentRadioNumber == 0) {
            currentRadioNumber = 9;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0 & currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
    }
}

