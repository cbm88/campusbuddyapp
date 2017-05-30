package mrustad.campusbuddy;

public class Credit extends Gradepoint{
    private double creditOne = 0;
    private double creditTwo = 0;
    private double creditThree = 0;
    private double creditFour = 0;
    private double creditFive = 0;
    private double creditSix = 0;

    public Credit(){

    }

    public Credit(double creditOne, double creditTwo, double creditThree, double creditFour, double creditFive, double creditSix){
        this.creditOne = creditOne;
        this.creditTwo = creditTwo;
        this.creditThree = creditThree;
        this.creditFour = creditFour;
        this.creditFive = creditFive;
        this.creditSix = creditSix;
    }

    public double getCreditOne(){
        return creditOne;
    }

    public double getCreditTwo(){
        return creditTwo;
    }

    public double getCreditThree(){
        return creditThree;
    }

    public double getCreditFour(){
        return creditFour;
    }

    public double getCreditFive(){
        return creditFive;
    }

    public double getCreditSix(){
        return creditSix;
    }

    public void setCreditOne(double creditOne) {
        this.creditOne = creditOne;
    }

    public void setCreditTwo(double creditTwo) {
        this.creditTwo = creditTwo;
    }

    public void setCreditThree(double creditThree) {
        this.creditThree = creditThree;
    }

    public void setCreditFour(double creditFour) {
        this.creditFour = creditFour;
    }

    public void setCreditFive(double creditFive) {
        this.creditFive = creditFive;
    }

    public void setCreditSix(double creditSix) {
        this.creditSix = creditSix;
    }

    public double getGPA(){
        double rawScore = (getGradeOne()*creditOne)+(getCreditTwo()*creditTwo)+(getCreditThree()*creditThree)
                +(getCreditFour()*creditFour)+(getCreditFive()*creditFive)+(getCreditSix()*creditSix);
        double totalCredits = creditOne + creditTwo + creditThree + creditFour + creditFive + creditSix;
        double result = rawScore/totalCredits;
        return Math.round(result *100.0)/100.0;
    }

}
