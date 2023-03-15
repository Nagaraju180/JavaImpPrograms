package javaImPrograms;
class Amazonprime
{
  int i;
  static int count;
  
  {
	  count++;
  }
  public static void objectsCount()
  {
	  System.out.println(count);
  }
}

public class Objectcount {

	public static void main(String[] args) {
         new Amazonprime();
         new Amazonprime();
         new Amazonprime();
         new Amazonprime();
         new Amazonprime();
         
         Amazonprime.objectsCount();
         
	}

}
