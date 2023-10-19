package no.baardl.plugins.ingestion;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SimulatorIngestionService implements IngestionService {
    @Override
    public String getName() {
        return "SimulatorIngestionService";
    }

    @Override
    public List<ReadElement> readAll(Properties config) {
        ArrayList<ReadElement> readElements = new ArrayList<>();
        readElements.add(new ReadElement("1", "1", "1", Instant.now()));
        return readElements;
    }
}
