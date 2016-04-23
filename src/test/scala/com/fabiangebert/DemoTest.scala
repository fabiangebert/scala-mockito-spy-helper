package com.fabiangebert

import org.scalatest.{FlatSpec, Matchers}

class DemoTest extends FlatSpec with MockitoHelper with Matchers {

  behavior of "Demo"

  it should "correctly calculate pythagoras" in {

    //create spy (that is a mock that calls the original methods by default)
    val demoSpy = spy[Demo]
    //mock the "square" and "sqrt" methods. Usually you would do this for complex functions
    doReturn(5d).when(demoSpy).square(2d)
    doReturn(3d).when(demoSpy).sqrt(10d)

    //the pythagoras code will be called, but with the "square" and "sqrt" methods mocked (see above)
    demoSpy.pythagoras(2, 2) shouldBe 3
  }

}
