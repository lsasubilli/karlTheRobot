import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.Scanner;
import java.math.*;


//In this challenge, you will ask the user for a radius and then create a circle. The World that is created 
//should be a square that exactly fits your circle. When finished, your Class should
//report out the diameter, circumference and area of the circle you created. 

//Problems to consider:
//How do you get to the location when you are going to a diagonal? Think Pythagorean's Theorem!
//Rounding! The smaller the circle, the harder it is to make it look like a circle! Java has issues with rounding!
//How do you put your beeper down in a spot closest to what you want?
//What else do you need to consider?
//My robot is slow! How do you speed up the robot?
//Practice making as many methods as you can. 


public class Fix implements Directions
{
    public static void main(String[] args){
        Robot fred = new Robot(5, 6, North, 100);
        World.setVisible(true);
        World.setDelay(100);

        Scanner sc = new Scanner(System.in); // Read the user input of an int
        System.out.println("What is the radius of your circle?");
        int side = sc.nextInt();
        System.out.println("The diameter is "+side*2);
        System.out.println("The radius is "+side);
        System.out.println("The circumference is"+side*2* Math.PI);
        System.out.println("The area of the circle is :"+Math.pow(side,2)+Math.PI);

        World.setSize(50,50);
        makeCircle(side, fred);

        fred.move();
        fred.putBeeper();


    }

    //write a method that will turn right
    public static void turnRight(Robot r) //create a new method using a Robot parameter. r is a temp placeholder.
    {
        for(int i=0;i<3;i++){
            r.turnLeft();
        }
    }
    public static void makeCircle(int side, Robot fred){
        for(int i=0;i<side*side;i++){
            for(int j=0;j<side*side;j++){
                fred.move();
                fred.putBeeper();
            }
            fred.turnLeft();
        }
    }




    //Make any other methods you'll need here.

}
