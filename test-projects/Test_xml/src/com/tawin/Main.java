package com.tawin;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
	public static void getChild(Element element){
		for(int i=  0;i < element.getChildNodes().getLength();i++){
			if(element.getChildNodes().item(i).hasChildNodes()){
				getChild((Element)element.getChildNodes().item(i));
			}
		}
	}
	
	public static void displayXML(String file) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File(file));
		
		Element racine = document.getDocumentElement();
		
		for(int i = 0;i < racine.getChildNodes().getLength();i++){
			getChild((Element)racine.getChildNodes().item(i));
		}
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		displayXML("xmltest.xml");
	}
}
