// IS-A Duck
// HAS-A QuackBehaviour
// HAS-A FlyBehaviour
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck!");
	}
}
