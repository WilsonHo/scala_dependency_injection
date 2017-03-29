package michaelpnash.guice.interface

import com.google.inject.Inject
import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
trait SingletonComponentInterface {
  def callTheService: String
}

object SingletonComponent extends SingletonComponentInterface {
  @Inject val service: AService = null

  def callTheService(): String = service.service
}
