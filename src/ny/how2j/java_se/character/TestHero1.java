package character;

public class TestHero1 extends Hero{
	
	 public static void main(String[] args) 				//�����������
	    {
	    	
	    	//����һ������
	        new Hero();
	         
	        //ʹ��һ��������ָ���������
	        Hero h1 = new Hero();
	        
	        
	        // ��������ʱ��Ҳ�����˹��췽��
	         Hero garen2 =  new Hero("����");  
	         Hero teemo2 =  new Hero("��Ī",383);
	         
	         garen2.keng(garen2,teemo2);
	        
	        Hero h2 = h1;  //h2ָ��h1��ָ��Ķ���

	         
	        //h1,h2,h3,h4,h5 ������ã���ָ��ͬһ������
	        
	        Hero garen =  new Hero();
	        garen.name = "����";
	        garen.hp = 616.28f;
	        garen.armor = 27.536f;
	        garen.moveSpeed = 350;
	        
	      
	         
	        Hero teemo =  new Hero("��Ī",383);
	        teemo.name = "��Ī";
	        teemo.hp = 383f;
	        teemo.armor = 14f;
	        teemo.moveSpeed = 330;
	        
	      //Hero garen =  new Hero();
	        //garen.name = "����";
	        //ֱ�Ӵ�ӡ���󣬻���ʾ�ö������ڴ��е������ַ
	        //��ʽ��Hero@c17164 c17164�������ַ��ÿ��ִ�У��õ��ĵ�ַ��һ��һ��
	 
	        System.out.println("��ӡ���󿴵��������ַ��"+garen);
	        //����showAddressInMemory����ӡ�ö����this����ʾ��ͬ�������ַ
	        garen.showAddressInMemory();
	         
	        //Hero teemo =  new Hero();
	       // teemo.name = "��Ī";
	        System.out.println("��ӡ���󿴵��������ַ��"+teemo);
	        teemo.showAddressInMemory();
	        
	       // Hero teemo =  new Hero("��Ī",383);
	        //Ѫƿ����ֵ��100
	        int xueping = 100;
	         
	        //��Īͨ�����Ѫƿ��Ѫ
	         
	        teemo.huixue(xueping);
	         
	        System.out.println(xueping);
	        
	        
	      //�ܵ�400�˺�������
	        teemo.hp = teemo.hp - 400;
	        
	      //������һ��������ܵ���
	        teemo.die();			//����
	         
	        teemo.revive(teemo);		//����
	        
	      //�������ֱ��ͨ�������
	        Hero.battleWin();
	      
	         
	        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
	        
	        Hero.copyright = "��Ȩ��Riot Games��˾����";
	        
	        h2.showAddressInMemory(); 
	        
	        
	  /*      
	        
	      //ֻ��һ����
	        Hero h;
	        for (int i = 0; i < 100000; i++) 
	        {
	            //���������µĶ���
	            //ÿ����һ������ǰһ�����󣬾�û������ָ����
	            //��Щ���󣬾������������յ�����
	            //���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������
	            //һ��������󱻻��գ�����finalize()�����ͻᱻ����
	            h = new Hero();
	            
	            //���췽��̫���ˡ�
	            //finalize���Զ�����
	              
	             
	            
	        }
	        
	        */
	    }

}
