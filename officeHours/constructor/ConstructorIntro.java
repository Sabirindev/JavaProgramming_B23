package constructor;

public class ConstructorIntro {
     /*
    What is Constr?
    - It is a special to initialize all instance variables with Object Object
    - Constr  name MUST be same with ClassName
    - DOES NOT have RETURN TYPE
    Structure :         AccessModifier ClassName(Parameter){
                        }
                        ConstructorIntro(){
                        }
      Type Of Constr
      No- Arg : - if we dont have any constr,Compiler can create constr with no arg
                - if you create constr with parameter, compiler does not create no arg
                            public class Rectangle{
                            public int length;
                            public int width;
                            public Rectangle(){
                            length=5;
                            width=4;
                            }
                        }
      Parameterized: If you want assign values by yourself you should pass value as arg
                        public class Rectangle{
                            public int length;
                            public int width;
                            public Rectangle(int length,int width){
                                this.length=length;
                                this.width=width;
                            }
                        }
       Chaining Constr  : call one constr from another One
            - use this() to call another constr
            - this () it should in FIRST LINE of Cons
            - Can not call more than one constr
      this  :  it refers current Object
      this():  it refers current Object Constr.It can take parameter
        Constr OverLoading
        - Types - Number -Order of Parameter you can overload constructor
     */
}
