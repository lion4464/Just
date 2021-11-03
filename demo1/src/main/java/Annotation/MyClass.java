package Annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class MyClass {
    private MoveFinder m;
    public MyClass(MoveFinder m) {
            this.m=m;
    }
    public void test(){
        getM();
        System.out.println("Move is running!!!!");
    }

    public MoveFinder getM() {
        return m;
    }
}
