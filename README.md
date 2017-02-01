# HTree
Draws an HTree graphic recursively to a specified depth level

This project was based on a programming assignment found at http://introcs.cs.princeton.edu/java/assignments/htree.html

The StdDraw class used in this project comes from http://introcs.cs.princeton.edu/java/stdlib/  
This site allows you to download the stdlib.jar file under the GNU General Public License.  
** Note that the stdlib.jar file must be included in the Java classpath for this program to run. **

Running the program  
In order to run the HTree.java app, an argument must be specified. This is an integer from 1-7 Ideally.  
Anything beyond 7 will result in an almost completely black screen being drawn. 

From the command line, navigate to the bin directory where the .class files are located.  
Use this command to run the program. Note that 6 is the depth level.  
  java HTree 6
  
Remember that you should also specify the classpath where your stdlib.jar file is located.  
  java -cp YourDirectory/stdlib.jar HTree 6
