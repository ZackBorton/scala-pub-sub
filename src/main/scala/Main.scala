import redis.RedisClient
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {
  implicit val akkaSystem = akka.actor.ActorSystem()

  val redis = RedisClient()

  val futurePong = redis.ping()
  futurePong.map(pong => {
  })
  Await.result(futurePong, 5 seconds)

  akkaSystem.shutdown()
}
