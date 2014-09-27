package remote

import akka.actor._
object HelloRemote {
	def main (args : Array[String]) {

	}
}

class Worker extends Actor {
		def calculateBtc(start: Int, nrOfElements: Int,compString: String): java.util.ArrayList[BitCoin] = {

		}

		def receive = {
			case WorkN(start, nrOfElements,compString) =>

		}
	}
 
	class Master(nrOfWorkers: Int, nrOfMessages: Int, nrOfElements: Int,compString:String, listener: ActorRef)
	extends Actor {
		def receive = {
			case Calculate =>
			case Result(value) =>
			case RemoteResult(value) =>
			case Start =>
			case BindRequest =>
			case RequestWork =>
   			case Message(msg) =>
		}
	}
 
	class Listener extends Actor {
		def receive = {
			case BtcCoins(hashval) =>
			case ShutdownMaster(message) =>
		}
	}
