package xml;
import java.io.File;  
import java.util.Iterator;  
import java.util.List;  
  
import org.dom4j.Attribute;  
import org.dom4j.Document;  
import org.dom4j.Element;  
import org.dom4j.io.SAXReader;  

public class xmltest {
	public void test() throws Exception{  
        //����SAXReader����  
        SAXReader reader = new SAXReader();  
        //��ȡ�ļ� ת����Document  
        Document document = reader.read(new File("F://rss/rss.xml"));  
        //��ȡ���ڵ�Ԫ�ض���  
        Element root = document.getRootElement();  
        //����  
        listNodes(root);  
    }  
      
    //������ǰ�ڵ��µ����нڵ�  
    public void listNodes(Element node){  
        //���Ȼ�ȡ��ǰ�ڵ���������Խڵ�  
        List<Attribute> list = node.attributes();  
        //�������Խڵ�  
        for(Attribute attribute : list){  
            System.out.println("����"+attribute.getName() +":" + attribute.getValue());  
        }  
        //�����ǰ�ڵ����ݲ�Ϊ�գ������  
        if(!(node.getTextTrim().equals(""))){  
             System.out.println( node.getName() + "��" + node.getText());    
        }  
        //ͬʱ������ǰ�ڵ�����������ӽڵ�  
        //ʹ�õݹ�  
        Iterator<Element> iterator = node.elementIterator();  
        while(iterator.hasNext()){  
            Element e = iterator.next();  
            listNodes(e);  
        }  
    }  
}
