package ny.advanced.xml解析.sax;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import ny.base.常用类.myUtil.Out;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-12-08 14:04
 * @version: 0.0.1
 * @description: PHandler
 */
public class PHandler extends DefaultHandler {
    private List<Person> persons;
    private Person person;
    private String tag;

    public List<Person> getPersons() {
        return persons;
    }

    /**
     * 开始解析文档
     *      创建一个 对象
     * @throws SAXException
     */
    public void startDocument () throws SAXException {
        persons = new ArrayList<>();
    }

    /**
     * 每个元素开始解析，
     *      解析 左标签
     * @param uri
     * @param localName
     * @param qName     标签的名字
     * @param attributes
     * @throws SAXException
     *
     *
     */
    public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //Out.out(qName + "解析开始");
        if (null != qName) {
            tag = qName; // 存储标签名
            //Out.out("标签tag是：" + tag);
            if (tag.equals("person")) {
                person = new Person();
            }
        }
    }

    public void characters (char ch[], int start, int length) throws SAXException {
        String contents = new String(ch,start,length).trim();
        if(null != tag) {   // 处理了空的问题
            if (tag.equals("name")) {
                person.setName(contents);
            } else if (tag.equals("age")) {
                if (contents.length() > 0) {
                    person.setAge(Integer.valueOf(contents));
                }
            }
        }
    }

    public void endElement (String uri, String localName, String qName) throws SAXException {
        //Out.out(qName + "解析完成");  // TODO: 之后可以用 log4j 改造下日志输出。
        //Out.out("标签tag是：" + tag);
        if (null != qName) {
            if (qName.equals("person")) {
                persons.add(person);
            }
            tag = null; // 处理完闭标签后，丢弃tag。避免保存空内容到 tag 对应的属性，覆盖正确的值。
        }
    }


    public void endDocument () throws SAXException {
        Out.out("解析文档结束");
    }
}
