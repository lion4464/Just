package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ClassConf {

//   Move obj create via Bean Annotation
    @Bean
    public MoveFinder CrMove(){
        return new MoveFinder();
    }
//    MyClass obj create with Dependency Injection(Move obj) via Bean Annotation
    @Bean(name = "CrMyClass")
public  MyClass CreateMyClass(){
    MyClass m1=new MyClass(CrMove());
    return m1;
}
}
