package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList��List
 * @author New year
 *		
 *		ArrayListʵ���˽ӿ�List
 *		������д�������������Ϊ�ӿ�List����
 *		ע�⣺��java.util.List,������java.awt.List
 */
public class Testcollection3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayListʵ���˽ӿ�List
        
        //������д�������������Ϊ�ӿ�List����
        //ע�⣺��java.util.List,������java.awt.List
        //�ӿ�����ָ��������󣨶�̬��
         
        List heros = new ArrayList();
        heros.add( new Hero1_1("����"));
        System.out.println(heros.size());
	}

}
