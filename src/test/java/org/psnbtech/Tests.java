package org.psnbtech;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.psnbtech.entity.Asteroid;

class Tests {
    //create random and asteroid object
    Random random = new Random();
    Asteroid test;
    //setup
    @BeforeEach
    void setUp(){
        //initialize asteroid
        test = new Asteroid(random);
    }
    //build test
    @Test
    void testGameCreation() {
        //check if size in asteroid is not null
        assertNotNull(test.size);
        
    }

}
