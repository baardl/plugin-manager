package no.baardl.plugins.ingestion;

import java.util.List;
import java.util.Properties;

public interface IngestionService {

    String getName();

    List<ReadElement> readAll(Properties config);
}
