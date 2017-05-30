package mrustad.campusbuddy;

/**
 * Created by Mark Rustad on 11/19/2016.
 */

public class Gradepoint {

    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;
    private double gradeFour;
    private double gradeFive;
    private double gradeSix;

    public Gradepoint(){
        gradeOne = 0;
        gradeTwo = 0;
        gradeThree = 0;
        gradeFour = 0;
        gradeFive = 0;
        gradeSix = 0;

    }

    public Gradepoint(double gradeOne, double gradeTwo, double gradeThree, double gradeFour, double gradeFive, double gradeSix){
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
        this.gradeThree = gradeThree;
        this.gradeFour = gradeFour;
        this.gradeFive = gradeFive;
        this.gradeSix = gradeSix;
    }

    public double getGradeOne(){
        return gradeOne;
    }

    public double getGradeTwo(){
        return gradeTwo;
    }

    public double getGradeThree(){
        return gradeThree;
    }

    public double getGradeFour(){
        return gradeFour;
    }

    public double getGradeFive(){
        return gradeFive;
    }

    public double getGradeSix(){
        return gradeSix;
    }

    public void setGradeOne(double gradeOne){
        this.gradeOne = gradeOne;
    }

    public void setGradeTwo(double gradeTwo) {
        this.gradeTwo = gradeTwo;
    }

    public void setGradeThree(double gradeThree) {
        this.gradeThree = gradeThree;
    }

    public void setGradeFour(double gradeFour) {
        this.gradeFour = gradeFour;
    }

    public void setGradeFive(double gradeFive) {
        this.gradeFive = gradeFive;
    }

    public void setGradeSix(double gradeSix) {
        this.gradeSix = gradeSix;
    }

    public double getGPA(){
        return 0;
    }

}

