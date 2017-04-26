import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		// 使用反射得到方法
		Class<Text99> class1 = Text99.class;
		try {
			Method method = class1.getMethod("print");
			Object obj = class1.newInstance();
			method.invoke(obj);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 直接所使用
		/*
		 * try { FileOutputStream fos = new FileOutputStream("99.objects");
		 * ObjectOutputStream oos = new ObjectOutputStream(fos);
		 * 
		 * 
		 * for (int i = 1; i <= 9; i++) { for (int n = 1; n <= i; n++) {
		 * oos.writeObject(i + " x " + n + " = " + i * n + " "); //
		 * System.out.print(i + " x " + n + " = " + i * n + " "); } }
		 * System.out.println("Success"); } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 */
	}

}
