package ru.rnikonorov.stringjoiner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author  Roman Nikonorov on 24.06.17.
 * Simple old-style "for" sample
 */
class SampleFor {
    static String processJoin(final Collection<String> stringsToJoin, final String delimiter) {
        final List<String> stringListToJoin = new ArrayList<>(stringsToJoin);
        final StringBuilder resultString = new StringBuilder();
        for(int i=0; i < stringsToJoin.size(); i++) {
            if(i != 0) {
                resultString.append(delimiter).append(stringListToJoin.get(i));
            } else {
                resultString.append(stringListToJoin.get(i));
            }
        }
        return resultString.toString();
    }
}
