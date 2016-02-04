// Day of Week Scriptrunner script
//
// Allows easy searching by the day of the week in JQL and analystics
//
// Searcher: Numeric (stats)
// Template: Text Field (multi-line)

import com.atlassian.core.util.DateUtils
import com.atlassian.jira.datetime.LocalDate
import com.atlassian.jira.ComponentManager

timestamp = issue.getCreated()
    
def cal = Calendar.getInstance()
cal.setTime(new Date(timestamp.getTime()))
double weekday = cal.get(Calendar.DAY_OF_WEEK);
String weekdayName;

switch(weekday) {
  case 1:  weekdayName = '1.Sunday';  break;
  case 2:  weekdayName = '2.Monday';  break;
  case 3:  weekdayName = '3.Tuesday';  break;
  case 4:  weekdayName = '4.Wednesday';  break;
  case 5:  weekdayName = '5.Thursday';  break;
  case 6:  weekdayName = '6.Friday';  break;
  case 7:  weekdayName = '7.Saturday';  break;
}

return weekdayName
