package com.PracticeJavaWithPandey.ObjectOrientedProgramming.AccessModifier;

//in this Program we will use all 3 Access Modifier : public:Private:Protected:Default

// classes can have only two access specifier : Private  & default

// on the other hand Attribute , method  constructor we can use all 4 Modifiers
public class AccessModifierDemo extends ClassWithAllAttribute{
    private AccessModifierDemo(){
        System.out.println("Private Costructor Of Parent Class Called");
    }

    public static void main(String[] args) {
        ClassWithAllAttribute cwaa = new AccessModifierDemo();
        //able to get public and protected name via objcet as Class is already exteneded with BASe Class
        cwaa.publicName();
        cwaa.protectedName();

        //not able to call Private Method
//        cwaa.privateName(); //error
    }
}



class ClassWithAllAttribute{
    protected ClassWithAllAttribute(){
        System.out.println("PRotected Constructor Of Child Class Called!!");
    }
 private void privateName(){
     System.out.println("Private Method Called");
 }
 public void publicName(){
        System.out.println("Public Method Called");
    }
 protected void protectedName(){
        System.out.println("Protected Method Called");
    }
}



