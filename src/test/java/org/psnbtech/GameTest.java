package org.psnbtech;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    //Create game object
    public Game game;

    @BeforeEach
    void setUp(){
        //initialize game object
        game = new Game();
    }

    @Test
    void testGameCreation() {
        //check if game object exists
        assertNotNull(game);
    }

}
