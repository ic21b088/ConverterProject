package at.fhtw.ConverterProject.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterServiceTest {

    private final ConverterService service = new ConverterService();

    @Test
    void testGetSquare()
    {
        assertEquals(100,service.getSquare(10));
    }

}