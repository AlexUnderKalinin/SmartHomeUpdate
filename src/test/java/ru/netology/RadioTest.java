package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void setChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentChannelBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void channelUp() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        radio.nextChannel();

        int expected = 5;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void channelAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void channelBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void channelDown() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.prevChannel();

        int expected = 7;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeUp();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.volumeDown();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void volumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(actual, expected);
    }
}
