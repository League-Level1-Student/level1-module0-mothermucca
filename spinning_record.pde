import ddf.minim.*; //<>//
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
import ddf.minim.signals.*;
import ddf.minim.spi.*;
import ddf.minim.ugens.*;

import ddf.minim.*;  //at the very top of your sketch

Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;  //as member variable
int angle = 0;
int posX = 0;
int posY = 0;
int count = 0;

void setup() {
  size(480, 480);
  pictureOfRecord= loadImage("record.jpg");  //in setup method  
  fill(255);
  minim = new Minim(this);  //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);//in the setup method
}

void draw() {
  rotateImage(pictureOfRecord, angle % 360);
  image(pictureOfRecord, 0, 0);//in draw method
}

void mousePressed() {
  angle += 10;
  song.play();
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}