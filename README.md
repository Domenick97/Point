# Point
Point is a lightweight JavaScript library for a 2 dimensional point.

## Features

 * Find the degrees rotated around the origin from the positive x-axis.


### Install



<br/>

## Usage

To use the Point class, include the Point.java file within the projects directory.

### Create Point

```java
// Creates point initializing x and y to 0
Point point1 = new Point();
// x = 0
// y = 0

// Creates point setting x and y to values passed in
Point point2 = new Point( 4, 2 );
// x = 4
// y = 2

// Creates point with the same values as the point passed in
Point point3 = new Point( point2 );
// x = 4
// y = 2
```

---


#### `degrees` function
Finds the angle in degrees between the location of the point and the x-axis rotated around the origin.

---

## MIT License


MIT License

Copyright (c) 2018 Domenick DiBiase

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
