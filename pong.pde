import java.util.Random;
import ddf.minim.*;  
Minim minim;
AudioSample pong;
AudioSample bzzt;

// where the ball is
int x = 30;
int y = 300;

// left and right court boundaries
int xLeft = 30;
int xRight = 1150;

// speed
int xSpeed = 4;
double ySpeed = 4.0;

int h = 570;
PImage backgroundImage;

// paddle width and height
int paddleW = 10;
int paddleH = 50;

Random random = new Random();

void setup() {
  size(1200, 570);
  backgroundImage = loadImage("tennis.gif");
  
  // offset and resize the image because it has extra junk that needs to be offscreen
  image(backgroundImage, -500, -605, 2200, 1600);
  minim = new Minim (this);
  pong = minim.loadSample("pong.wav", 128);
  bzzt = minim.loadSample("bzzt.wav", 128);
}

void draw() {
  drawBall(x, y);
  drawPaddle(xLeft, mouseY);
  
  // set the next ball position
  x += xSpeed;
  y += ySpeed;
  
  if (x > xRight) {
    xSpeed = -xSpeed;
    x = xRight;
  } else if (x < xLeft) {
    if (intersects(y, mouseY)) {
      xSpeed = -xSpeed;
      x = xLeft;
      pong.trigger();
      speedUp();
    } else {
      // if the player missed, go back to the starting speeds
      xSpeed = 4;
      ySpeed = 4.0;  
      bzzt.trigger();
    }
  }
  
  if (y > h) {
    ySpeed = -ySpeed;
    y = h;
  } else if (y < 0) {
    ySpeed = -ySpeed;
    y = 0;
  }
}

void speedUp() {
  // xSpeed is the horizontal speed
  if (Math.abs(xSpeed) < 20) {
    xSpeed *= 2;
    println("xSpeed = " + xSpeed);
  }
  
  // ySpeed is the angle. If xSpeed == ySpeed, then it's a 45 degree angle.
  // make 0.5 * xSpeed < ySpeed < 1.5 * xSpeed
  ySpeed = (random.nextFloat() + 0.5) * xSpeed;
  println("ySpeed = " + ySpeed);
}

void drawPaddle(int x, int y) {
  rect(x - paddleW, y - paddleH/2, paddleW, paddleH);
}

void drawBall(int x, int y) {
  image(backgroundImage, -500, -605, 2200, 1600);
  ellipse(x, y, 10, 10);
  fill(255, 255, 102);
  stroke(255, 0, 0);
}

// only gets called if ballX is crossing where the paddle should be
boolean intersects(int ballY, int paddleY) {
  if (ballY > paddleY - paddleH/2 && ballY < paddleY + paddleH/2)
    return true;
  else
    return false;
}