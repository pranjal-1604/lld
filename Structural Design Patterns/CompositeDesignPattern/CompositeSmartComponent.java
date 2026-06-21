package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    List<SmartComponent> components = new ArrayList<>();

    void addComponents(SmartComponent component){
        components.add(component);
    }

    void removeComponent(SmartComponent component){
        components.remove(component);
    }

    @Override
    public void turnOn() {
        for(SmartComponent component:components){
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
      for(SmartComponent component:components){
          component.turnOff();
      }
    }
}
