package michaelpnash.guice.singleton

import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
class NonSingletonService extends AService {
  def service(): String = "nonsingleton"
}