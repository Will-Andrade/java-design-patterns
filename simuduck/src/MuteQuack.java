// Behaviour class
// IMPLEMENTS a QuackBehaviour
public class MuteQuack implements QuackBehaviour {
	@Override
	public void quack() {
		System.out.println("<<<Silence>>>");
	}
}
