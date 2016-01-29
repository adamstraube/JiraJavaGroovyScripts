// Jira Scriptrunner Script
// 
// For generating a scripted custom field titled "Trimester"
// It shows what Trimester and year an issue was created in (According to Deakin University's Trimester Calendar)
// Each year needs to be added as a case statement with the relevant dates as the start and end dates change each year
// 
// Searcher: Exact Text Searcher (stats)
// Template: Text Field (multi-line)

import com.atlassian.core.util.DateUtils
import com.atlassian.jira.ComponentManager
import org.joda.time.DateTime
import org.joda.time.DateMidnight
import org.joda.time.LocalDate
import org.joda.time.format.*
 
timestamp = issue.getCreated()
 
DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S")
DateTime dtIssue1 = formatter.parseDateTime((String)timestamp)
LocalDate dtIssue = dtIssue1.toLocalDate();
    
def cal = Calendar.getInstance()
cal.setTime(new Date(timestamp.getTime()))
double year = cal.get(Calendar.YEAR);
double month = cal.get(Calendar.MONTH);
double day = cal.get(Calendar.DAY_OF_YEAR);
String trimesterString;
 
DateMidnight endT3d;
DateMidnight startT1d;
DateMidnight endT1d;
DateMidnight startT2d;
DateMidnight endT2d;
DateMidnight startT3d;
 
switch(year) {
  case 2012:  
 	startT1d = new DateMidnight((int)year, 3, 5);
 	endT1d = new DateMidnight((int)year, 6, 15);
    	startT2d = new DateMidnight((int)year, 7, 9);
 	endT2d = new DateMidnight((int)year, 10, 19);
 	startT3d = new DateMidnight((int)year, 11, 12);   
        
 
	LocalDate startT1 = startT1d.toLocalDate();
	LocalDate endT1 = endT1d.toLocalDate();
	LocalDate startT2 = startT2d.toLocalDate();
	LocalDate endT2 = endT2d.toLocalDate();
	LocalDate startT3 = startT3d.toLocalDate();
               
  	if ((startT1.isBefore(dtIssue)) && (endT1.isAfter(dtIssue)))
        {
  		trimesterString = 'T1-'+String.valueOf((int)year);
        	break;
        }
        else if ((startT2.isBefore(dtIssue)) && (endT2.isAfter(dtIssue)))
        {
  		trimesterString = 'T2-'+String.valueOf((int)year);
        	break;
        }
        else if (startT3.isBefore(dtIssue))
        {
  		trimesterString = 'T3-'+String.valueOf((int)year);
        	break;
        }
        else
        {
        	trimesterString = 'none';
     		break;
        }
  
  case 2013:
	endT3d = new DateMidnight((int)year, 2, 22);
   	startT1d = new DateMidnight((int)year, 3, 11);
 	endT1d = new DateMidnight((int)year, 6, 22);
    	startT2d = new DateMidnight((int)year, 7, 16);
 	endT2d = new DateMidnight((int)year, 10, 25);
 	startT3d = new DateMidnight((int)year, 11, 11);   
        
 
	LocalDate startT1 = startT1d.toLocalDate();
	LocalDate endT1 = endT1d.toLocalDate();
	LocalDate startT2 = startT2d.toLocalDate();
	LocalDate endT2 = endT2d.toLocalDate();
	LocalDate startT3 = startT3d.toLocalDate();
	LocalDate endT3 = endT3d.toLocalDate();
  
  
        if (endT3.isAfter(dtIssue))
        {
  		trimesterString = 'T3-2012';
        	break;
        }
  	else if ((startT1.isBefore(dtIssue)) && (endT1.isAfter(dtIssue)))
        {
  		trimesterString = 'T1-'+String.valueOf((int)year);
        	break;
        }
        else if ((startT2.isBefore(dtIssue)) && (endT2.isAfter(dtIssue)))
        {
  		trimesterString = 'T2-'+String.valueOf((int)year);
        	break;
        }
        else if (startT3.isBefore(dtIssue))
        {
  		trimesterString = 'T3-'+String.valueOf((int)year);
        	break;
        }
        else
        {
        	trimesterString = 'none';
     		break;
        }
        
  case 2014:
  	endT3d = new DateMidnight((int)year, 2, 21);
   	startT1d = new DateMidnight((int)year, 3, 10);
 	endT1d = new DateMidnight((int)year, 6, 20);
    	startT2d = new DateMidnight((int)year, 7, 14);
 	endT2d = new DateMidnight((int)year, 10, 24);
 	startT3d = new DateMidnight((int)year, 11, 10);   
        
 
	LocalDate startT1 = startT1d.toLocalDate();
	LocalDate endT1 = endT1d.toLocalDate();
	LocalDate startT2 = startT2d.toLocalDate();
	LocalDate endT2 = endT2d.toLocalDate();
	LocalDate startT3 = startT3d.toLocalDate();
	LocalDate endT3 = endT3d.toLocalDate();
  
  
        if (endT3.isAfter(dtIssue))
        {
			trimesterString = 'T3-2013';
        	break;
        }
  	else if ((startT1.isBefore(dtIssue)) && (endT1.isAfter(dtIssue)))
        {
  		trimesterString = 'T1-'+String.valueOf((int)year);
        	break;
        }
        else if ((startT2.isBefore(dtIssue)) && (endT2.isAfter(dtIssue)))
        {
  		trimesterString = 'T2-'+String.valueOf((int)year);
        	break;
        }
        else if (startT3.isBefore(dtIssue))
        {
  		trimesterString = 'T3-'+String.valueOf((int)year);
        	break;
        }
        else
        {
        	trimesterString = 'none';
     		break;
        }
        
  case 2015:
  
    endT3d = new DateMidnight((int)year, 2, 20);
   	startT1d = new DateMidnight((int)year, 3, 10);
 	endT1d = new DateMidnight((int)year, 6, 20);
    	startT2d = new DateMidnight((int)year, 7, 14);
 	endT2d = new DateMidnight((int)year, 10, 24);
 	startT3d = new DateMidnight((int)year, 11, 10);   
        
 
	LocalDate startT1 = startT1d.toLocalDate();
	LocalDate endT1 = endT1d.toLocalDate();
	LocalDate startT2 = startT2d.toLocalDate();
	LocalDate endT2 = endT2d.toLocalDate();
	LocalDate startT3 = startT3d.toLocalDate();
	LocalDate endT3 = endT3d.toLocalDate();
	
        if (endT3.isAfter(dtIssue))
        {
  		trimesterString = 'T3-2014';
        	break;
        }
  	else if ((startT1.isBefore(dtIssue)) && (endT1.isAfter(dtIssue)))
        {
  		trimesterString = 'T1-'+String.valueOf((int)year);
        	break;
        }
        else if ((startT2.isBefore(dtIssue)) && (endT2.isAfter(dtIssue)))
        {
  		trimesterString = 'T2-'+String.valueOf((int)year);
        	break;
        }
        else if (startT3.isBefore(dtIssue))
        {
  		trimesterString = 'T3-'+String.valueOf((int)year);
        	break;
        }
        else
        {
        	trimesterString = 'none';
     		break;
        }
        
        case 2016:
		
			endT3d = new DateMidnight((int)year, 2, 19);
 
			LocalDate endT3 = endT3d.toLocalDate();
		
        if (endT3.isAfter(dtIssue))
        {
  		trimesterString = 'T3-2015';
        	break;
        }
        else
        {
        	trimesterString = 'none';
     		break;
        }
 
}
return trimesterString
