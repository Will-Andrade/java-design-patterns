public class Main {
	public static void main(String[] args) {
//		Duck mallard = new MallardDuck();
//
//		mallard.performQuack();
//		mallard.performFly();
		Duck modelD = new ModelDuck();
		
		modelD.performFly();
		
		modelD.setFlyBehaviour(new FlyRocketPowered());
		
		modelD.performQuack();
		modelD.performFly();
	}
}