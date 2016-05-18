import org.apache.log4j.Logger
import org.apache.log4j.Level
 
//def log = Logger.getLogger("com.atlassian.testlistener")
//log.setLevel(Level.DEBUG)

changeItems.any {
    //log.debug "LISTENER_DEBUG: " + it.field
    it.field != 'labels'
}

