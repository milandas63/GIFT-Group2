Day-06 (12-07-2023)
    What is OOPs?
        OOPs are a set concepts applied to programming.
        They are:
        1)  Encapsulation
        2)  Inheritance
        3)  Polymorphism

    What is Polymorphism?
        Polymorphis has 2 features:
        1)  Overloading
            When 2 or more methods have same name with different parameter list
            within the same class it is known as overloading of methods.
        2)  Overriding
            When 2 or more methods are defined in the child class that exists in
            the parent class having same parameter list is known as overriding

            class Parent {
                public void delete() {
                }
            }
            class Child extends Parent {
                public void delete() {
                }
            }

    What is the syntax of a class?
        [access-specifier]
        [modifier]
        class <class-name>
        [extends <parent-class>]
        [implements <interface-list,....>]
        {}

    How is a class accessible?
        A class is accessible by 2 ways:
        1)  By inheritance
            public class Example extends SomeClass {}
        2)  By object reference
            Example e = new Example();
            e.method();

        java.lang.Object
        +- InterestCalc
        |  +- Calculate

        public class Calculate extends InterestCalc {}

    What is an access-specifier?
        There are 4 types of access-specifiers:
        1)  public
            The public class is allowed to be accessed by other classes with the same
            package and across other packages
        2)  protected
            The protected class is allowed to be accessed only by inheritance and 
            restricts access through object reference when it is across a different
            package
        3)  private
            A private is complete restricted to be accessed
        4)  <undefined>
            An undefined class is allowed to accces only by object reference and 
            inheritance is restricted when the accessing class is in another package

    What is a modifier?
        The modifier provides a special meaning to the entity.
        There are 8 modifiers:
        1)  abstract
        2)  final
        3)  static
        4)  synchronized
        5)  native
        6)  strictfp
        7)  transient
        8)  volatile

    final modifier:
        1)  When a class is final the same class is restricted to
            be inherited
            public final class SolarSystem {}
            public class Sun extends SolarSystem {}
        2)  If a field is defined final, the value of the field
            can't be changed
            public final double PI = 3.141;
        3)  When a method is defined final in the parent class,
            the same method is restricted to be overrided in the
            child class

    static:
    1)  A static method may be called by class name reference
    2)  When a field is static, all instances of the class in which
        the static field exists share common memory location
    3)  A static member (field, method) may be accessed by class name
        reference

    CLASSWORK:
    1)  Count the number of vowels in a given String?
    2)  Flip/Invert/Toggle the case of all characters in a given String?
        Original:   Quick Brown Fox Jumps Over The Lazy Dog
        Invert:     qUICK bROWN fOX jUMPS oVER tHE lAZY dOG

