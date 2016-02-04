// Hour of Day Scriptrunner script
// 
// Allows easy searching by hour in JQL and analytics
//
// Searcher: Numeric (stats)
// Template: Number Field

import com.atlassian.core.util.DateUtils
import com.atlassian.jira.datetime.LocalDate
import com.atlassian.jira.ComponentManager

timestamp = issue.getCreated()
    
def cal = Calendar.getInstance()
cal.setTime(new Date(timestamp.getTime()))
double hour = cal.get(Calendar.HOUR_OF_DAY);

return hour
