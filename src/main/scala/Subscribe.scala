package main.Subscribe

object Sub {
  println("starting subscription service ..")
  val redis = new RedisClient("localhost", 6379)
  val s = actorOf(new Subscriber(r))
  s.start
  s ! Register(callback)

  def sub(channels: String*) = {
    s ! Subscribe(channels.toArray)
  }

  def unsub(channels: String*) = {
    s ! Unsubscribe(channels.toArray)
  }

  def callback(pubsub: PubSubMessage) = pubsub match {
  }
}