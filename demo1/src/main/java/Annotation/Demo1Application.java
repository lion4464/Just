package Annotation;

import com.example.demo.TokenMachine;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ApplicationContext con=new AnnotationConfigApplicationContext(ClassConf.class);
        MyClass mc=con.getBean("CrMyClass",MyClass.class);
//        System.out.println("mc="+mc.test());
        mc.test();



    }

}
