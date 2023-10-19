package no.baardl.plugins.ingestion.csv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvIngestionServiceTest {

    //Generate tests for CsvIngestionService.java
    //Test getName()
    @Test
    void testGetName() {
        CsvIngestionService csvIngestionService = new CsvIngestionService();
        assertEquals("CsvIngestionService", csvIngestionService.getName());
    }

    //Test readAll(Properties config)
    @Test
    void testReadAll() {
        CsvIngestionService csvIngestionService = new CsvIngestionService();
        assertEquals(1, csvIngestionService.readAll(new java.util.Properties()).size());
        assertEquals("ReadElement{id='1', value='1', unit='1', lastUpdated='null'}", csvIngestionService.readAll(new java.util.Properties()).get(0).toString());
    }

}