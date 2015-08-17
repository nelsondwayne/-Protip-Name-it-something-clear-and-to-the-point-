class BaseClass {

public int x = 10;
private int y = 10;
protected int z = 10;
int a = 10; //Implicit Default Access Modifier
public int getX()  {
	return x;
}
public void setX(int x) {
	this.x = x;
}
private int getY() {
	return y;
}
protected void setY() {
	this.y = y;
}
protected int getZ() {
    return z;
}
protected void setZ(int z) {
    this.z = z;
}
int getA() {
	return a;
}
void setA(int a) {
	this.a = a;
	}
}
 