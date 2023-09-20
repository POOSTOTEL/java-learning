package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomXmlParser implements XmlParser {
    public static void main(String[] args) {

    }

    @Override
    public Sonnet parse(String xmlFilename) {
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse(xmlFilename);
            // Получаем корневой элемент
            var root = document.getDocumentElement();
            Sonnet sonnet = new Sonnet();
            sonnet.setType(root.getAttribute("type"));
            // Просматриваем все подэлементы корневого
            NodeList nodes = root.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                switch (node.getNodeName()) {
                    case "author" -> {
                        String lastName = null;
                        String firstName = null;
                        String nationality = null;
                        int yearOfBirth = 0;
                        int yearOfDeath = 0;
                        NodeList authorBioNodes = node.getChildNodes();
                        for (int j = 0; j < authorBioNodes.getLength(); j++) {
                            var authorBioNode = authorBioNodes.item(j);
                            switch (authorBioNode.getNodeName()) {
                                case "lastName" -> {
                                    lastName = authorBioNode.getTextContent();
                                }
                                case "firstName" -> {
                                    firstName = authorBioNode.getTextContent();
                                }
                                case "nationality" -> {
                                    nationality = authorBioNode.getTextContent();
                                }
                                case "yearOfBirth" -> {
                                    yearOfBirth = Integer.parseInt(authorBioNode.getTextContent());
                                }
                                case "yearOfDeath" -> {
                                    yearOfDeath = Integer.parseInt(authorBioNode.getTextContent());
                                }
                            }
                        }
                        if (lastName != null &&
                                firstName != null &&
                                nationality != null &&
                                yearOfBirth != 0 &&
                                yearOfDeath != 0) {
                            sonnet.setAuthor(lastName, firstName, nationality, yearOfBirth, yearOfDeath);
                        }
                    }
                    case "title" -> {
                        String title = node.getTextContent();
                        sonnet.setTitle(title);
                    }
                    case "lines" -> {
                        String line = null;
                        NodeList lineNodes = node.getChildNodes();
                        for (int j = 0; j < lineNodes.getLength(); j++) {
                            var lineNode = lineNodes.item(j);
                            if (lineNode.getNodeName().equals("line")) {
                                line = lineNode.getTextContent();
                            }
                            if (line != null) {
                                sonnet.getLines().add(new String(line));
                            }
                        }
                    }
                }
            }
            return sonnet;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println("Failed: " + ex.getMessage());
            return null;
        }
    }
}
