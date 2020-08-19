class volumeOfCuboid
{
  int l;
  int w;
  int h;
  
  volumeOfCuboid(int x, int y, int z)
  {
    l=x;
    w=y;
    h=z;
  }
  
  void display()
  {
    System.out.println("The length is : "+l+" , Width is : "+w+" ,and Height is : "+h);
    System.out.println("Hence, the Volume is :"+(l*w*h));
  }
}
