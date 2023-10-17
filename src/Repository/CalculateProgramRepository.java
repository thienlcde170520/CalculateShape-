/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import dataAccess.CalculateDao;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author ASUS
 */
public class CalculateProgramRepository implements ICalculateProgramRepository{
    public CalculateProgramRepository() {

    }

    @Override
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        CalculateDao.Instance().display(trigle, rectangle, circle);
    }   

    @Override
    public Triangle inputTriangle() {
        return CalculateDao.Instance().inputTriangle();
    }

    @Override
    public Rectangle inputRectangle() {
        return CalculateDao.Instance().inputRectangle();
    }

    @Override
    public Circle inputCircle() {
        return CalculateDao.Instance().inputCircle();
    }
    
}
