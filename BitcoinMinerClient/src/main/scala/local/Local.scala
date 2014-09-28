package local

import akka.actor._
import common._

case class RemoteDetail(remoteActorString : String)

  


object Local {

	def main(args: Array[String]) {

	}

}



class Worker extends Actor {
	
		def calculateBtc(start: Int, nrOfElements: Int,compString: String): java.util.ArrayList[BitCoin] = {

		}
 
		def receive = {

		}
	}
 
class LocalMaster(nrOfWorkers: Int, nrOfMessages: Int, nrOfElements: Int,compString:String, listener: ActorRef)
extends Actor {

	def receive = {

		case Calculate =>

		case Result(value) =>

	}
}



class LocalActor(masterIP: String , masterPort: String) extends Actor {

	// create the remote actor
	def receive = {
    	case RemoteDetail(remoteActorString) =>

		case Start =>

		case BindOK =>

		case Work(k,nrOfMessages, nrOfElements,compString,prefix) =>

		val LocalMaster = context.actorOf(Props(new LocalMaster(k, nrOfMessages, nrOfElements,compString, self)),name = "LocalMaster")

		LocalMaster ! Calculate

		case WorkResultRecieved =>

		case RemoteResult(hashval) =>

		case Message(msg) => 

		case _ =>

	}
}
