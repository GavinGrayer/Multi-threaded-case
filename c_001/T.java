/**
 * synchronized关键字
 * 对某个对象加锁
 * @author mashibing
 */

package yxxy.c_001;

public class T {
	
	private int count = 10;
	private Object o = new Object(); // o 是引用

	/**
	 *    栈          __________________
	 * |        |    |   new Object()   |
	 * |        |   /|------------------|
	 * |        |  / |                  |
	 * |--------| /  |                  |
	 * |___o____|/   |__________________|       
	 */
	
	public void m() {
		synchronized(o) { //任何线程要执行下面的代码，必须先拿到o的锁
			count--;
			System.out.println(Thread.currentThread().getName() + " count = " + count);
		}
	}

	
}



