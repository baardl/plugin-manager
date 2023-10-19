package no.baardl.plugins.ingestion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadElementTest {

    //Generate Tests from ReadElement.java
    //Test ReadElement()
    @Test
    void testReadElement() {
        ReadElement readElement = new ReadElement();
        assertEquals(null, readElement.getId());
        assertEquals(null, readElement.getValue());
        assertEquals(null, readElement.getUnit());
        assertEquals(null, readElement.getLastUpdated());
    }

    //Test ReadElement(String id, String value, String unit, Instant lastUpdated)
    @Test
    void testReadElement2() {
        ReadElement readElement = new ReadElement("id", "value", "unit", java.time.Instant.now());
        assertEquals("id", readElement.getId());
        assertEquals("value", readElement.getValue());
        assertEquals("unit", readElement.getUnit());
        assertEquals(java.time.Instant.now(), readElement.getLastUpdated());
    }

    //Test getId()
    @Test
    void testGetId() {
        ReadElement readElement = new ReadElement();
        assertEquals(null, readElement.getId());
    }

    //Test getValue()
    @Test
    void testGetValue() {
        ReadElement readElement = new ReadElement();
        assertEquals(null, readElement.getValue());
    }

    //Test getUnit()
    @Test
    void testGetUnit() {
        ReadElement readElement = new ReadElement();
        assertEquals(null, readElement.getUnit());
    }

    //Test getLastUpdated()
    @Test
    void testGetLastUpdated() {
        ReadElement readElement = new ReadElement();
        assertEquals(null, readElement.getLastUpdated());
    }

    //Test toString()
    @Test
    void testToString() {
        ReadElement readElement = new ReadElement();
        assertEquals("ReadElement{id='null', value='null', unit='null', lastUpdated='null'}", readElement.toString());
    }

}