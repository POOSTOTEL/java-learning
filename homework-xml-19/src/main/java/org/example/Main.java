package org.example;

public class Main {
    private static final String FILE_PREFIX = "homework-xml-19/src/main/resources/";
    private static final String XML_FILENAME1 = FILE_PREFIX + "xml/task1.xml";
    private static final String XSD_FILENAME1 = FILE_PREFIX + "xsd/mysql-connection1.xsd";
    private static final String XML_FILENAME2 = FILE_PREFIX + "xml/mysql-connection2.xml";
    private static final String XSD_FILENAME2 = FILE_PREFIX + "xsd/mysql-connection2.xsd";

    public static void main(String[] args) {
        System.out.println("PARSING FILE " + XML_FILENAME1);
        //parse xml via DomParser
        XmlParser<Sonnet> domXmlParser = new DomXmlParser();
        Sonnet sonnet = domXmlParser.parse(XML_FILENAME1);
        System.out.println("DOM  parser: " + sonnet);
    }
}