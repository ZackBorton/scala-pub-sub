package main.Publish

object Pub {
  println("starting publishing service ..")
  val r = new RedisClient("localhost", 6379)
  val p = actorOf(new Publisher(r))
  p.start

  def publish(channel: String, message: String) = {
    p ! Publish(channel, message)
  }
}