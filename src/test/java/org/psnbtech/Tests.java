package org.psnbtech;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.psnbtech.entity.Asteroid;

class Tests {
    //Create random and asteroid object
    Random random = new Random();
    Asteroid test;
    @BeforeEach
    void setUp(){
        //initialize asteroid
        test = new Asteroid(random);
    }

    @Test
    void testGameCreation() {
        //check if Asteroid object exists
        assertNotNull(test);
        
    }

}
