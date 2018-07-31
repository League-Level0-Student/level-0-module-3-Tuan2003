int circleX = 250;
int circleY = 250;
int circleH = 450;
int circleW = 450;
void setup(){
size(500,500);
 
  for (int i = 1; i < 50; i++) {
if(i%2==0){
fill(#FF1212);
}else{
fill(#FFFFFF);
}
    ellipse(circleX,circleY,circleW,circleH);

circleH -= 10;
circleW -= 10;


}
  
  
  
}