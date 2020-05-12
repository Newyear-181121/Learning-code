package character;

import java.util.Scanner;

/**
 * 测试键盘输入
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始输入");
        String name = scanner.nextLine();//获取输入的这行文字
    }
}
