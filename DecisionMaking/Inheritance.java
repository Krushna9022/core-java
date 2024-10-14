//Inhertance is concept in which we can use the function and method of parent in child (superclass in subclass)
//Inhertance have 3 type:
/*
 1.single     2.multilevel                 hierarchy
  class A           class A                  class A
    |                  |                        /\ 
	|               class B                    /  \
  	|                  |                      /    \
  class B	         class c             class B  class C     */
 
class A
{
   void f1(){System.out.println("class A is called");}
}
class B
{
	 void f2(){System.out.println("class B is called");}
}
 class Inhertance
  {
	  public static void main(String x[])
	  {
		B b=new B();  
	  }
  }