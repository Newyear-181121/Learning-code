package collection;


/**
 * 	ʹ������ľ�����
 * 		��ǰ��Tsetcollection1_1 	���Ƚϵ�
 * @author New year
 *
 */
public class Hero1_1 {
	
	public String name;
	public float hp;
	
	public int damage;
	
	public Hero1_1() {
		
	}
	
	
	//����һ����ʼ��name�Ĺ��췽��
	public Hero1_1(String name) {
		this.name = name;
	}

	// ��дtoString����
	@Override
    public String toString() {
        return name;
    }

}
