package michaelpnash.guice.binding

import javax.inject.Named

import com.google.inject.Inject
import michaelpnash.guice.AService

/**
  * Created by wilson on 3/29/17.
  */
class MyBarComponent @Inject()(@Named("bar")service: AService) {
  def callTheService() =  service.service
}
