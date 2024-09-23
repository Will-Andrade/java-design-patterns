// HAS-A QuackBehaviour
// HAS-A FlyBehaviour
// Is a Composition. A duck can't exist without these behaviours.
public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	public abstract void display();
	
	// Delegating the behaviours to the objects referenced by the behaviour properties
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	// To dynamically set behaviours through the runtime...
	public void setFlyBehaviour(FlyBehaviour fb) {
		this.flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		this.quackBehaviour = qb;
	}
}
