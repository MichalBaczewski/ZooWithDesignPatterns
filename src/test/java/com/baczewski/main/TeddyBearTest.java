package com.baczewski.main;

import com.baczewski.main.zoo.Animal;
import com.baczewski.main.zoo.IDontEatException;
import com.baczewski.main.zoo.TeddyBear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {

    @Test
    public void shouldReturnExceptionWhenGetEat() {
        // given
        Animal animal = new TeddyBear();
        // when

        // then
        assertThrows(IDontEatException.class, ()-> animal.eat());
    }

}