package no.baardl.plugins;

import no.baardl.plugins.ingestion.IngestionService;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * Load all implementations of IngestionService and print them out.
 */
public class App {
    public static void main(String[] args) {

        ServiceLoader<IngestionService> serviceLoader = ServiceLoader.load(IngestionService.class);

        Map<String, IngestionService> services = new HashMap<>();
        for (IngestionService service : serviceLoader) {
            System.out.println("I've found a service called '" + service.getName() + "' !");
            services.put(service.getName(), service);
        }

        System.out.println("Found " + services.size() + " services!");
    }
}
