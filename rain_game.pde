int x = 150;
int y = 0;
int bucketHeight = 25;
int bucketWidth = 25;
int score = 0;
int bucketX = 0;
int speed = 1;

void setup() {
  size(300, 300);
  background(128, 128, 128);
  x = (int)random(width);
}

void draw() {
  background(128, 128, 128);
  fill(0, 0, 192);
  stroke(0, 0, 0);
  ellipse(x, y, 10, 25);
  y += speed;
  if (y >= height) {
    checkCatch(x);
    y = 0;
    x = (int)random(width);
    speed = score+1;
  }

  fill(204, 102, 20);
  stroke(0, 0, 0);
  bucketX = mouseX;
  if (mouseX < 0) {
    bucketX = 0;
  } else if (mouseX + bucketWidth > width) {
    bucketX = width - bucketWidth;
  }
  rect(bucketX, height-bucketHeight, bucketWidth, bucketHeight);
  
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}

void checkCatch(int x){
     if (x > bucketX && x < bucketX + bucketWidth)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
}