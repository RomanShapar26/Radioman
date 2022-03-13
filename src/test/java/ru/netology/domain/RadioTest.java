package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldChangeStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentStation(4);
        radio.previousStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void shouldChangeVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }



}