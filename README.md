# JiraJavaGroovyScripts
#
#### Various Groovy Scripts for use in the Scriptrunner plugin on Atlassian JIRA

## Index
# Scripted Fields
- <b>Trimester-field-Deakin-Uni.groovy</b> For generating a scripted custom field titled "Trimester"
- <b>Hour-of-day.groovy</b> Extracts the created issue hour of the day and puts it in a number field. Allows easy querying in JQL by created hours (for example, issues created between 6pm and 9pm)
- <b>Day-of-week.groovy</b> Extracts the created issue day of the week and puts it in a text field. Allows easy querying in JQL by day name/number (for example, issues created between 2.Monday and 5.Thursday)
- <b>Month-of-year.groovy</b> Extracts the created issue month of the year and puts it in a text field. Allows easy querying in JQL by month name/number (for example, issues created on 2.February and 6.June) 

# Scripted Listners
- <b>Issue-updated-custom-listener.groovy</b> Used to stop notifications from changes to the labels field (still sends notifications for all other fields).
