package cn.sunzn.demo;

public class ForNameDemo1 {
	public static void main(String[] args) {

        try {
            System.out.println("���� TestClass ");
            Class c = Class.forName("cn.sunzn.demo.TestClass");

            System.out.println("ʹ�� TestClass �����ο�����");
            TestClass test = null;

            System.out.println("ʹ�� TestClass ��������");
            test = new TestClass();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("û��ָ��������");
        } catch (ClassNotFoundException e) {
            System.out.println("�Ҳ���ָ������");
        }
    }

}
