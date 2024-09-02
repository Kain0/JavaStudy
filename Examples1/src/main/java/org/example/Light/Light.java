package org.example.Light;

public class Light {
    private int lightSpeedPerSec = 186000;

    long getDistance(long days) {
        long seconds = days * 24 * 60 * 60;
        return seconds * lightSpeedPerSec;
    }
}
