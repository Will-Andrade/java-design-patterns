// IS-A Duck
// HAS-A QuackBehaviour
// HAS-A FlyBehaviour
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck!");
	}
}
