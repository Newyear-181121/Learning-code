package character;

public class TestHero1 extends Hero{
	
	 public static void main(String[] args) 				//主函数的入口
	    {
	    	
	    	//创建一个对象
	        new Hero();
	         
	        //使用一个引用来指向这个对象
	        Hero h1 = new Hero();
	        
	        
	        // 构造对象的时候也调用了构造方法
	         Hero garen2 =  new Hero("盖伦");  
	         Hero teemo2 =  new Hero("提莫",383);
	         
	         garen2.keng(garen2,teemo2);
	        
	        Hero h2 = h1;  //h2指向h1所指向的对象

	         
	        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象
	        
	        Hero garen =  new Hero();
	        garen.name = "盖伦";
	        garen.hp = 616.28f;
	        garen.armor = 27.536f;
	        garen.moveSpeed = 350;
	        
	      
	         
	        Hero teemo =  new Hero("提莫",383);
	        teemo.name = "提莫";
	        teemo.hp = 383f;
	        teemo.armor = 14f;
	        teemo.moveSpeed = 330;
	        
	      //Hero garen =  new Hero();
	        //garen.name = "盖伦";
	        //直接打印对象，会显示该对象在内存中的虚拟地址
	        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样
	 
	        System.out.println("打印对象看到的虚拟地址："+garen);
	        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
	        garen.showAddressInMemory();
	         
	        //Hero teemo =  new Hero();
	       // teemo.name = "提莫";
	        System.out.println("打印对象看到的虚拟地址："+teemo);
	        teemo.showAddressInMemory();
	        
	       // Hero teemo =  new Hero("提莫",383);
	        //血瓶，其值是100
	        int xueping = 100;
	         
	        //提莫通过这个血瓶回血
	         
	        teemo.huixue(xueping);
	         
	        System.out.println(xueping);
	        
	        
	      //受到400伤害，挂了
	        teemo.hp = teemo.hp - 400;
	        
	      //必须有一个对象才能调用
	        teemo.die();			//死亡
	         
	        teemo.revive(teemo);		//复活
	        
	      //无需对象，直接通过类调用
	        Hero.battleWin();
	      
	         
	        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
	        
	        Hero.copyright = "版权由Riot Games公司所有";
	        
	        h2.showAddressInMemory(); 
	        
	        
	  /*      
	        
	      //只有一引用
	        Hero h;
	        for (int i = 0; i < 100000; i++) 
	        {
	            //不断生成新的对象
	            //每创建一个对象，前一个对象，就没有引用指向了
	            //那些对象，就满足垃圾回收的条件
	            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
	            //一旦这个对象被回收，它的finalize()方法就会被调用
	            h = new Hero();
	            
	            //构造方法太多了。
	            //finalize会自动调用
	              
	             
	            
	        }
	        
	        */
	    }

}
