package ny.demo.问题;

public class Issue {
    int id;
    String name;
    public Issue(int id,String name){
        this.id = id;
        this.name = name;
    }

    /**
     * 根据传入对象的地址找到这个对象的属性并进行了修改，
     *  有访问权限，所有修改有效。
     *  方法结束后修改可以得到保留。
     * @param is
     */
    public void test1(Issue is){
        is.name = "jald";

    }

    /**
     * 得到一个变量名，
     *      修改了这个变量名的指引。
     *
     *      方法结束后，这个变量名的指引为什么没有被改变。？？？
     *
     * @param is
     */
    public void test2(Issue is){

        is = new Issue(123,"acc");

    }

    public static void main(String[] args) {
        Issue issue = new Issue(110,"aaa");

        issue.test1(issue);
        System.out.println(issue.id);
        System.out.println(issue.name);
        System.out.println(issue);

        issue.test2(issue);
        System.out.println(issue.id);
        System.out.println(issue.name);
        System.out.println(issue);
    }
}
