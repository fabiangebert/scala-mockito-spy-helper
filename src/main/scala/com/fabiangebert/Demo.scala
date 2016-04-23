package com.fabiangebert

class Demo {

  def pythagoras(a: Double, b: Double) = {
    val cSquare = square(a) + square(b)
    val c = sqrt(cSquare)
    c
  }

  def square(num: Double) = {
    Math.pow(num, 2)
  }

  def sqrt(num: Double) = {
    Math.sqrt(num)
  }


}
