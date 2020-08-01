package com.atguigu.spring5.testdemo;

import jdk.internal.org.xml.sax.SAXException;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class TestSpring5 {

    @Test
    public void test1() {
        // 从资源文件夹下加载
        Resource resource = new ClassPathResource("bean1.xml");
       // XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("v2/day01.xml"));
        print(resource);
    }

    @Test
    public void test2() {
        // 使用类信息加载
        Resource resource = new ClassPathResource("day01.xml", TestSpring5.class);
        print(resource);

    }

    @Test
    public void test14() throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        // 1、获取InputStream输入流
        InputStream in = new ClassPathResource("bean1.xml").getInputStream();
        // 2、获取DocumentBuilderFactory实例
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 3、获取DocumentBuilder实例
        DocumentBuilder docBuilder = factory.newDocumentBuilder();
        // 4、将docBuilder转换为Document
        Document doc = docBuilder.parse(in);
        // 5、获取节点并循环输出节点值
        Element element = doc.getDocumentElement();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            //System.out.println(node.getNodeName());
            NamedNodeMap attributes = node.getAttributes();
            if (null != attributes) {
                System.out.println(attributes.getNamedItem("id"));
                System.out.println(attributes.getNamedItem("class"));
            }
        }
    }

    // 打印资源文件内容
    public void print(Resource resource) {
        byte[] read = new byte[10000];
        try {
            resource.getInputStream().read(read, 0, read.length);
            System.out.println(new String(read));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
