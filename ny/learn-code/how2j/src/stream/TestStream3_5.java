package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * д�����ݵ��ļ�
 * @author New year
 *
 */
public class TestStream3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("f:/demo/xyz/abc/lolw.txt");
			
			
			//��ΪĬ������£��ļ�ϵͳ�в����� d:\xyz\abc\def�����������ʧ��
		
			//���Ȼ�ȡ�ļ����ڵ�Ŀ¼
			File dir = f.getParentFile();
			//�����Ŀ¼�����ڣ��򴴽���Ŀ¼
			if(!dir.exists()){
				
				//dir.mkdir();		//ʹ��mkdir���׳��쳣����Ϊ��Ŀ¼�ĸ�Ŀ¼Ҳ������
				dir.mkdirs();		//ʹ��mkdirs���Ѳ����ڵ�Ŀ¼��������
				
			}
			
			byte data[] = {89,89};
			
			//����������  ��������   ���ֽ���
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write(data); //д������
			
			fos.close();//�ر���			//��try���йر���������һ������           �Ǿ��ǵ�ǰ������쳣�׳�ʱ����û��ִ����һ�д��롣
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�������");
	}

}
