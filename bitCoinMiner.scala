import akka.actor._
import akka.routing.RoundRobinRouter
import akka.util.Duration
import akka.util.duration._
import scala.util.Random

import java.security.MessageDigest
 
object Btc  {

	def main(args: Array[String]) = {


		val compString = compBuffer.toString()  
	 
		sealed trait BtcMessage
		case object Calculate extends BtcMessage
		case class Work(start: Int, nrOfElements: Int,compString: String) extends BtcMessage
		case class Result(value: java.util.ArrayList[BitCoin]) extends BtcMessage
		case class BtcCalculationTime(duration: Duration)
		case class BtcCoins(hash: java.util.ArrayList[BitCoin])
		case class BitCoin(password:String,hash: String)

		class Worker extends Actor {
	
			def calculateBtc(start: Int, nrOfElements: Int,compString: String): java.util.ArrayList[BitCoin] = {

			}

			def receive = {
				case Work(start, nrOfElements,compString) =>
			}
		}
	 
		class Master(nrOfWorkers: Int, nrOfMessages: Int, nrOfElements: Int,compString:String, listener: ActorRef)
		extends Actor {

			def receive = {

				case Calculate =>

			}
		}

		class Listener extends Actor {
			def receive = {

				case BtcCoins(hashval) =>

				case BtcCalculationTime(duration) =>

			}
		}

		def calculate(nrOfWorkers: Int, nrOfElements: Int, nrOfMessages: Int,compString: String) {

		}
	}
}
