import org.scalatest.AsyncWordSpec

import monix.execution.ExecutionModel.AlwaysAsyncExecution
import monix.execution.Scheduler
import monix.eval._
import monix.reactive._
import scala.concurrent.duration._

class TestSpec extends AsyncWordSpec {
  implicit val ec = Scheduler.trampoline(executionModel = AlwaysAsyncExecution)
  val task = Task(1)

  "A task" should {
    "execute fine" in {
		(for {
        _ <- task.map(println)
		} yield succeed).runToFuture
    }
    "execute fine when delayed" in {
		(for {
        _ <- task.delayExecution(200.millis).map(println)
		} yield succeed).runToFuture
	}
  }
}
