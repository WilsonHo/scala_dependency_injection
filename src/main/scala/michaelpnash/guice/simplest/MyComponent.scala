package michaelpnash.guice.simplest

import com.google.inject.Inject
import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
class MyComponent @Inject()(val service: AService) {
  def callTheService(): String = service.service
}