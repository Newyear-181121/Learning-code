package collection_2;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * TestCollection4_4   ������
 * @author New year
 *
 * @param <E>
 */
public class HashSet<E>
	extends AbstractSet<E>
	implements Set<E>, Cloneable , java.io.Serializable
{
	//HashSet���װ��һ��HashMap
	private HashMap<E,Object> map;
	
	private static final Object PRESENT = new Object();
	
	 //HashSet�Ĺ��췽����ʼ�����HashMap
	public HashSet() {
		map = new HashMap<E,Object>();
	}
	
	//��HashSet������Ԫ�أ���ʵ���ǰѸ�Ԫ����Ϊkey�����ӵ�Map��
    //value��PRESENT����̬��final�Ķ������е�HashSet��ʹ����ôͬһ������
	public boolean add(E e) {
		return map.put(e, PRESENT)==null;
	}
	
	//HashSet��size����map��size
	public int size() {
		return map.size();
	}
	
	//���Set�������Map
	public void clear() {
		map.clear();
	}
	
	//����Set,���ǰ�Map�ļ��ó�������
	public Iterator<E> iterator() {
		return map.keySet().iterator();
	}
}
