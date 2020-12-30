package ui;

import factory.BeanFactory;
import ny.base.常用类.myUtil.Out;
import service.IAccountService;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            Out.out(as);
            as.saveAccount();
        }

    }
}
