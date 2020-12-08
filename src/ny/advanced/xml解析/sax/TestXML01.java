package ny.advanced.xml解析.sax;

import ny.base.常用类.myUtil.Out;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

/**
 *
 * 熟悉sax 解析流程
 *
 * @auther: NewYear
 * @Date: 2020-12-08 13:59
 * @version: 0.0.1
 * @description: TestXML01
 */
public class TestXML01 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // SAX解析
        // 1. 获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // 2. 从解析工厂获取解析器
        SAXParser parser = factory.newSAXParser();
        // 3. 加载文档 Document 注册处理器
        // 4. 编写处理器
        PHandler hander = new PHandler();
        parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("ny/advanced/xml解析/sax/p.xml"),hander);

        // 获取数据。
        List<Person> persons = hander.getPersons();
        Out.out(persons.size() + "---> size");
        for (Person p : persons){
            Out.out(p.getName()+"----" + p.getAge());
        }
    }
}
