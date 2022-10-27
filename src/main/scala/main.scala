import org.scalatest._

class myClass extends featurespec.AnyFeatureSpec with GivenWhenThen {
  info("As...")

  Feature("myfeature") {
    Scenario("myscenario") {
      Given("given...")
      When("when...")
      Then("then...")
      assert(1==1)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    run(new myClass)
  }
}
