package www.factorymethod;

public class FactoryPatternDemo {
	
	public static void main(String[] args) { 
		ShapeFactory shapeFactory = new ShapeFactory();  // Correção na declaração da variável
		
		// Obter um objeto de circle e chamar seu método draw.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// Chamar o método draw do círculo.
		shape1.draw(); 
		
		// Obter um objeto de rectangle e chamar seu método draw. 
		Shape shape2 = shapeFactory.getShape("rectangle");  // Correção no nome do método
		// Chamar o método draw do retângulo.
		shape2.draw(); 
		
		// Obter um objeto de square e chamar seu método draw. 
		Shape shape3 = shapeFactory.getShape("Square"); 
		// Chamar o método draw do quadrado.
		shape3.draw(); 
	}
}
