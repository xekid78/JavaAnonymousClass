/**
 *
 * @author xekid78
 *
 */
public class Anonyclass {

	public static void main(String[] args) {
		Msg msg = new Msg() {
			public void HelloWorld() {
				System.out.println("Hello World");
			}
		};

		msg.HelloWorld();

	}

}

interface Msg {
	public void HelloWorld();
}
