package no.baardl.plugins.ingestion;

import java.time.Instant;

public class ReadElement {

        private String id;
        private String value;
        private String unit;
        private Instant lastUpdated;

        public ReadElement() {
        }

        public ReadElement(String id, String value, String unit, Instant lastUpdated) {
            this.id = id;
            this.value = value;
            this.unit = unit;
            this.lastUpdated = lastUpdated;
        }

        public String getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public String getUnit() {
            return unit;
        }

    public Instant getLastUpdated() {
        return lastUpdated;
    }

    @Override
        public String toString() {
            return "ReadElement{" +
                    "id='" + id + '\'' +
                    ", value='" + value + '\'' +
                    ", unit='" + unit + '\'' +
                    ", lastUpdated='" + lastUpdated + '\'' +
                    '}';
        }
}
