package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import SparkInstance._
import sparkSession.implicits._

class WindowTest extends AnyFunSuite with Matchers {
  val data = List(
    (1, "2019-01-02 15:30:00"),
    (1, "2019-01-02 15:30:30"),
    (1, "2019-01-02 15:31:00"),
    (1, "2019-01-02 15:31:50"),
    (1, "2019-01-02 15:31:55"),
    (2, "2019-01-02 15:33:00"),
    (2, "2019-01-02 15:35:20"),
    (2, "2019-01-02 15:37:00"),
    (3, "2019-01-02 15:30:30"),
    (3, "2019-01-02 15:31:00"),
    (3, "2019-01-02 15:31:50"),
    (3, "2019-01-02 15:31:55"),
    (3, "2019-01-02 15:33:00"),
    (3, "2019-01-02 15:35:20"),
    (3, "2019-01-02 15:37:00"),
    (3, "2019-01-02 15:40:00"),
    (3, "2019-01-02 15:45:00"),
    (3, "2019-01-02 15:46:00"),
    (3, "2019-01-02 15:47:30"),
    (3, "2019-01-02 15:48:00"),
    (3, "2019-01-02 15:48:10"),
    (3, "2019-01-02 15:48:20"),
    (3, "2019-01-02 15:48:30"),
    (3, "2019-01-02 15:50:00"),
    (3, "2019-01-02 15:53:00"),
    (3, "2019-01-02 15:54:30"),
    (3, "2019-01-02 15:55:00"),
    (4, "2019-01-02 15:50:30"),
    (4, "2019-01-02 15:52:00"),
    (4, "2019-01-02 15:50:30"),
    (4, "2019-01-02 15:52:00"),
    (4, "2019-01-02 15:50:30"),
    (4, "2019-01-02 15:52:00")
  )
  val dataframe = data.toDF("id", "datetime")

  test("tumbling") {

  }

  test("sliding") {

  }

  test("session") {

  }
}