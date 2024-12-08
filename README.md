# 3D Shape Polymorphism in Java

## Description
This project demonstrates **polymorphism** in Java by creating an interface (`Shape3DInterface`) for 3D shapes and implementing it in various classes (`Sphere`, `Cylinder`, `Cube`). The program randomly generates 10 3D shapes, calculates their surface area and volume, and outputs the results.

## How Polymorphism is Used
Polymorphism allows all the 3D shape classes to be treated uniformly as `Shape3DInterface`. This enables the program to use a single array of type `Shape3DInterface` to store different shapes and call their methods without knowing their exact types.

## Features
- Demonstrates the use of interfaces and polymorphism.
- Generates random dimensions for shapes.
- Calculates and displays surface area and volume for each shape.
