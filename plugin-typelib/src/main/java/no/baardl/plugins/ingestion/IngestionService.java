package no.baardl.plugins.ingestion;

import java.util.List;
import java.util.Properties;

public interface IngestionService {

    String getName();

    List<no.baardl.plugins.ingestion.ReadElement> readAll(Properties config);
}
