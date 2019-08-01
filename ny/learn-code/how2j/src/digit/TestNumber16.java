package digit;

import java.util.Locale;

public class TestNumber16 {
	
	public static void main(String[] args) {
		 
        System.out.printf("���ǻ��з�%n");
        System.out.printf("���ǻ��з�%n");
         
        
        
        /*	���з���������һ�� --- '\n' ���У�newline��
			�س������ǻص�һ�еĿ�ͷ --- '\r' �س���return��
			��eclipse����һ���س���ʵ�����ǻس����з�
			Java�ǿ�ƽ̨�ı�����ԣ�ͬ���Ĵ��룬�����ڲ�ͬ��ƽ̨ʹ�ã�����Windows,Linux,Mac
			Ȼ���ڲ�ͬ�Ĳ���ϵͳ�����з��ǲ�һ����
			��1����DOS��Windows�У�ÿ�н�β�� ��\r\n����
			��2��Linuxϵͳ�ÿ�н�βֻ�� ��\n����
			��3��Macϵͳ�ÿ�н�β��ֻ�� "\r"��
			Ϊ��ʹ��ͬһ��java����Ļ��з������еĲ���ϵͳ�ж���һ���ı��֣�ʹ��%n���Ϳ�������ƽ̨�޹صĻ���
			
			 */
        
        
        int year = 2020;
        //�ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
          
        //ֱ�Ӵ�ӡ����
        System.out.format("%d%n",year);
        //�ܳ�����8,Ĭ���Ҷ���
        System.out.format("%8d%n",year);
        //�ܳ�����8,�����
        System.out.format("%-8d%n",year);
        //�ܳ�����8,������0
        System.out.format("%08d%n",year);
        //ǧλ�ָ���
        System.out.format("%,8d%n",year*10000);
  
        //С����λ��
        System.out.format("%.2f%n",Math.PI);
          
        //��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
        
        
    }

}
