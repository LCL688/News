package xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class num {
	public int text(String type) throws DocumentException
	{
		int a=0;
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("E:/xml/"+type+".xml"));
        Element root = document.getRootElement();
        //�������ǩ������
      //��ȡ���ڵ�����������ӽڵ㣨�������ӽڵ���ӽڵ㣩
        List<Element> list = root.elements() ;
        //����List�ķ���
        for (Element e:list){
            a++;
        }
        return a;
   }  
 }