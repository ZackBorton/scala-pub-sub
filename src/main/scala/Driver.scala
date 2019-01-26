package main.Driver

import org.apache.spark.{SparkContext, SparkConf}

object Driver {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("TestingSpark")
    val sc = new SparkContext(conf)
    println(s"Yup")
  }
}