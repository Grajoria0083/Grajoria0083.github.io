package drawshapes;

import java.awt.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext("applicatioContext.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicatioContext.xml");
		DrawShaps drawShaps = ctx.getBean("ds",DrawShaps.class);
		drawShaps.draw(new Circle());
	}

}
