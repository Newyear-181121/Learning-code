package collection_2;

import java.util.ArrayList;
import java.util.List;

/**
 * ����������-���� 
 * @author New year
 *
 *ͨ����һ������Ĳ�����Ϊ��ʵ���ϣ����ݾ��Ѿ��ź����ˡ� ������Ҫ�����ǿ�������Щ�Ѿ��ź�������ݣ����������ǳ��õ�List�����������ʽ
 *
 *�������ı�����������������
 *���򼴣� �м����������������
 *���򼴣� �м��������������м�
 *���򼴣� �м��������������ұ�
 *��ͼ����������ϣ��������Ľ���Ǵ�С����ģ�����Ӧ�ò���������� 
 */
public class Node2_3 {
	// ���ӽڵ�
    public Node2_3 leftNode;
    // ���ӽڵ�
    public Node2_3 rightNode;
  
    // ֵ
    public Object value;
    
    // ���� ����
    public void add(Object v) {
    	// �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
    	if (null == value)
    		value = v;
    	
    	 // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
    	else {
    		// ������ֵ���ȵ�ǰֵС������ͬ
    		
    		if ((Integer) v - ((Integer)value) <=0) {
    			if (null == leftNode)
    				leftNode = new Node2_3();
    			leftNode.add(v);
    		}
    		// ������ֵ���ȵ�ǰֵ��
    		else {
    			if (null == rightNode)
    				rightNode = new Node2_3();
    			rightNode.add(v);
    		}
    	}
    }
    
    // ����������еĽڵ�
    public List<Object> values() {
    	List<Object> values = new ArrayList<>();
    	
    	// ��ڵ�ı������
    	if (null != leftNode)
    		values.addAll(leftNode.values());
    	
    	// ��ǰ�ڵ�
    	values.add(value);		//��������value   д������values   �ͻ����һ����ֵĴ���
    	
    	// �ҽڵ�ı������
    	if(null != rightNode)
    		values.addAll(rightNode.values());
 	
		return values;
    }
}
