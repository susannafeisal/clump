package io

import scala.concurrent.duration.Duration
package object getclump {
  
  private[getclump] implicit val executionContext = scala.concurrent.ExecutionContext.global

  private[getclump]type Promise[T] = scala.concurrent.Promise[T]
  private[getclump] val Promise = scala.concurrent.Promise

  private[getclump]type Future[+T] = scala.concurrent.Future[T]
  private[getclump] val Future = scala.concurrent.Future

  private[getclump] def blockOn[T](future: Future[T]) =
    scala.concurrent.Await.result(future, Duration.Inf)
}