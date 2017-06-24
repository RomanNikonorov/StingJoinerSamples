package ru.rnikonorov.stringjoiner;

import java.util.Collection;
import java.util.StringJoiner;

/**
 * @author  Roman Nikonorov on 24.06.17.
 */
public class SampleStringJoiner {
    static String processJoin (final Collection<String> collectionToJoin, final String delimiter) {

        final StringJoiner joiner = new StringJoiner(delimiter);
        for(final String element : collectionToJoin) {
            joiner.add(element);
        }
        return joiner.toString();
    }
}
