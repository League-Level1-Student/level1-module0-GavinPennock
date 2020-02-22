int Y=10;
int randomNumber =10;
int score=0;
void setup(){
  size(500,500);
  
 
}
void draw(){
    fill(0, 1000, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
 background(0,0,50);
    fill(0, 10, 1000);
    stroke(0, 300, 1000);
    ellipse(randomNumber, Y, 15, 20);
    Y=Y+5;
    if(Y>495){
      Y=10;
     randomNumber = (int) random(width); 
    }
     fill(#C4C4C4);
    stroke(#9B9B9B);
     rect(mouseX, 450, 50, 60);
  if(randomNumber==mouseX&&Y==450){
    Y=10;
    score=score+1;
    
  }
  
}
