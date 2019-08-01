package lambda;


/**
 * for TestLambda class   ��������
 * @author New year
 *
 */
public class Hero implements Comparable<Hero> {

	public String name;
	public float hp;
	
	public int damage;
	
	public Hero(){
		
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	//��ʼ��name,hp,damage�Ĺ��췽��
	public Hero(String name,float hp,int damage ){
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	
	@Override
	public int compareTo(Hero anotherHero) {
		if(damage<anotherHero.damage)
			return 1;
		else
			return -1;
	}
	
	/*		//Ϊʲô�������ִ��code������������ͻ��д�����ϵͳ��Ӹ��ǵķ�������û�д����ˣ�����
	public String ToString(){
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]  \r\n";
	}
	*/
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]  \r\n";
	}
	
	//�����Զ���ӵĳ��󷽷���ԭʼ����
	/*
	@Override
	public int compareTo(Hero o) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	
	

}

/*   1-1�ִ�������        
 ��ʼ����ļ��ϣ�
[lambda.Hero@106d69c, lambda.Hero@52e922, lambda.Hero@25154f, lambda.Hero@10dea4e, lambda.Hero@647e05, lambda.Hero@1909752, lambda.Hero@1f96302, lambda.Hero@14eac69, lambda.Hero@a57993, lambda.Hero@1b84c92]
ɸѡ�� hp>100 && damange<50��Ӣ��
lambda.Hero@647e05lambda.Hero@1909752lambda.Hero@1f96302lambda.Hero@a57993lambda.Hero@1b84c92 
 */

/*   1-1ϵͳ�������	
 ��ʼ����ļ��ϣ�
[Hero [name=hero 0, hp=5024.0, damage=58]  
, Hero [name=hero 1, hp=4313.0, damage=96]  
, Hero [name=hero 2, hp=9027.0, damage=67]  
, Hero [name=hero 3, hp=662.0, damage=30]  
, Hero [name=hero 4, hp=6615.0, damage=3]  
, Hero [name=hero 5, hp=8088.0, damage=27]  
, Hero [name=hero 6, hp=8999.0, damage=1]  
, Hero [name=hero 7, hp=5202.0, damage=66]  
, Hero [name=hero 8, hp=5382.0, damage=52]  
, Hero [name=hero 9, hp=3297.0, damage=95]  
]
ɸѡ�� hp>100 && damange<50��Ӣ��
Hero [name=hero 3, hp=662.0, damage=30]  
Hero [name=hero 4, hp=6615.0, damage=3]  
Hero [name=hero 5, hp=8088.0, damage=27]  
Hero [name=hero 6, hp=8999.0, damage=1]  

 */
