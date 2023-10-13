import processing.core.PApplet;   
import java.time.LocalTime;

public class Sketch extends PApplet {
  public static void main() {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Display the current time
        System.out.println("Current Time: " + currentTime);
    }

  public void settings() {
    size(650, 650);
  }

  public void setup() {
    background(198, 219, 247);
  }

  public void draw() {

  //Penguin Feet
    float footOneX = 120;
    float footOneY = 140;
    boolean footLocation = footOneX + footOneY >= 120;
   
    if (footLocation) {
      background(252, 252, 159);
      textSize(18);
      text("Hello!!", 100, 200);
    }

    float footSize = 20; 
    float footDistance = footSize;
    fill(250, 165, 75);
    stroke(250, 165, 75);
    ellipse(footOneX/2, footOneY/2, footSize/2, footDistance/2);
    
    float footTwoX = 150;
    float footTwoY = 140;
    ellipse(footTwoX/2, footTwoY/2, footSize/2, footDistance/2);
      
  //Penguin Arms 
    float armsX = 135; 
    float armsY = 100; 
    float armsSize = 106; 
    float armsDistance = armsSize/2;
    fill(39, 74, 168);
    stroke(39, 74, 168);
    ellipse(armsX/2, armsY/2, armsSize/2, armsDistance/2);

  //Penguin Full Body
    float bodyOneX = 135; 
    float bodyOneY = 100; 
    float bodyOneSize = 85; 
    float bodyOneDistance = bodyOneSize;
    fill(96, 137, 247);
    stroke(96, 137, 247);
    ellipse(bodyOneX/2, bodyOneY/2, bodyOneSize/2, bodyOneDistance/2);
    float bodyTwoX = 135; 
    float bodyTwoY = 71; 
    float bodyTwoSize = 76; 
    float bodyTwoDistance = bodyTwoSize;
    ellipse(bodyTwoX/2, bodyTwoY/2, bodyTwoSize/2, bodyTwoDistance/2);
  
    //Penguin Stomach
    fill(255, 255, 255);
    stroke(255, 255, 255);
    float stomachOneX = 125;
    float stomachOneY = 63;
    float stomachSize = 23; 
    float stomachDistance = stomachSize;
    ellipse(stomachOneX/2, stomachOneY/2, stomachSize/2, stomachDistance/2);

    float stomachTwoX = 146;
    float stomachTwoY = 63;
    ellipse(stomachTwoX/2, stomachTwoY/2, stomachSize/2, stomachDistance/2);

    float stomachThreeX = 135;
    float stomachThreeY = 100;
    float stomachThreeSize = 70; 
    float stomachThreeDistance = stomachThreeSize*(7/4);
    ellipse(stomachThreeX/2, stomachThreeY/2, stomachThreeSize/2, stomachThreeDistance/2);

  //Penguin Eyes
    fill(10, 10, 10);
    float eyeOneX = 125;
    float eyeOneY = 63;
    float eyeSize = 13;
    float eyeDistance = eyeSize;
    ellipse(eyeOneX/2, eyeOneY/2, eyeSize/2, eyeDistance/2);
    
    float eyeTwoX = 146; 
    float eyeTwoY = 63; 
    ellipse(eyeTwoX/2, eyeTwoY/2, eyeSize/2, eyeDistance/2);

  //Penguin Beak
    fill(250, 165, 75);
    float beakX = 135; 
    float beakY = 69;
    float beakSize = 10;
    float beakDistance = beakSize;
    ellipse(beakX/2, beakY/2, beakSize/2, beakDistance/2);
  
    }
  }
  
