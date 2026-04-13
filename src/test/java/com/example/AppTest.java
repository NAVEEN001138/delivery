package com.example; // MUST MATCH
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(App.isPrime(7)); // It can only see 'App' if packages match
    }
}
