PImage pictureOfRecord;
int angle=0;
void setup() {

  size(600, 600);                                 //in setup method
  pictureOfRecord= loadImage("pictureOfRecord.png");    
  pictureOfRecord.resize(600, 600);
}
void draw() {

  image(pictureOfRecord, 0, 0);  //in draw method
  if (mousePressed) {
    rotateImage(pictureOfRecord, angle++);
    image(pictureOfRecord, 0, 0);
  }
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
