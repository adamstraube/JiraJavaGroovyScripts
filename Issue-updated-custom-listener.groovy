// Issue updated custom listener script
//
// Used to stop notifications from changes to the labels field (still sends notifications for all other fields)
//
// Listener type: Fires an event when condition is true
// Events: Issue Updated


import org.apache.log4j.Logger
import org.apache.log4j.Level
 
//def log = Logger.getLogger("com.atlassian.testlistener")
//log.setLevel(Level.DEBUG)

changeItems.any {
    //log.debug "LISTENER_DEBUG: " + it.field
    it.field != 'labels'
}

