/* This is the problem we are gonna approach here - 
https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem?isFullScreen=true
by solving this problem, we are gonna get ourselves introduced with Scala's
very basics, e.g., how to write a function in Scala, how to use loop, what
are Scala's options for array/collection, how to iterate an element in Scala
collection. I find it useful to learn these basics while using them to solve
a programming problem.
Later on, we are gonna use Scala's built in library methods to write the
solution smartly. We will try to make the solution less manual and more
'scala'ble. He he... In this way, we can be familiar with the basics tool we
need to know from Scala to go forward! */

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine
import scala.math.pow
import scala.math.sqrt

/* Naive solution */

object Solution {

    def main(args: Array[String]) {
        val n = readLine().toInt
        val points = new ListBuffer[List[Double]]()
        
        for{
            i <- 0 to n-1
        } {
            points += readLine().split("\\s+").map(_.toDouble).toList
        }
        
        points += points(0)
        
        var perimeter: Double = 0
        
        for {
            i <- 0 to n-1
        } {
            perimeter += sqrt(pow(points(i)(0) - points(i+1)(0), 2) + pow(points(i)(1)  - points(i+1)(1), 2))
        }
        
        println(perimeter)
    }
}
