package michaelpnash.guice

/**
  * Created by wilson on 3/29/17.
  */
object Utils {
  def assertEquals(st1: String, st2: String) = {
    if (st1 == st2) println(s"$st1 == $st2")
    else println(s"$st1 ## $st2")
  }

  def assertSame(obj1: AService, obj2: AService) =
  if (obj1 == obj2) println(s"$obj1 == $obj2")
  else println(s"$obj1 ## $obj2")

  def assertNotSame(obj1: AService, obj2: AService) =
    if (obj1 != obj2) println(s"$obj1 ## $obj2")
    else println(s"$obj1 == $obj2")

}
