package de.mxro.metrics.examples;

import de.mxro.metrics.PropertyNode;
import de.mxro.metrics.jre.Metrics;

public class ExampleThroughputMeasurement {
    public static void main(final String[] args) throws InterruptedException {

        final PropertyNode m = Metrics.create();

        m.perform(Metrics.happened("process"));
        m.perform(Metrics.happened("process"));
        m.perform(Metrics.happened("process"));
        m.perform(Metrics.happened("process"));
        m.perform(Metrics.happened("process"));

        // m.record(Metrics.happened("process"));
        // m.record(Metrics.happened("process"));
        // m.record(Metrics.happened("process"));
        // m.record(Metrics.happened("process"));
        // m.record(Metrics.happened("process"));

        Thread.sleep(1000);

        m.print();

        m.stop().get();

    }
}
