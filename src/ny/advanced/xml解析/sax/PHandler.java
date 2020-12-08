package ny.advanced.xml解析.sax;

import ny.base.常用类.myUtil.Out;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @auther: NewYear
 * @Date: 2020-12-08 14:04
 * @version: 0.0.1
 * @description: PHandler
 */
public class PHandler extends DefaultHandler {

    public void startDocument () throws SAXException {
        Out.out("解析文档开始");
    }

    public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException {
        Out.out(qName + "解析开始");
    }

    public void characters (char ch[], int start, int length) throws SAXException {
        String contents = new String(ch,start,length);
        if (contents.length()>0) {
            Out.out("内容为:" + contents);
        }else {
            Out.out("内容为->" + "空");
        }
    }

    public void endElement (String uri, String localName, String qName) throws SAXException {
        Out.out(qName + "解析完成");
    }


    public void endDocument () throws SAXException {
        Out.out("解析文档结束");
    }
}
