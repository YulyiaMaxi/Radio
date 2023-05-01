
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    public void shouldSetWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave2() {
        Radio radio = new Radio();
        radio.setCurrentWave(7);
        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave3() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);


        int expected = 1;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave4() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);


        int expected = 8;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave5() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);


        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave6() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);


        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);


        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldIncreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldDecreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.nextWave();
        int expected = 1;
        ;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextWave2() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);
        radio.nextWave();
        int expected = 2;
        ;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGetNextWave3() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        radio.nextWave();
        int expected = 9;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextWave4() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.nextWave();
        int expected = 0;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prevWave();
        int expected = 9;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevWave1() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);
        radio.prevWave();
        int expected = 0;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevWave3() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        radio.prevWave();
        int expected = 7;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevWave4() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.prevWave();
        int expected = 8;

        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

}







