package org.example;

public interface XmlParser<T> {
    T parse(String xmlFilename);
}
