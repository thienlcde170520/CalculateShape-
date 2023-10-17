package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import Repository.CalculateProgramRepository;

import view.Menu;
import Repository.ICalculateProgramRepository;

public class Manager extends Menu<String>{
    static String[] mc = {"Shape Manager", "Exit"};    
    
    private ICalculateProgramRepository calculateProgramRepository; 
    
    public Manager() {
        super("===================== Calculator Shape Program =====================", mc);
        calculateProgramRepository = new CalculateProgramRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:      
                Rectangle rectangle = calculateProgramRepository.inputRectangle();
                Circle circle = calculateProgramRepository.inputCircle();
                Triangle trigle = calculateProgramRepository.inputTriangle();
                calculateProgramRepository.display(trigle, rectangle, circle);
                break;            
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }

    
       
    
}