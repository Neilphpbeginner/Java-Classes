package javapplication;

public class calc{

    int number1;
    int number2;
    int total;


    public calc(int number1, int number2){
        this.number1  = number1;
        this.number2  = number2;
    }

    public void Addition(){
        this.total  = this.number1 + this.number2;
        return this.total;
    }

    public void Subtract(){
        this.total  = this.number1 - this.number2;
        return this.total;
    }
    public void Multiply(){
        this.total  =this.number1 * this.number2;
        return this.total;
    }

}
