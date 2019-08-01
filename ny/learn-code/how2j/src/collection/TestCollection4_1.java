package collection;

import java.util.ArrayList;
import java.util.List;

import character.APHero;
import character.Hero;


/**
 * ���� Generic 
 * @author New year
 *
 *��ָ�����͵����������Դ���κ����͵�Ԫ��
 *ָ���˷��͵�������ֻ�ܴ��ָ�����͵�Ԫ���Լ������� 
 *
 *
 *���͵ļ�д 
 *
 *Ϊ�˲�ʹ���������־��棬��Ҫǰ��ʹ�÷��ͣ���������
 * 
 *List<Hero> genericheros = new ArrayList<Hero>();
 *
 *
 *����JDK7�ṩ��һ��������΢���ٴ������ķ��ͼ�д��ʽ
 *
 *List<Hero> genericheros2 = new ArrayList<>();
 *
 *
 *����ķ��Ϳ�����<>�����棬��ʤ���ް� 
 */
public class TestCollection4_1 {

	public static void main(String[] args) {

		//���ڲ�ʹ�÷��͵������������������Ӣ�ۣ�Ҳ�������������Ʒ
		List heros = new ArrayList();
		
		heros.add(new Hero("����"));
		
		//�������ڴ��Ӣ�۵�����������Ҳ���Դ����Ʒ��
		heros.add(new Item4_1("����"));
		
		//����ת�ͻ��������
		Hero h1 = (Hero) heros.get(0);
		//��������������ŵĶ���̫���ʱ�򣬾ͼǲ�����ĸ�λ�÷ŵ����������͵Ķ�����
		Hero h2 = (Hero) heros.get(1);
		
		//���뷺��Generic
        //����������ʱ�򣬾�ָ��������������ֻ�ܷ�Hero���������ľͻ����
		List<Hero> genericheros = new ArrayList<Hero>();
		genericheros.add(new Hero());
		//�������Hero���ͣ������ͷŲ���ȥ
        //genericheros.add((Hero1_1) new Item4_1("����"));		//ǿ��ת��Ҳû���á�
		
		//����֮�⣬���ܴ��Hero������
		genericheros.add(new APHero());	//һ��ʼadd������ӦΪAPHeroû�м̳�Hero�ࡣ
		
		//������ȡ�����ݵ�ʱ�򣬲���Ҫ�ٽ���ת���ˣ���Ϊ����϶��Ƿŵ�Hero����������
		Hero h = genericheros.get(0);
		
		
		}

}
