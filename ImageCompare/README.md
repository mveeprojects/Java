# ImageCompare
Java program to compare the differences between two images based on the RGB values of each pixel.

**---**

**main.java**

This class is used to call whichever (or all) of the functional classes within this program. Comment ('//') or uncomment either of the class.method() calls within this classes' main method to run the desired image comparison type (basic or lessBasic comparisons).

**---**

**basicComparison.java**

This class takes two sample images (wallwithoutpostit.png and wallwithpostit.png in this example), compares them for differences and outputs the differences to the console in your IDE.

**---**

**lessBasicComparison.java**

This class takes two sample images (wallwithoutpostit.png and wallwithpostit.png in this example), compares them for differences and creates a new image (see images/outputimages) showing a heat map of the difference between them. 
The colour given to each pixel in the output image is based on the severity of the difference between each pixel (using a given 'tolerance' value for each colour).