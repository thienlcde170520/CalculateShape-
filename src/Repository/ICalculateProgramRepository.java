
package Repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;


public interface ICalculateProgramRepository {
    void display(Triangle trigle, Rectangle rectangle, Circle circle);   
    
    Triangle inputTriangle();
    
    Rectangle inputRectangle();
    
    Circle inputCircle();
}
