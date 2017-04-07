package michaelpnash.guice.instance

import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
class InstanceService1(val value: String) extends AService {
  def service(): String = value
}