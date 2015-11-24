public class Circle{
private double x1;
private double y1;
private double radius1;
private double dir;
private double speed;// declare the variables
public Circle(double x, double y, double radius){
x1=x;
y1=y;
radius1=radius;// initial get constunctor value
}
public double getX(){
return x1;// return x value
}
public double getY (){
return y1;// return y value
}
public double getRadius(){
return radius1;// return radius value
}
public double getDir(){
return dir;// return direction 
}
public double getSpeed(){
return speed;// return the speed
}
public void setX (double horz){
x1=horz;// initial to horz
}
public void setY(double vert){
y1=vert;// initial y to vertical 
}
public void setDir(double compass){
dir=compass;// inital direction to compass
}
public void setSpeed(double fast){
speed=fast;// initial speed to fast
}
public void move( double time ){
 x1 = x1 + Math.cos( dir ) * speed * time ;// x coor after time
  y1 = y1 + Math.sin( dir ) * speed * time; // y coordinate after time
}
public boolean touches( Circle other ){
double distance=Math.sqrt(Math.pow(this.x1-other.getX(),2)+ Math.pow(this.y1-other.getY(),2) );// cal the distance between circle center
double sumRad=this.radius1+other.getRadius();// total radius of 2 cirle
if(distance<sumRad){
return true;// touches true if match if statement
}else
return false;// else touches is false
}
 public static void main(String[] unused) throws InterruptedException {   
      Bounce myProg = new  Bounce();  // object for bounce jar  
     }  
}