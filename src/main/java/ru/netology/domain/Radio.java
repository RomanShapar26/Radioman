package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;
    private int totalStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }

    public Radio() {}

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > (totalStation - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return volume;
    }

    public int getTotalStation() {
        return totalStation;
    }

    public void nextStation() {

        if (currentStation == (totalStation - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);

    }

    public void previousStation() {

        if (currentStation == 0) {
            setCurrentStation(totalStation - 1);
            return;
        }
        setCurrentStation(--currentStation);

    }


    public void setCurrentVolume(int volume) {
        if (volume < minVolume || volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume -1;
        }
    }
}
