package michaelpnash.guice.instance

import com.google.inject.Inject
import michaelpnash.guice.AService

/**
  * Created by wilson on 4/1/17.
  */
class MyComponent @Inject()(val service: AService) {
  def callTheService(): String = service.service
}