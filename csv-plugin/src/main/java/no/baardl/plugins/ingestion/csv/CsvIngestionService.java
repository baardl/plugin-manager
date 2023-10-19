package no.baardl.plugins.ingestion.csv;

import no.baardl.plugins.ingestion.IngestionService;
import no.baardl.plugins.ingestion.ReadElement;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CsvIngestionService implements IngestionService {
    @Override
    public String getName() {
        return "CsvIngestionService";
    }

    @Override
    public List<ReadElement> readAll(Properties config) {
        ArrayList<ReadElement> readElements = new ArrayList<>();
        readElements.add(new ReadElement("1", "1", "1", Instant.now()));
        return readElements;
    }
}
