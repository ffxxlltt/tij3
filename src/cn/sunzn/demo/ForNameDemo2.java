package cn.sunzn.demo;

public class ForNameDemo2 {
	public static void main(String[] args) {

        try {
            System.out.println("载入 TestClass ");
            Class c = Class.forName("cn.sunzn.demo.TestClass", false, Thread.currentThread().getContextClassLoader());

            System.out.println("使用 TestClass 声明参考名称");
            TestClass test = null;

            System.out.println("使用 TestClass 建立对象");
            test = new TestClass();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("没有指定类名称");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的类");
        }
    }

}
