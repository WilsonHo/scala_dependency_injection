package michaelpnash.guice.singleton

import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
object SingletonService extends AService {
  def service(): String = "singleton"
}
