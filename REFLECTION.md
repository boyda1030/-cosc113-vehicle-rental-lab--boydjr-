# Vehicle Rental Lab Reflection

## 1. Why should the fields be private?

Fields should be private to protect the data. Getters and setters allow us to control how the data is accessed and changed.

## 2. What happens if the Car constructor does not call super(...)?

The program will not compile if the parent class has no no-argument constructor and the child constructor does not call a valid parent constructor.

## 3. What is the difference between this.type and super.type?

this.type accesses the type variable in the current class. super.type accesses the type variable in the parent class.
