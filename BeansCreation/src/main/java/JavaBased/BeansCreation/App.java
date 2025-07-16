package JavaBased.BeansCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext cse = new AnnotationConfigApplicationContext(Config.class); // java based configuration
        GetterSetter obj1=(GetterSetter)cse.getBean("display"); // injecting objects using java based configuration
//        System.out.println(obj1); // setter dependency injection
        
        
        Constructor obj2=(Constructor)cse.getBean("vaasu");
        System.out.println(obj2);  // constructor dependency injection
        
        
        Annot obj3 = (Annot)cse.getBean(Annot.class);
//        obj3.display(); // Annotation using java based configuration
    }
}
