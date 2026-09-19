# Week 7 - Abstraction and Interface

## Problem 1 - Talking Toy Box

Concepts:
- Abstraction
- Abstract class
- Abstract method
- final variable
- static variable
- Inheritance

Compile and run:
```text
cd Problem1_TalkingToyBox
javac *.java
java Main
```

## Problem 2 - Warehouse Label Printer

Concepts:
- Interface
- Interface implementation
- Polymorphism

Compile and run:
```text
cd Problem2_WarehouseLabelPrinter
javac *.java
java Main
```

## Problem 3 - Orchestra Warm-Up Routine

Concepts:
- Multilevel inheritance
- Method overriding
- super

Compile and run:
```text
cd Problem3_OrchestraWarmUp
javac *.java
java Main
```

`Instrument.play()` remains abstract as required. Java does not permit
`StringInstrument` to call `super.play()` when that inherited method is abstract,
so it supplies the base string directly. `Violin` validly uses `super.play()` to
add its own detail.

## Problem 4 - Smart Kitchen Assistant

Concepts:
- Abstraction
- Interface
- Encapsulation
- Getter and setter
- Validation

Compile and run:
```text
cd Problem4_SmartKitchen
javac *.java
java Main
```

## Problem 5 - Package Drop-Off Log

Concepts:
- Abstract class
- Method overloading
- Runtime polymorphism
- Upcasting

Compile and run:
```text
cd Problem5_PackageDropOff
javac *.java
java Main
```
