package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String name;
    public Dog(){

    }
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
