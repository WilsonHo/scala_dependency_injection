package michaelpnash.guice.singleton

import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */

@com.google.inject.Singleton
class SingletonClassService extends AService {
  def service(): String = "singletonClass"
}